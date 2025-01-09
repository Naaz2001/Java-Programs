public class FloatConversion {

    public static void main(String[] args) {
        // float to Float
        float pi = 3.14f;
        Float piObject = pi; // Implicit conversion (possible for float to Float)

        System.out.println("float to Float: " + piObject + " (type: " + piObject.getClass() + ")");

        // Float to String
        String str = Float.toString(piObject);
        System.out.println("Float to String: " + str + " (type: " + str.getClass() + ")");

        // String to Float
        String strNum = "25.5";
        float floatFromString = Float.parseFloat(strNum);
        System.out.println("String to Float: " + floatFromString + " (type: " + floatFromString.getClass() + ")");

        // Float to float (implicit)
        float piAgain = piObject;  // Unboxing: automatic conversion from Float to float
        System.out.println("Float to float: " + piAgain + " (type: " + piAgain.getClass() + ")");
    }
}
