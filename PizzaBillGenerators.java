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

public class PizzaBillGenerators {
    // Define available toppings and their prices
    private static final Map<String, Double> TOPPINGS = new HashMap<>();
    static {
        TOPPINGS.put("pepperoni", 1.50);
        TOPPINGS.put("mushrooms", 1.00);
        TOPPINGS.put("onions", 0.75);
        TOPPINGS.put("sausage", 1.75);
        TOPPINGS.put("peppers", 1.25);
        TOPPINGS.put("olives", 1.00);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Welcome to Pizza Bill Generator!");

        while (true) {
            System.out.println("Enter pizza size (small/medium/large): ");
            String size = scanner.nextLine();

            System.out.println("Enter number of toppings: ");
            int numToppings = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            List<String> chosenToppings = new ArrayList<>();
            for (int i = 0; i < numToppings; i++) {
                System.out.println("Enter topping " + (i + 1) + ": ");
                String topping = scanner.nextLine();
                chosenToppings.add(topping);
            }

            // Calculate price based on chosen toppings
            double price = 0.0; // Base price for pizza
            for (String topping : chosenToppings) {
                if (TOPPINGS.containsKey(topping)) {
                    price += TOPPINGS.get(topping);
                }
            }

            Pizza pizza = new Pizza(size, chosenToppings, price);
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
