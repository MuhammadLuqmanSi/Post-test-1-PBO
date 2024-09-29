/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Laundry_main;
import laundry.management.LaundryItem;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Luqman
 */
public class LaundryManagementSystem {
    // Static keyword usage for constant
    static final double PRICE_PER_KG = 5000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LaundryItem> laundryList = new ArrayList<>();
        String choice;

        System.out.println("=== LAUNDRY MANAGEMENT SYSTEM ===");

        // Input laundry items
        do {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();
            scanner.nextLine();  // consume the newline character

            // Create a new laundry item and add it to the list
            LaundryItem item = new LaundryItem(itemName, weight);
            laundryList.add(item);

            System.out.print("Add another item? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // Display all items
        System.out.println("\n=== Laundry Items ===");
        for (LaundryItem item : laundryList) {
            item.displayItem();
            System.out.println();
        }

        // Mark an item as completed
        System.out.print("Enter the name of the item to mark as completed: ");
        String completedItemName = scanner.nextLine();

        boolean found = false;
        for (LaundryItem item : laundryList) {
            if (item.getItemName().equalsIgnoreCase(completedItemName)) {
                item.markAsCompleted();
                found = true;
                System.out.println("Item marked as completed.");
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }

        // Calculate total price
        double totalPrice = 0;
        for (LaundryItem item : laundryList) {
            totalPrice += item.getWeight() * PRICE_PER_KG;
        }

        System.out.println("\nTotal Price for all items: Rp " + totalPrice);
    }
}