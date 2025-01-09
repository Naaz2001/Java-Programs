import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the radius of the circle: ");

                double radius = scanner.nextDouble();


        scanner.close();

        // Calculate circumference
        double circumference = 2 * Math.PI * radius;

        // Print the radius and circumference
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
    }
}
