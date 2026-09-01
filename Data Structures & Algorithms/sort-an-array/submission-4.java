class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length -1);
        return nums;
    }

    private void sort(int[] nums, int low, int hight){
        if(low < hight){
        int partition = partition(nums, low, hight);
        sort(nums, low, partition - 1);
        sort(nums, partition + 1, hight);
        }
    }

    private int partition(int[] nums, int start, int end){

        int pivot = nums[end];

        int i = start -1;

        for(int j = start; j < end; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i , j);
            }
        }
        swap(nums, i+1, end);

        return i+1;
    }

    private void swap(int[] nums, int i , int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
     }
}