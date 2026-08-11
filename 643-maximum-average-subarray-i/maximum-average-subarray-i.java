class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double Avg =0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+= nums[i];
        }
        Avg = sum/k;

        int i=0, j=k;
        while(j<nums.length){
           sum= sum+ nums[j]-nums[i];
           double currAvg = sum/k;
            i++;
            j++;

            if(currAvg>Avg){
                Avg = currAvg;
            }
        }
        return Avg;
    }
}