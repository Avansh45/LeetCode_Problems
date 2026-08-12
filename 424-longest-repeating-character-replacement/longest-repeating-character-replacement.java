class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,len=0;
        int maxVal =0,maxWindow=0;
        int[] arr = new int[26];
        int diff =0;
        while(j<s.length()){
            arr[s.charAt(j)-'A']++;
            len = j-i+1;
            maxVal = Math.max(arr[s.charAt(j)-'A'],maxVal);
            diff = len-maxVal;

            while(diff>k){
                arr[s.charAt(i)-'A']--;
                i++;
                len = j-i+1;
                diff = len-maxVal;
            }
            maxWindow = Math.max(maxWindow,j-i+1);
            j++;
        }
        return maxWindow;
    }
}