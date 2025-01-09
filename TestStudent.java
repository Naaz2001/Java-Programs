class Student
{
int roll;
String name;
double marks;
public void setData(int r,String s,double m)
{
roll=r;
name=s;
marks=m;
}
public void getData()
{
System.out.println("Roll number of student:"+roll);
System.out.println("Name of the student:"+name);
System.out.println("Marks of the student:"+marks);
}
}
class TestStudent
{
public static void main(String args[])
{
Student S1=new Student();
S1.setData(10,"Smith",400.98);
S1.getData();
System.out.println();
Student S2=new Student();
S2.setData(12,"David",500.98);
S2.getData();
}
}
