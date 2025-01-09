public class Ques3{
public static void main(String[] args){
try{
int operand1 = Integer.parseInt(args[0]);
int operand2 = Integer.parseInt(args[1]);

int result = operand1 + operand2;
System.out.println("Result:" + result);
}
catch(ArithmeticException e){
System.out.println("Error: Division by zero.");
System.exit(1);
}catch (Exception e){
System.out.println("Error: Non_numeric operand provided.");
System.exit(1);
}
}
}