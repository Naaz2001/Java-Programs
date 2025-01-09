class SuperClass {
    private static void display() {
        System.out.println("Name : Sidhant Gairola");
    }
}
class SubClass extends SuperClass{
    public static void show() {
        System.out.println("Extended class..");
    }
}
public class Main {	
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
        obj.display();
System.out.println("Name : Sheebanaaz Makandar \t SAP : 500117989");
    }
}
