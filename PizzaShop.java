public class PizzaShop {

  public static void main(String[] args) {
    // Imagine 3 helpers (threads) working together:
    takeOrder();  // Helper 1: Takes an order
    makePizza();  // Helper 2: Makes the pizza
    deliverPizza(); // Helper 3: Delivers the pizza
    System.out.println("All pizza services started!");
  }

  
  public static void takeOrder() {
    System.out.println("Taking pizza order...");
  }

  public static void makePizza() {
    System.out.println("Making the pizza...");
  }

  public static void deliverPizza() {
    System.out.println("Delivering the pizza...");
  }
}
