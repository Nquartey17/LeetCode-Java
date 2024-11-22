import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowel {
    public static String reverseVowels(String s) {
        StringBuilder strCopy = new StringBuilder(s);
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e', 'i','o','u','A','E','I','O','U'));
        int start = 0; //first letter
        int end = s.length() - 1; //last letter
        while (start < end) {
            if (vowels.contains(s.charAt(start))) {
                if (vowels.contains(s.charAt(end))) {
                    char temp = strCopy.charAt(start); //I
                    strCopy.setCharAt(start, s.charAt(end));
                    strCopy.setCharAt(end, temp);
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return strCopy.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
