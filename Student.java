import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        
        scanner.close();
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Percentage: " + percentage);
    }
}
