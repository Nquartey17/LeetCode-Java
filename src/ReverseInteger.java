public class ReverseInteger {
    public static int reverse(int x) {

        long ans = 0;
        while(x != 0) {
            int remainder = x % 10;
            ans = (ans * 10) + remainder;
            x = x /10;
        }

        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
