import java.util.ArrayList;
import java.util.Iterator;

public class CountAndSay {

    //start using method with 11 values, 1 will always be the last number
    public static String pairCount(String str) {
        StringBuilder strBuild = new StringBuilder();
        char ch = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count = count + 1;
            } else {
                //Add count and number to StringBuilder
                strBuild.append(count);
                strBuild.append(ch);
                //reset values
                ch = str.charAt(i);
                count = 1;
            }
        }
        //add the last count and number, then return
        strBuild.append(count);
        strBuild.append(ch);
        return strBuild.toString();
    }

    public static String countAndSay(int n) {
        //make this method recursive
        String str = "1";
        for (int i = 0; i < n-1; i++) {
            str = pairCount(str);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(2));
    }
}
