public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;  // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line after each row
        }
        System.out.println("Name: SHEEBANAAZ MAKANDAR");
        System.out.println("SAP ID: 500117989");

    }
}