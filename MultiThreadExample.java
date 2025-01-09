class CustomThread extends Thread { 
    public void execute() 
    {
    for (int i = 1; i <= 3; i++) 
    { 
        System.out.println("Custom Thread Executing " + i);
    } 
}
    }
    public class MultiThreadExample {
    public static void main(String[] args) { 
        CustomThread Thread1 = new CustomThread(); 
        CustomThread Thread2 = new CustomThread();
    
    Thread1.execute(); 
    Thread2.execute();
    }
 }
    
    