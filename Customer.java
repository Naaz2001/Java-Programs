import java.util.*;
public class Customer {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the customer : ");
        String name = s.nextLine();
        System.out.println("Enter gender : ");
        String gender = s.next();
        System.out.println("Enter address : ");
        String add = s.next();
        System.out.println("Enter phone number : ");
        long ph = s.nextLong();
        System.out.println("Name : "+name+"\nGender : "+gender+"\nAddress : "+add+"\nPhone Number : "+ph);
        System.out.println("Name : Sheebanaaz S Makandar || Enrollment number : R271223006 ||  SAP Id. : 500117989");
    }
}