import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int product_id;
    String name;
    String category;
    double price;

    public Product(int id, String name, String category, double price) {
        this.product_id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class Productarraylist {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add product");
            System.out.println("2. Calculate total price of all products");
            System.out.println("3. Remove product by product_id");
            System.out.println("4. Update product price by product_id");
            System.out.println("5. Search products by category");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product_id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    products.add(new Product(id, name, category, price));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    double total = 0;
                    for (Product product : products) {
                        total += product.price;
                    }
                    System.out.println("Total price of all products: " + total);
                    break;
                case 3:
                    System.out.print("Enter product_id to remove: ");
                    int removeId = scanner.nextInt();
                    products.removeIf(product -> product.product_id == removeId);
                    System.out.println("Product removed successfully!");
                    break;
                case 4:
                    System.out.print("Enter product_id to update price: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    for (Product product : products) {
                        if (product.product_id == updateId) {
                            product.price = newPrice;
                            System.out.println("Price updated successfully!");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter category to search: ");
                    String searchCategory = scanner.next();
                    boolean found = false;
                    for (Product product : products) {
                        if (product.category.equalsIgnoreCase(searchCategory)) {
                            System.out.println("Product: " + product.name + ", Price: " + product.price);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No products found for the given category.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
