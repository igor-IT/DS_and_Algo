class KthLargest {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int l;

    public KthLargest(int k, int[] nums) {
        l = k;
        for(int n: nums){
            q.offer(n);
            if(q.size() > l){
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size() > l){
            q.poll();
        }
        return q.peek();
    }
}
