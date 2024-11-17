public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String copyStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder strBuild = new StringBuilder(copyStr);
        String reverse = strBuild.reverse().toString();

        return reverse.equals(copyStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
