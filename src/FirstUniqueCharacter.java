public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        // Check if character appears in any part of the list
        int[] frequencyArray = new int[26];
        char[] array = s.toCharArray();
        for (char c : array) {
            frequencyArray[c - 'a']++;
        }

        for (int i = 0; i < array.length; i++) {
            if (frequencyArray[array[i]-'a']==1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
