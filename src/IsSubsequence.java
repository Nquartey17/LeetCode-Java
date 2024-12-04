public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        //don't use contains because it might not be in order
        //Avoid nested for loop
        StringBuilder strBuild = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                strBuild.append(s.charAt(i));
                i++;
                j++;
            } else {
                j++;
            }
        }

        return strBuild.toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
