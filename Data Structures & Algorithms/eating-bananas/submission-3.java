class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = 0;
        int max = 0;

        for(int p: piles){
            max = Math.max(max,p);
        }

        res = max;

        int l = 0;
        int r = max;

        while(l <= r){
            int mid = l+(r-l) / 2;
            if(canEat(piles,mid,h)){
                res = mid;
                r = mid -1;
            } else {
                l = mid +1;
            }
        }
        return res;
    }

    private boolean canEat(int[]piles, int mid, int h){
        int currT = 0;
        for(int p: piles){
            currT += Math.ceil((double) p / mid);
        }
        return currT <= h;
    }
}
