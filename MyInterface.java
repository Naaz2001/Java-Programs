interface MyInterface{
    void myMethod();
}

class MyClass implements MyInterface{
    private int myVariable;

    // This is a constructor for MyClass
    public MyClass(int Steve) {
        myVariable = Steve;
    }

    // This is the implementation of the method defined in MyInterface
    public void myMethod() {
        System.out.println("My name is : " + myVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyClass(5);
        obj.myMethod();
    }
}