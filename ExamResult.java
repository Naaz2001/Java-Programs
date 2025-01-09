import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            String rollNo = scanner.nextLine();
            int physicsMark = scanner.nextInt();
            int chemistryMark = scanner.nextInt();
            int mathsMark = scanner.nextInt();

            scanner.nextLine(); // consume newline

            int totalMark = physicsMark + chemistryMark + mathsMark;
            double percentage = (double) totalMark / 300 * 100;

            System.out.print(rollNo + ": ");
            if (physicsMark < 40 || chemistryMark < 40 || mathsMark < 40) {
                System.out.println("Fail");
            } else {
                if (percentage >= 75) {
                    System.out.println("Distinction");
                } else if (percentage >= 60) {
                    System.out.println("First Division");
                } else if (percentage >= 50) {
                    System.out.println("Second Division");
                } else {
                    System.out.println("Third Division");
System.out.println("Name:SHEEBANAAZ MAKANDAR|SAP ID:500117989");
                }
            }
        }


        scanner.close();
    }
}