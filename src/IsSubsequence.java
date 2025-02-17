public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        //don't use contains because it might not be in order
        //Avoid nested for loop
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
