class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0)return 0;
        for(int i: nums){
            set.add(i);
        }

        int length = 0;
        int res = 1;
        for(int n: set){
            if(!set.contains(n-1)){
                length++;
                while(set.contains(n + length)){
                    length++;
                    res = Math.max(res, length);
                }
            }
            length = 0;
        }

        return res;
    }
}
