# Post-test-1-PBO
Muhammad Luqman (2309116068)

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

       
        String completedItemName = "PDH";  

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
## PACKAGE : laundry.management
      package laundry.management;
      
      /**
       *
       * @author Luqman
       */
      public class LaundryItem {
          
          private String itemName;
          private double weight;
          private boolean isCompleted;
      
         
          public LaundryItem(String itemName, double weight) {
              this.itemName = itemName;
              this.weight = weight;
              this.isCompleted = False;  
          }
      
          public void markAsCompleted() {
              this.isCompleted = true;
          }
      
          public String getItemName() {
              return itemName;
          }
      
          public double getWeight() {
              return weight;
          }
      
          public boolean isCompleted() {
              return isCompleted;
          }
      
          public void displayItem() {
              System.out.println("Item Name: " + itemName);
              System.out.println("Weight: " + weight + " kg");
              System.out.println("Status: " + (isCompleted ? "Completed" : "In Progress"));
          }
      }
### Hasil
--- exec:3.1.0:exec (default-cli) @ laundry ---
=== LAUNDRY MANAGEMENT SYSTEM ===

=== Laundry Items ===
Item Name: PDH
Weight: 1.2 kg
Status: In Progress

Item Name: CELANA
Weight: 0.8 kg
Status: In Progress

Item Name: JAKET
Weight: 2.0 kg
Status: In Progress

Item Name: HANDUK
Weight: 0.5 kg
Status: In Progress

Item 'PDH' marked as completed.

Total Price for all items: Rp 36000.0
------------------------------------------------------------------------
