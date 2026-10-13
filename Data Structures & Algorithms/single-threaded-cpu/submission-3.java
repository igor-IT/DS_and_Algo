class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;
        int[][] exTasks = new int[n][3];

        for(int i =0; i < n; i++){
            exTasks[i][0] = tasks[i][0];
            exTasks[i][1] = tasks[i][1];
            exTasks[i][2] = i;
        }

        Arrays.sort(exTasks, (a,b)-> Integer.compare(a[0],b[0]));

        PriorityQueue<int[]> q = new PriorityQueue<>(
            (a,b) -> {
                if(a[1] == b[1]){
                    return Integer.compare(a[2],b[2]);
                }else {
                    return Integer.compare(a[1],b[1]);
                }
            }
        );

        int index = 0;
        int time = 0;
        int resIndex = 0;
        int [] res = new int[n];

        while(index < n || !q.isEmpty()){
            if(index < n && time < exTasks[index][0]){
                time = exTasks[index][0];
            }


            while(index < n && exTasks[index][0] <= time){
                q.offer(exTasks[index]);
                index++;
            }


            int[] r = q.poll();
            time += r[1];
            res[resIndex++] = r[2];
        }
        return res;
        
    }
}