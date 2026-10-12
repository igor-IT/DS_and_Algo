class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int s: stones){
            q.offer(s);
        }

        while(q.size() > 1){
            int x = q.poll();
            int y = q.poll();

            if(x > y){
                q.offer(x - y);
            }
        }
        q.offer(0);
        return q.poll();
    }
}
