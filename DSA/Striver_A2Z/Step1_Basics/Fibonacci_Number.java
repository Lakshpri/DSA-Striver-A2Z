public class Fibonacci_Number {

    public static void main(String[] args) {

        int n = 10; // change to get nth Fibonacci
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        System.out.println("Fibonacci number at position " + n + " = " + fib);
    }
}
