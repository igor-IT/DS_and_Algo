class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0;
        int r = row * col -1;

        while(l <= r){
            int mid = l + (r-l) / 2;

            int rp = mid / col;
            int cp = mid % col;

            if(matrix[rp][cp] == target){
                return true;
            }else if(matrix[rp][cp] < target){
                l = mid + 1;
            }else if(matrix[rp][cp] > target){
                r = mid -1;
            }
        }
        return false;
    }
}
