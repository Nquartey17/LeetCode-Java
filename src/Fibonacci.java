public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1 ) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = second;
            second = first + temp;
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
