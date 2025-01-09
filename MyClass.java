public interface A {
  void meth1();
  void meth2();
}

 class MyClass implements A {

  @Override
  public void meth1() {
    System.out.println("This is meth1 in MyClass");
  }

  @Override
  public void meth2() {
    System.out.println("This is meth2 in MyClass");
  }

  public static void main(String[] args) {
    // Create an object of MyClass
    MyClass obj = new MyClass();

    // Call the methods of the interface using the object
    obj.meth1();
    obj.meth2();
    System.out.println(" Name:Sheebanaaz Makandar  ,Sap-id-500117989");

  }
}
