public class ConversionDemo {

    public static void main(String[] args) {
        // int to Integer
        int num = 10;
        Integer intObject = Integer.valueOf(num);  // Boxing: convert int to Integer object
        System.out.println("int to Integer: " + intObject + " (type: " + intObject.getClass() + ")");

        // Integer to String
        String str1 = intObject.toString();  // Unboxing: convert Integer back to String
        System.out.println("Integer to String: " + str1 + " (type: " + str1.getClass() + ")");

        // String to int
        String str2 = "25";
        int num2 = Integer.parseInt(str2);  // Parse String to int (throws NumberFormatException for invalid input)
        System.out.println("String to int: " + num2 + " (type: " + num2.getClass() + ")");

        // int to String (alternative)
        String str3 = String.valueOf(num);  // Direct conversion from int to String
        System.out.println("int to String (alternative): " + str3 + " (type: " + str3.getClass() + ")");

        // String to Integer
        Integer intObject2 = Integer.valueOf(str2);  // Parse String to Integer object
        System.out.println("String to Integer: " + intObject2 + " (type: " + intObject2.getClass() + ")");

        // Integer to int (implicit)
        int num3 = intObject;  // Unboxing: automatic conversion from Integer to int
        System.out.println("Integer to int: " + num3 + " (type: " + num3.getClass() + ")");
    }
}
