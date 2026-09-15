class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();

       int count = 0;
       int currSum = 0;
       map.put(0,1);

       for(int n: nums){
        currSum+=n;

        if(map.containsKey(currSum - k)){
            count+= map.get(currSum - k);
        }

        map.put(currSum, map.getOrDefault(currSum,0)+1);
       }

       return count;
    }
}