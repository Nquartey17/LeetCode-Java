import java.util.*;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        //Create hashmap for numbers and letters
        //Consider using a hashset to avoid duplicates
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

        if (digits.length() == 1) {
            String letter = map.get(digits.charAt(0));
            //letters = abc
            for (int i = 0; i < letter.length(); i++) {
                ans.add(String.valueOf(letter.charAt(i)));
            }
        }

        //idea: recursive method using previous change

        //step 1: get the starting letters into string
        StringBuilder strLetters = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            String letter = map.get(digits.charAt(i));
            strLetters.append(letter.charAt(0));
        }

        HashSet<String> set = new HashSet<>();

        //step 2: cycle through last letters, add them to ans array
        //The idea for this is getting somewhere but I need to make adjustments
        for (int i = digits.length() - 1; i >= 0; i--) {
            String lastNumLetters = map.get(digits.charAt(digits.length()-1)); //last letters
                for (int j = 0; j < lastNumLetters.length();j++) { //cycling through last letters
                    strLetters.setCharAt(i, lastNumLetters.charAt(j));
                    set.add(String.valueOf(strLetters));
                }
        }

        //step 3: reuse previous inputs and cycle through letters unchanged

        //add to ans and return all combinations

        return ans;
    }

    public static void main(String[] args) {

        //[2,3,4,5]
        //[adgj,adgk,adgl
        //[adhj,adhk,adhl
        //[adij,adik,adil
        //[aegj,aegk,aegl
        //[aehj,aehk,aehl
        //[aeij,aeik,aeil
        //[afgj,afgk,afgl
        //[afhj,afhk,afhl
        //[afij,afik,afil

        //[bdgj,bdgk,bdgl
        //[bdhj,bdhk,bdhl
        //[bdij,bdik,bdil
        //[begj,begk,begl
        //[behj,behk,behl
        //[beij,beik,beil
        //[bfgj,bfgk,bfgl
        //[bfhj,bfhk,bfhl
        //[bfij,bfik,bfil

        //[cdgj,cdgk,cdgl
        //[cdhj,cdhk,cdhl
        //[cdij,cdik,cdil
        //[cegj,cegk,cegl
        //[cehj,cehk,cehl
        //[ceij,ceik,ceil
        //[cfgj,cfgk,cfgl
        //[cfhj,cfhk,cfhl
        //[cfij,cfik,cfil

        letterCombinations("2345");

    }
}
