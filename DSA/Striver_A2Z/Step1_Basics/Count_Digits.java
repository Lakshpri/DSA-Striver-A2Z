public class Count_Digits {

    public static void main(String[] args) {

        int n = 12345; // change to test other numbers
        int count = 0;
        int temp = n;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        System.out.println("Number of digits in " + n + " = " + count);
    }
}
