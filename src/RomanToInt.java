import java.util.HashMap;

public class RomanToInt {

    public static int romanToInt(String s) {
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000

    //I can be placed before V (5) and X (10) to make 4 and 9.
    //X can be placed before L (50) and C (100) to make 40 and 90.
    //C can be placed before D (500) and M (1000) to make 400 and 900.
        HashMap<Character,Integer> map =new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I') {
                if (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') {
                    sum -= map.get('I');
                }
                else {
                    sum += map.get('I');
                }
            }

            else if (s.charAt(i) == 'X') {
                if (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C') {
                    sum -= map.get('X');
                }
                else {
                    sum += map.get('X');
                }
            }

            else if (s.charAt(i) == 'C') {
                if (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M') {
                    sum -= map.get('C');
                }
                else {
                    sum += map.get('C');
                }
            }

            else {
                sum += map.get(s.charAt(i));
            }
        }
        //add last character
        sum += map.get(s.charAt(s.length() - 1));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
