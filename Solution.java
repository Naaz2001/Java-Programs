public class Solution {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO";

        String concatenated = str1.concat(" world");
        System.out.println("Concatenated string: " + concatenated);

        boolean isEqual = str1.equals("hello");
        System.out.println("Is str1 equal to 'hello'? " + isEqual);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Is str1 equal to str2 ignoring case? " + isEqualIgnoreCase);

        String upperCaseStr1 = str1.toUpperCase();
        System.out.println("Uppercase of str1: " + upperCaseStr1);

        char charAtIndex2 = str2.charAt(2);
        System.out.println("Character at index 2 in str2: " + charAtIndex2);

        int comparisonResult = str1.compareTo("world");
        System.out.println("Comparison result with 'world': " + comparisonResult);
    }
}
