interface MyInterface{
    void myMethod();
}

class MyClass implements MyInterface{
    private int myVariable;

    // This is a constructor for MyClass
    public MyClass(int a) {
        myVariable = a;
    }

    // This is the implementation of the method defined in MyInterface
    public void myMethod() {
        System.out.println("The answer is : " + myVariable);
    }
}

public class  Variable{
    public static void main(String[] args) {
        MyInterface obj = new MyClass(5);
        obj.myMethod();
    }
}