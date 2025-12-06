public class Armstrong_Numbers {

    public static void main(String[] args) {

        int n = 153; // you can change the number
        int original = n;

        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;

        
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= lastDigit;
            }

            sum += power;
            temp /= 10;
        }

        
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }
}
