import java.util.Scanner;

public class StudentResults {
    private String name;
    private int rollNo;
    private int physics;
    private int chemistry;
    private int maths;

    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
    }

    public void calculateResult() {
        int total = physics + chemistry + maths;
        double percentage = (double) total / 300 * 100;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        System.out.print("Grade: ");
        if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B+");
        } else if (percentage >= 60) {
            System.out.println("B");
        } else if (percentage >= 50) {
            System.out.println("C");
        } else if (percentage >= 40) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        System.out.print("Result: ");
        if (percentage >= 40) {
            if (percentage >= 90) {
                System.out.println("Distinction");
            } else if (percentage >= 80) {
                System.out.println("First Class");
            } else if (percentage >= 70) {
                System.out.println("Upper Second Class");
            } else if (percentage >= 60) {
                System.out.println("Lower Second Class");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name of student: ");
        StudentResults student = new StudentResults();
        student.name = in.nextLine();
        System.out.print("Enter roll no of student: ");
        student.rollNo = in.nextInt();
        System.out.print("Enter marks in Physics: ");
        student.physics = in.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        student.chemistry = in.nextInt();
        System.out.print("Enter marks in Maths: ");
        student.maths = in.nextInt();

        student.getData();
        student.calculateResult();
System.out.println("Name:SHEEBANAAZ MAKANDAR|SAP ID:500117989");

    }
}