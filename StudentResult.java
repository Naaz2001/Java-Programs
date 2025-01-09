import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Name:SHEEBANAAZ MAKANDAR|SAP ID:500117989");
        
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        
        System.out.print("Enter Physics Marks: ");
        double physicsMarks = scanner.nextDouble();
        
        System.out.print("Enter Chemistry Marks: ");
        double chemistryMarks = scanner.nextDouble();
        
        System.out.print("Enter Maths Marks: ");
        double mathsMarks = scanner.nextDouble();
        
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;
        
        if (physicsMarks >= 40 && chemistryMarks >= 40 && mathsMarks >= 40) {
            if (percentage >= 75) {
                System.out.println("Roll No: " + rollNo + " - Distinction");
            } else if (percentage >= 60) {
                System.out.println("Roll No: " + rollNo + " - First Division");
            } else if (percentage >= 50) {
                System.out.println("Roll No: " + rollNo + " - Second Division");
            } else if (percentage >= 40) {
                System.out.println("Roll No: " + rollNo + " - Third Division");
            }
        } else {
            System.out.println("Roll No: " + rollNo + " - Fail");



        }
    }


}