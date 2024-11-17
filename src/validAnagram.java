
public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //contains all letters in alphabet
        int[] ch_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // 'a' is 26 in this case so this will give the index count by subtracting the letter
            // Add one for s list, subtract one for t list. Total should be 0 for all, false if not
            ch_count[s.charAt(i)-'a']++;
            ch_count[t.charAt(i)-'a']--;
        }

        for (int count : ch_count) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
