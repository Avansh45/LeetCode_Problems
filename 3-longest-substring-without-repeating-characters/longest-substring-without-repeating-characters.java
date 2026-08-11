class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int i=0,j=0,len = 0;
        while(j<s.length()){
            char right = s.charAt(j);
            map.put(right, map.getOrDefault(right,0)+1);

            while(map.get(right)>1){
                char left = s.charAt(i);
                map.put(left,map.getOrDefault(left,0)-1);

                if(map.get(left)<=0){
                    map.remove(left);
                }
                i++;
            }
            len = Math.max(len,(j-i+1));
            j++;
        }
        return len;
    }
}