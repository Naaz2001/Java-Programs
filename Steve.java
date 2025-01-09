interface First{
    public void myMethod();
}

interface Second{
    public void mySecondMethod();
}

class MyClass implements First,Second{
    public void myMethod() {
        System.out.println("HIIIIIII.");
    }

    public void mySecondMethod() {
        System.out.println("HELLO.");
    }
}

public class Steve{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
        obj.mySecondMethod();
    }
}