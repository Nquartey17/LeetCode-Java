import java.util.*;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        //Create hashmap for numbers and letters
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        //return empty array if no value input
        if (digits.equals("")) {
            return ans;
        }

        //idea: Cycle through chars at end until the done. then move to next char
        char lastChar = digits.charAt(digits.length() - 1);

        //add to ans and return all combinations

        return ans;
    }

    public static void main(String[] args) {
        //[2,3,4]
        //[adg,adh,adi,aeg,aeh,aei,afg,afh,afi]

    }
}
