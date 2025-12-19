// Aim of the program : Write a program in java using constructor overloading concept to
// calculate the area of a rectangle having data member as length and breadth. Use default
// constructor to initialize the value of the data member to zero and parameterized
// constructor to initialize the value of data member according to the user input.

// Input: Mention the value of length and breadth
// Output: Display the area of rectangle accordingly.

package LAB_2;

public class p7 {
    int length;
    int breadth;

    // Default constructor
    public p7() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public p7(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Using default constructor
        p7 rectangle1 = new p7();
        System.out.println("Area of rectangle with default dimensions: " + rectangle1.area());

        // Using parameterized constructor
        p7 rectangle2 = new p7(5, 3);
        System.out.println("Area of rectangle with length 5 and breadth 3: " + rectangle2.area());
    }
}
