
public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        //Idea: get indexes with first letter and check the following letters until needle length

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                //check letters up to needle length
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }
}
