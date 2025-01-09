public interface A {
  void meth1();
  void meth2();
}

class MySteve implements A { // Corrected class name consistency

  @Override
  public void meth1() {
    System.out.println("This is meth1 in MySteve"); // Corrected class name
  }

  @Override
  public void meth2() {
    System.out.println("This is meth2 in MySteve"); // Corrected class name
  }

  public static void main(String[] args) {
    // Create an object of MyClass
    MySteve obj = new MySteve();

    // Call the methods of the interface using the object
    obj.meth1();
    obj.meth2();

System.out.println(" Name:Sheebanaaz Makandar  ,Sap-id-500117989");
    // Removed personal information for clarity
  }
}
