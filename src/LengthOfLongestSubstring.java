import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        String [] array = s.split("");
        int maxLength = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                maxLength = Math.max(maxLength, set.size());
                set.clear();
                set.add(array[i]);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwwkew"));
    }
}
