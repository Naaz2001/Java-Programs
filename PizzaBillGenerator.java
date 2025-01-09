import java.util.*;

class Pizza {
    private String size;
    private List<String> toppings;
    private double price;

    public Pizza(String size, List<String> toppings, double price) {
        this.size = size;
        this.toppings = toppings;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<Pizza> pizzas;

    public Order() {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}

class Bill {
    public static double calculateTotal(Order order) {
        double total = 0.0;
        for (Pizza pizza : order.getPizzas()) {
            total += pizza.getPrice();
        }
        return total;
    }
}

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Welcome to Pizza Bill Generator!");

        while (true) {
            System.out.println("Enter pizza size (small/medium/large): ");
            String size = scanner.nextLine();

            System.out.println("Enter toppings (comma-separated): ");
            String[] toppingsArray = scanner.nextLine().split(",");
            List<String> toppings = Arrays.asList(toppingsArray);


            System.out.println("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Pizza pizza = new Pizza(size, toppings, price);
            order.addPizza(pizza);

            System.out.println("Do you want to add another pizza? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        double totalBill = Bill.calculateTotal(order);
        System.out.println("Total Bill: $" + totalBill);

        scanner.close();
    }
}
