class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }

        int i=0;
        for(int j=0;j<s2.length();j++){
            char ch = s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch,0)+1);

            while(j-i+1==s1.length()){
            if(map1.equals(map2)) return true;

                map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)-1);
                if(map2.get(s2.charAt(i))<=0) map2.remove(s2.charAt(i));
                i++;
            }
        }
        return false;
    }
}