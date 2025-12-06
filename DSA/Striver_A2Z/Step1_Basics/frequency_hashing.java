public class frequency_hashing {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 4, 2, 3, 3}; // sample input

        // Step 1: Create frequency array
        int maxValue = 10; // assume values in array are < 10
        int[] freq = new int[maxValue];

        // Step 2: Count frequencies
        for (int num : arr) {
            freq[num]++;
        }

        // Step 3: Print frequencies
        System.out.println("Frequency of each number:");
        for (int i = 0; i < maxValue; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i] + " times");
            }
        }
    }
}
