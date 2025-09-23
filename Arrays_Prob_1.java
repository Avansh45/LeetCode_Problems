// Problem Statement:  Arrays Problem Number 1
/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.*/


import java.util.Arrays;
public class Arrays_Prob_1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            }
            
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[]res = twoSum(new int[]{1,2,3,4,5,6},11);
        System.out.println(Arrays.toString(res));
    }
}