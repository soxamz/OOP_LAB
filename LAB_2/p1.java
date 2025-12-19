// Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
// Input: Enter 10 number from keyboard
// Output: Display number of even and odd number

package LAB_2;

public class p1 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        // Loop through each argument passed from command line
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]); // Convert string to integer

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the counts of even and odd numbers
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
