import java.util.Scanner;

public class Ques2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Dividing first number by second number: ");

        // Check for division by zero before performing the division
        if (y == 0) {
            System.out.println("Sorry, you cannot divide by zero.");
        } else {
            int z = x / y;
            System.out.println(z);
        }
    }
}
