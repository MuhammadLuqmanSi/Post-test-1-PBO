/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry.management;

/**
 *
 * @author Luqman
 */
public class LaundryItem {
    // Properties
    private final String itemName;
    private final double weight;
    private boolean isCompleted;

    // Constructor
    public LaundryItem(String itemName, double weight) {
        this.itemName = itemName;
        this.weight = weight;
        this.isCompleted = false;  // Default laundry status is not completed
    }

    // Method to mark item as completed
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Display details of the laundry item
    public void displayItem() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Status: " + (isCompleted ? "Completed" : "In Progress"));
    }
}