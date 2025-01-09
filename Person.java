class Person {
    // data members
    private String name;
    private int age;

    // getData method
    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // setData method
    public void setData(String n, int a) {
        name = n;
        age = a;
    }
}

// main class
public class Person {
    public static void main(String[] args) {
        // creating object of Person class
        Person person = new Person();

        // calling setData method
        person.setData("John Doe", 25);

        // calling getData method
        person.getData();
    }
}