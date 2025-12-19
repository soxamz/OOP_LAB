// Aim of the program: Program to find no. of objects created out of a class using ‘static’ modifier.
// Input: No of objects created
// Output: Display the number of objects created (e.g. no of objects=3)

package LAB_2;

public class p2 {
    static int objectCount = 0;

    public p2() {
        objectCount++;
    }

    public static void main(String[] args) {
        p2 obj1 = new p2();
        p2 obj2 = new p2();
        p2 obj3 = new p2();

        System.out.println("Number of objects created: " + objectCount);
    }
}