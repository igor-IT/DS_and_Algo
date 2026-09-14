class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int card1 = 0;
        int count1 = 0;
        int card2 = 0;
        int count2 = 0;

        for(int n: nums){
            if(n == card1){
                count1++;
            }else if(card2 == n){
                count2++;
            } else if(count1 == 0){
                card1 = n;
                count1 = 1;
            }else if(count2 == 0){
                card2 = n;
                count2 = 1;
            }else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int n: nums){
            if(n == card1){
                count1++;
            }else if(n == card2){
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();

        if(count1 > nums.length / 3){
            res.add(card1);
        }
        if(count2 > nums.length / 3){
            res.add(card2);
        }
        return res;
    }
}