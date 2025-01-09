import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the employee: ");
            String name = sc.nextLine(); // Use nextLine() to capture full name

            // Improved name validation using regular expression
            if (!name.matches("[a-zA-Z ]+")) {
                throw new Exception("Name can only contain letters and spaces.");
            }

            System.out.println("The name of the employee is: " + name);

            System.out.print("Enter the age of the employee: ");
            int age = sc.nextInt();

            if (age > 50) {
                throw new Exception("Employee age cannot be greater than 50.");
            }

            System.out.println("The age is: " + age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
