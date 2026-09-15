class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        
        Map<Integer,Integer> remainderMap = new HashMap<>();
        remainderMap.put(sum,1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int remainder = sum % k;
            if(remainder<0)
                remainder = remainder+ k;
            if(remainderMap.containsKey(remainder)){
                res+= remainderMap.get(remainder);
            }
            
            remainderMap.put(remainder,remainderMap.getOrDefault(remainder,0)+1);
            
        }
        return res;
    }
}