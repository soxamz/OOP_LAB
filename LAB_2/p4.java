// Aim of the program : Write a program in Java to create a class Rectangle having data
// members length and breadth and three methods called read, calculate and display to read the
// values of length and breadth, calculate the area and perimeter of the rectangle and display the
// result respectively.

package LAB_2;

public class p4 {
    int length;
    int breadth;

    // Method to read length and breadth
    void read(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display area and perimeter
    void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        p4 rectangle = new p4();
        
        // Assuming user entered values
        rectangle.read(5, 3);
        
        rectangle.display();
    }
}
