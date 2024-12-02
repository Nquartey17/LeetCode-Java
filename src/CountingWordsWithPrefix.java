public class CountingWordsWithPrefix {
    public static int prefixCount(String[] words, String pref) {
        //keyword is prefix, remember to use starts with instead of contains
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"leetcode","win","loops","success"};
        System.out.println(prefixCount(words, "code"));
    }
}
