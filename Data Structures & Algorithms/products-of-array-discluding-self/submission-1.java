class Solution {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];

        int prefix = 1;

        for(int i = 0; i < nums.length; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }

        int sufix = 1;

        for(int i = nums.length - 1; i >=0 ; i--){
            res[i] *= sufix;
            sufix *= nums[i];
        }
        return res;
    }
}  
