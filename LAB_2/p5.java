// Aim of the program : Write a program in java to input and display the details of n number
// of students having roll, name and cgpa as data members. Also display the name of the
// student having lowest cgpa.

// Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
// Output: Display the details of ‘n’ number of students. Also display the name of

// student with lowest cgpa

package LAB_2;

public class p5 {
    int roll;
    String name;
    float cgpa;

    // Method to read student details
    void read(int r, String n, float c) {
        roll = r;
        name = n;
        cgpa = c;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        int n = 3; // Number of students
        p5[] students = new p5[n];

        // Sample data for students
        int[] rolls = {101, 102, 103};
        String[] names = {"Alice", "Bob", "Charlie"};
        float[] cgpas = {8.5f, 7.2f, 9.1f};

        // Reading student details
        for (int i = 0; i < n; i++) {
            students[i] = new p5();
            students[i].read(rolls[i], names[i], cgpas[i]);
        }

        // Displaying student details
        System.out.println("Student Details:");
        for (p5 student : students) {
            student.display();
        }

        // Finding the student with the lowest CGPA
        float lowestCgpa = students[0].cgpa;
        String lowestCgpaStudent = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaStudent = students[i].name;
            }
        }

        System.out.println("Student with the lowest CGPA: " + lowestCgpaStudent);
    }
}
