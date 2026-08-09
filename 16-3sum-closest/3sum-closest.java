class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, result=0;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1, right = nums.length-1;
            while(left<right){

                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(diff < min){
                    result = sum;
                    min = diff;
                }
                if(sum==target) return target;
                else if(sum<target) left++;
                else right--;

            }
        }
        return result;
    }
}