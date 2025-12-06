public class Print_all_Divisors {

    public static void main(String[] args) {

        int n = 36; // change to test other numbers

        System.out.println("Divisors of " + n + ":");

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // i is a divisor
                System.out.print(i + " ");

                // paired divisor: n / i (avoid duplicates)
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
