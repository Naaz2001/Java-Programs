package JavaLab.Exp9;

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread extends Thread {  // Corrected class name (case-sensitive)
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class EvenOdd {  // Corrected class name (case-sensitive)
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();  // Corrected variable name (case-sensitive)

        et.start();
        ot.start();
    }
}
