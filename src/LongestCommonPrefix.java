import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder strBuild = new StringBuilder();
        int shortestStrLength = Integer.MAX_VALUE;
        int shortestWordIndex = 0;
        //Get position and length of shortest word in list
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestStrLength) {
                shortestStrLength = strs[i].length();
                shortestWordIndex = i;
            }
        }

        int[] freqArray = new int[26];
        //Traverse through the shortest word letters
        for (int i = 0; i < strs[shortestWordIndex].length(); i++) {
            //Get the number count of letter in every position
            for (String str : strs) {
                freqArray[str.charAt(i) - 'a']++;
            }
            //the letter count should be the same as list length to add to strBuild
            if (freqArray[strs[shortestWordIndex].charAt(i) -'a'] == strs.length) {
                strBuild.append(strs[shortestWordIndex].charAt(i));
                //reset all array elements to 0
                Arrays.fill(freqArray, 0);
            }
            else {
                return strBuild.toString();
            }
        }
        return strBuild.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aa","aa"}));
    }
}
