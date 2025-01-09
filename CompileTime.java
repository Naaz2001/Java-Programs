public class CompileTime {

    public void printMessage(String message) {
        System.out.println("Printing a string message: " + message);
    }

    public void printMessage(int number) {
        System.out.println("Printing an integer message: " + number);
    }

    public void printMessage(double decimal) {
        System.out.println("Printing a decimal message: " + decimal);
    }

    public static void main(String[] args) {
        CompileTime example = new CompileTime();
        example.printMessage("Hello, world!");
        example.printMessage(42);
        example.printMessage(3.14159);
System.out.println("Name:SHEEBANAAZ MAKANDAR|SAP ID:500117989");

    }
}