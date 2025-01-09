
class  Student1{
     private String name;
    private int rollNumber;
    private int age;
   public void setData(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
  public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}
 class Main {
    public static void main(String[] args) {
       Student student1 = new Student();
       student1.setData("John", 101, 20);
   System.out.println("Student Details:");
        student1.getData();
System.out.println("Name:Sheebanaaz Makandar|SAP ID:500117989");
    }
}


