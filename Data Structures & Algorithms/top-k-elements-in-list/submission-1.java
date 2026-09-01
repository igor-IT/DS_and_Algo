class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] buffer = new List[nums.length + 1];

        for(int i = 0; i < buffer.length; i++){
            buffer[i] = new ArrayList<>();
        }

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            buffer[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];

        int j = 0;

        for(int b = buffer.length -1; b > 0 && j < k; b--){
            for(int c: buffer[b]){
                res[j] = c;
                j++;
                if(j == k){
                    return res;
                }
            }
        }
        return res;
    }
}
