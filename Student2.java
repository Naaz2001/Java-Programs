class Student2 {
  private String name;
  private int rollNumber;
  private int age;

  public Student2(String name, int rollNumber, int age) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // Similar methods for rollNumber and age

  public void getData() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Age: " + age);
  }
}

class Main {
  public static void main(String[] args) {
    Student2 student1 = new Student2("John", 101, 20);
    System.out.println("Student Details:");
    student1.getData();
  }
}