public class Check_Palindrome {

    public static void main(String[] args) {

        int n = 121; // change to test other numbers
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }

        if (reversed == original) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is NOT a Palindrome Number");
        }
    }
}
