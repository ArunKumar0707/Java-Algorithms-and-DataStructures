package dsa.strings;

public class LongestCommonPrefix {
    static void main() {
        String[] strs = {"flower","flow","flight"};
        System.out.println("The Longest Common Prefix of 1st test case is "+longestCommonPrefix(strs));
        strs = new String[]{"rapid", "rapid", "rapid" , "rapid"};
        System.out.println("The Longest Common Prefix of 2nd test case is "+longestCommonPrefix(strs));
        strs = new String[]{"dog", "cat", "human"};
        System.out.println("The Longest Common Prefix of 3rd test case is "+longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length ; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
