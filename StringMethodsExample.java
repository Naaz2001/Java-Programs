public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        
        int hashCode = str.hashCode();
        System.out.println("HashCode of str: " + hashCode);

        String trimmedStr = str.trim();
        System.out.println("Trimmed string: \"" + trimmedStr + "\"");

        String internedStr = str.intern();
        System.out.println("Interned string: \"" + internedStr + "\"");

        int length = str.length();
        System.out.println("Length of str: " + length);

        String replacedStr = str.replace('l', 'X');
        System.out.println("String after replacement: \"" + replacedStr + "\"");

        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: \"" + substring + "\"");
    }
}

