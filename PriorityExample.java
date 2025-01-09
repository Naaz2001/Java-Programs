class MessagePrinter extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        System.out.println("MessagePrinter is running");
    }
}


class NumberPrinter extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        for (int i = 10; i <= 50; i += 10) {
            System.out.println("NumberPrinter: " + i);
            try {
                Thread.sleep(700); // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FactorialCalculator extends Thread { // Corrected class name (case-sensitive)
    public void run() {
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("FactorialCalculator: Factorial of 5 is " + factorial);
    }
}

public class PriorityExample { // Corrected class name (case-sensitive)
    public static void main(String[] args) {
        MessagePrinter mp = new MessagePrinter();
        NumberPrinter np = new NumberPrinter();
        FactorialCalculator fc = new FactorialCalculator();

        mp.setPriority(Thread.MIN_PRIORITY);
        np.setPriority(Thread.NORM_PRIORITY);
        fc.setPriority(Thread.MAX_PRIORITY);

        System.out.println("MessagePrinter priority: " + mp.getPriority());
        System.out.println("NumberPrinter priority: " + np.getPriority());
        System.out.println("FactorialCalculator priority: " + fc.getPriority());

        mp.start();
        np.start();
        fc.start();
    }
}
