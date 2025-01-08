import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        //add first row
        input.add(1);
        ans.add(input);

        for (int i = 1; i < numRows;i++) {
            List<Integer> previousRow = ans.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            //first and last elements are always 1
            currentRow.add(1);
            for (int j = 1; j<i; j++) {
                currentRow.add(previousRow.get(j-1) + previousRow.get(j));
            }
            currentRow.add(1);
            ans.add(currentRow);
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(generate(3));
    }
}
