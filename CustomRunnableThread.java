class CustomRunnable implements Runnable {

    public void run() {
    
    for (int i = 2; i <= 8; i += 2) {
    
    System.out.println("Custom Runnable Thread: " + i);
    
    }
    
    }
    
    }
    
    
    
    public class CustomRunnableThread {
    
    public static void main(String[] args) {
    
    CustomRunnable customRunnable = new CustomRunnable();
    
    
    
    Thread Thread1 = new Thread(customRunnable); 
    
    Thread Thread2 = new Thread(customRunnable);
    
    
    
    Thread1.start();
    
    Thread2.start();
    
    }
    
    }
    