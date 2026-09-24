class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =0;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans =Integer.MAX_VALUE;

        while(low <= high){

            int mid = low+ ((high-low) /2 );
            int totalHours = totalHoursEating(piles, mid);

            if(totalHours <= h){

                ans = Math.min(ans, mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    int totalHoursEating(int[] nums, int hourly){
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total+= Math.ceil((double)nums[i] / (double)hourly);
        }
        return total;
    }
}