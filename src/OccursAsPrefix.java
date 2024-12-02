public class OccursAsPrefix {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        //return word position number, all lowercase
        String[] words = sentence.split(" "); //words to array
        for (int i = 0; i < words.length; i++) {
            //contains doesn't work here because we're trying to find the word, not string contained in word
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("hellohello hellohellohello", "ell"));
    }
}
