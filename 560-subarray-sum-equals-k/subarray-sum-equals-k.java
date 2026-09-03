class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0, res =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(sum,1);
        for(int val : nums){
            sum+=val;

            if(map.containsKey(sum-k)){
                res+= map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}