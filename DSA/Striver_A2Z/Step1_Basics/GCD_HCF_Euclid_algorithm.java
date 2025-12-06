public class GCD_HCF_Euclid_algorithm {

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + originalA + " and " + originalB + " = " + a);
    }
}
