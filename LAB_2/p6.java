// Aim of the program : Write a program to overload subtract method with various
// parameters in a class in Java. Write the driver class to use the different subtract methods
// using object.

// Input: Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly

package LAB_2;

public class p6 {
    // Subtract method with two integer parameters
    int subtract(int a, int b) {
        return a - b;
    }

    // Subtract method with three integer parameters
    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract method with two double parameters
    double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        p6 obj = new p6();

        // Using subtract method with two integers
        int result1 = obj.subtract(10, 5);
        System.out.println("Subtracting two integers: " + result1);

        // Using subtract method with three integers
        int result2 = obj.subtract(20, 5, 3);
        System.out.println("Subtracting three integers: " + result2);

        // Using subtract method with two doubles
        double result3 = obj.subtract(15.5, 5.5);
        System.out.println("Subtracting two doubles: " + result3);
    }
}
