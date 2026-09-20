class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backTrack(nums,0,sub,res);
        return res;
    }

    private void backTrack(int[] nums, int i, List<Integer> sub, List<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        backTrack(nums, i+1, sub, res);
        sub.remove(sub.size()-1);
        backTrack(nums, i+1, sub, res);
    }
}
