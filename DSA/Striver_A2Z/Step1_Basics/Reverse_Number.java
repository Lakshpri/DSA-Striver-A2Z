public class Reverse_Number {

    public static void main(String[] args) {

        int n = 12345; // change to test other numbers
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }

        System.out.println("Reversed number of " + original + " = " + reversed);
    }
}
