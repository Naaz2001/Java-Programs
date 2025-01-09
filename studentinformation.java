import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = input.nextLine();

        System.out.println("Enter student roll: ");
        int roll = input.nextInt();

        System.out.println("Enter student marks: ");
        Double marks = input.nextDouble();

        printStudentInformation(name, roll, marks);
    }

    public static void printStudentInformation(String name, int roll, Double marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Student roll: " + roll);
        System.out.println("Student Marks: " + marks);
    }
}