import java.util.*;

public class CoffeeShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coffee order = null;

        System.out.println("=== BREWTIFUL COFFEE ===\n");

        System.out.println("Choose your base coffee:");
        System.out.println("1. Black Coffee");
        System.out.println("2. Espresso");
        System.out.print("Enter choice: ");
        int baseChoice = scanner.nextInt();

        switch (baseChoice) {
            case 1:
                order = new BlackCoffee();
                break;
            case 2:
                order = new Espresso();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        int choice;
        do {
            System.out.println("\nAdditional Toppings: ");
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("3. Caramel Syrup");
            System.out.println("4. Whipped Cream");
            System.out.println("5. Complete Order");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    order = new Milk(order);
                    break;
                case 2:
                    order = new Sugar(order);
                    break;
                case 3:
                    order = new CaramelSyrup(order);
                    break;
                case 4:
                    order = new WhippedCream(order);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);

        // Final summary
        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Order/s: " + order.getDescription());
        System.out.println("Total Cost: ₱" + order.getCost());
    }
}