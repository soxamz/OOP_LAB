// Aim of the program: Write a program to print the corresponding grade for the given
// mark using if..else statement in Java
// Input: Mention the grade in the program
// Output: Display the Grade either O/E/A/B/C

public class p2 {
    public static void main(String[] args) {
        // Declaring variable for grade
        char grade = 'A';

        // Using if..else statements to determine and print the corresponding grade
        if (grade == 'O') {
            System.out.println("Outstanding");
        } else if (grade == 'E') {
            System.out.println("Excellent");
        } else if (grade == 'A') {
            System.out.println("Very Good");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C') {
            System.out.println("Average");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
