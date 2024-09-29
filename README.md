# Post-test-1-PBO
nama: Muhammad Luqman
nim : 2309116068

## PACKAGE : com.mycompany.laundry
package com.mycompany.laundry;
import laundry.management.LaundryItem;
import java.util.ArrayList;

/**
 *
 * @author Luqman
 */
public class Laundry {

   static final double PRICE_PER_KG = 8000;

    public static void main(String[] args) {
        ArrayList<LaundryItem> laundryList = new ArrayList<>();

        System.out.println("=== LAUNDRY MANAGEMENT SYSTEM ===");

        laundryList.add(new LaundryItem("PDH", 1.2));
        laundryList.add(new LaundryItem("CELANA", 0.8));
        laundryList.add(new LaundryItem("JAKET", 2.0));
        laundryList.add(new LaundryItem("HANDUK", 0.5));

        
        System.out.println("\n=== Laundry Items ===");
        for (LaundryItem item : laundryList) {
            item.displayItem();
            System.out.println();
        }

       
        String completedItemName = "Shirt";  // Simulating item name to be marked as completed

        boolean found = false;
        for (LaundryItem item : laundryList) {
            if (item.getItemName().equalsIgnoreCase(completedItemName)) {
                item.markAsCompleted();
                found = true;
                System.out.println("Item '" + completedItemName + "' marked as completed.");
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }


        double totalPrice = 0;
        for (LaundryItem item : laundryList) {
            totalPrice += item.getWeight() * PRICE_PER_KG;
        }

        System.out.println("\nTotal Price for all items: Rp " + totalPrice);
    }
}
