public class TypeConversionExample {
    public static void main(String[] args) {
        // Convert int to Integer
        int intValue = 42;
        Integer integerValue = Integer.valueOf(intValue);
        System.out.println("int to Integer: " + integerValue);

        // Convert Integer to String
        Integer integerObject = Integer.valueOf(100);
        String stringFromInteger = integerObject.toString();
        System.out.println("Integer to String: " + stringFromInteger);

        // Convert String to int
        String strValue = "123";
        int intFromString = Integer.parseInt(strValue);
        System.out.println("String to int: " + intFromString);

        // Convert int to String
        int anotherIntValue = 987;
        String stringFromInt = String.valueOf(anotherIntValue);
        System.out.println("int to String: " + stringFromInt);

        // Convert String to Integer
        String anotherStrValue = "456";
        Integer integerFromString = Integer.valueOf(anotherStrValue);
        System.out.println("String to Integer: " + integerFromString);

        // Convert Integer to int
        Integer anotherInteger = Integer.valueOf(789);
        int intFromInteger = anotherInteger.intValue();
        System.out.println("Integer to int: " + intFromInteger);
    }
}
