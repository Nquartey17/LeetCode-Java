import java.util.HashSet;

//Characters don't have to be in order
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                maxLength = Math.max(maxLength, set.size());
                set.clear();
                set.add(s.charAt(i));
            }
        }
        //last check in case all characters are unique
        maxLength = Math.max(maxLength, set.size());
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
