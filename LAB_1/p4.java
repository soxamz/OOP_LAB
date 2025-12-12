// Aim of the program : Program to check a user entered number is palindrome or not
// Input: Mention the number in the program
// Output: display the number is Palindrome or not.

public class p4 {
    public static void main(String[] args) {
        int num = 121; // You can change this number to test other cases
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }
    }
}
