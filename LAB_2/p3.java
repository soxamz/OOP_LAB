// Aim of the program :Write a class file – box with three data members(length, width,
// height) and a method volume() . Also implement the application class Demo
// where an object of the box class is created with user entered dimensions and
// volume is printed.
// Input: length,width and height.
// Output: Volume

package LAB_2;

public class p3 {
    int length;
    int width;
    int height;

    // Method to calculate volume
    int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        p3 box = new p3();

        // Assuming user entered dimensions
        box.length = 5;
        box.width = 4;
        box.height = 3;

        int vol = box.volume();
        System.out.println("Volume of the box: " + vol);
    }
}
