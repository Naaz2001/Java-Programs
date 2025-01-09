class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
           
        }
        System.out.println("Thread 1 completed");
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
        
        System.out.println("Thread 2 completed");
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 3: " + i);
            
        }
        System.out.println("Thread 3 completed");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
