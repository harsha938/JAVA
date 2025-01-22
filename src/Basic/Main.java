package Basic;

import java.util.Scanner;

class Students {
    String name;            // Name of the student
    int marks[] = new int[5]; // Marks for 5 subjects
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array for 6 students
        Students[] students = new Students[6];

        // Input details for each student
        for (int i = 0; i < 6; i++) {
            students[i] = new Students(); // Initialize each student object
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            students[i].name = scanner.nextLine();

            System.out.println("Enter marks for 5 subjects for " + students[i].name + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                students[i].marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume the newline character
        }

        // Display the details of each student
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Name: " + students[i].name);
            System.out.print("Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(students[i].marks[j] + " ");
            }
            System.out.println("\n");
        }

        scanner.close();
    }
}
