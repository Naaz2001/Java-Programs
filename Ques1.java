public class Ques1{
public static void main(String args[]){
String[]
StudentName={"Steve Smith","Sheldon","Howard","Leonard","Penny","Bernedatte","Amy","Fowler","Rajesh","Proton"};
int [] roll = {1,2,3,4,5,6,7,8,9,10};

for(int i=0;i<StudentName.length;i++)
{
try{
System.out.println(roll[i] + ":" + StudentName[i]);
}
catch(IndexOutOfBoundsException e){
System.out.println("Something went wrong");
}

}
}
}