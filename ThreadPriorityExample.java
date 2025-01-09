public class PizzaShop {

  public static void main(String[] args) {
    // Create threads
    Thread orderThread = new Thread(new OrderTaker());
    Thread chefThread = new Thread(new Chef());
    Thread deliveryThread = new Thread(new Delivery());

    // Start threads
    orderThread.start();
    chefThread.start();
    deliveryThread.start();

    System.out.println("All pizza services started!");
  }
}

class OrderTaker implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread 1: Taking pizza order...");
    // Simulate processing task (wait 1 second)
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread 1: Order received!");
  }
}

class Chef implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread 2: Making the pizza...");
    // Simulate processing task (wait 2 seconds)
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread 2: Pizza is ready!");
  }
}

class Delivery implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread 3: Delivering the pizza...");
    // Simulate processing task (wait 3 seconds)
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread 3: Pizza delivered!");
  }
}
