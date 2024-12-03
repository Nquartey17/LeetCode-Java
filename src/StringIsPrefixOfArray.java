public class StringIsPrefixOfArray {
    public static boolean isPrefixString(String s, String[] words) {
        //remember this is a prefix so the first word in words has to match string
        StringBuilder strBuild = new StringBuilder();

        for (String word : words) {
            strBuild.append(word);

            if (s.contentEquals(strBuild)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"a","a","a","a","a","a","a"};
        System.out.println(isPrefixString("aaaaaaa",words));
    }
}
