//Leet code problem no. 14 (Array)
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Sample Input: strs = ["flower","flow","flight"]
// Sample Output: "fl"
import java.util.Arrays;
public class Arrays_Prob_14 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String string1= strs[0];
        String string2= strs[strs.length-1];
        StringBuilder FinalStr = new StringBuilder();

        for(int i=0; i<string1.length() && i<string2.length(); i++){
            if(string1.charAt(i)!=string2.charAt(i)){
                break;
            }
            FinalStr.append(string1.charAt(i));
        }
        return FinalStr.toString();

    }
    //Main Method
    public static void main(String[]args){

        String strs1[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));

        String strs2[] = {"rohit","mohit","sohit"};
        System.out.println(longestCommonPrefix(strs2));

        String strs3[] = {"Abhilesh","Abhishek","Abhinav"};
        System.out.println(longestCommonPrefix(strs3));
    }
}
