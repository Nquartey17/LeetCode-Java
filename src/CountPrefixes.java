public class CountPrefixes {
    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String str : words) {
            if (s.startsWith(str)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"a","a"};
        System.out.println(countPrefixes(words, "aa"));
    }
}
