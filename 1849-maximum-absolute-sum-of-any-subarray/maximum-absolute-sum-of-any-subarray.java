class Solution {
    public int maxAbsoluteSum(int[] nums) {

        if(nums.length==1) return Math.abs(nums[0]);

        int curMax = nums[0];
        int curMin = nums[0];
        int maxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            curMax = Math.max(nums[i], nums[i]+curMax);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(nums[i], nums[i]+curMin);
            minSum = Math.min(minSum, curMin);

            res = Math.max(res, Math.max(maxSum, Math.abs(minSum)));
            
        }
        return res;
    }
}