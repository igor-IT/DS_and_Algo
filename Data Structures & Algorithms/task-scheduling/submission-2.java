class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] task = new int[26];
        int maxF = 0;

        for(char t: tasks){
            task[t - 'A']++;
            maxF = Math.max(maxF, task[t - 'A']);
        }

        int countMaxF = 0;
        for(int t: task){
            if(t == maxF){
                countMaxF++;
            }
        }

        int res = (maxF - 1) * (n + 1) + countMaxF;
        return Math.max(res, tasks.length);
    }
}
