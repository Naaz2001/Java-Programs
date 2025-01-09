public class ConstructorOverloading {
    private int id;
    private String name;

    public ConstructorOverloading() {
        System.out.println("Constructor with no arguments called.");
    }

    public ConstructorOverloading(int id) {
        this();
        System.out.println("Constructor with single integer argument called.");
        this.id = id;
    }

    public ConstructorOverloading(int id, String name) {
        this(id);
        System.out.println("Constructor with two arguments (integer and string) called.");
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(10, "John Doe");
        obj1.display();
        obj2.display();
        obj3.display();
System.out.println("Name:SHEEBANAAZ MAKANDAR|SAP ID:500117989");
    }
}