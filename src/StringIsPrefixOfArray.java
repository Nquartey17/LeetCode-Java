public class StringIsPrefixOfArray {
    public static boolean isPrefixString(String s, String[] words) {
        //remember this is a prefix so the first word in words has to match string
        StringBuilder strBuild = new StringBuilder();
        //check first word in string
        if (!s.startsWith(words[0])) {
            return false;
        }
        strBuild.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (s.contains(words[i])) {
                strBuild.append(words[i]);
                if (strBuild.toString().equals(s)) {
                    return true;
                }
            } else {
                return strBuild.toString().equals(s);
            }
        }
        return strBuild.toString().equals(s);
    }

    public static void main(String[] args) {
        String[] words = new String[]{"a","a","a","a","a","a","a"};
        System.out.println(isPrefixString("aaaaaaa",words));
    }
}
