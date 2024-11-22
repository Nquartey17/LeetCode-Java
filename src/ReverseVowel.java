import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowel {
    public static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e', 'i','o','u','A','E','I','O','U'));
        char[] array = s.toCharArray();
        int start = 0; //first letter
        int end = s.length() - 1; //last letter
        while (start < end) {
            if (vowels.contains(array[start]) && vowels.contains(array[end])) {
               char temp = array[start];
               array[start] = array[end];
               array[end] = temp;
               start++;
               end--;
            } else if (!vowels.contains(array[start])) {
                start++;
            } else {
                end--;
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
