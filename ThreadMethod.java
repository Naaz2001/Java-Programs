class ThreadOne extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One: " + i);
            try {
                Thread.sleep(500);  // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTwo extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Two: " + i);
            try {
                Thread.sleep(700);  // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadThree extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Three: " + i);
            try {
                Thread.sleep(900);  // Pause for 0.9 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMethod { // Corrected class name (case-sensitive)
    public static void main(String[] args) {
        ThreadOne thread1 = new ThreadOne();
        ThreadTwo thread2 = new ThreadTwo();
        ThreadThree thread3 = new ThreadThree();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
