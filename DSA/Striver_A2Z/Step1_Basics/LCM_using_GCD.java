public class LCM_using_GCD {

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }

    // Euclid's Algorithm for GCD
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
