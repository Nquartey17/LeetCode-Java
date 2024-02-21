public class HappyNumber {
    public static int sqrt(int num) {
        int sum = 0;
        while (num > 0) {
            int singleDigit = num % 10;
            sum = sum + (int)Math.pow(singleDigit, 2);
            num /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        for (int i = 0; i < 70; i++) {
            n = sqrt(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
