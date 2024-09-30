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

Program ini adalah sebuah sistem manajemen laundry sederhana yang menggunakan dua kelas, yaitu Laundry dan LaundryItem. Program ini mengelola daftar item laundry, menampilkan detail item, menandai status item sebagai selesai (completed), serta menghitung total harga dari semua item laundry berdasarkan beratnya. Berikut adalah penjelasan rinci untuk setiap bagian dari program:

1. Kelas LaundryItem (package: laundry.management)
Kelas ini mewakili setiap item laundry yang disimpan dalam sistem.

Atribut:

itemName (String): Nama dari item laundry, misalnya "PDH", "JAKET".
weight (double): Berat dari item dalam kilogram (kg).
isCompleted (boolean): Status yang menunjukkan apakah item sudah selesai dikerjakan atau belum (false = belum selesai, true = selesai).
Konstruktor:

Menerima dua parameter (itemName dan weight), dan menginisialisasi nilai isCompleted menjadi false secara default, artinya saat item dibuat, statusnya belum selesai.
Metode:

markAsCompleted(): Mengubah status item menjadi "completed" (menyetel isCompleted ke true).
getItemName(): Mengembalikan nama item.
getWeight(): Mengembalikan berat item.
isCompleted(): Mengembalikan status isCompleted (true atau false).
displayItem(): Menampilkan informasi tentang item (nama, berat, dan status selesai atau belum).

2. Kelas Laundry (package: com.mycompany.laundry)
Kelas ini adalah titik awal program dan berfungsi sebagai sistem manajemen laundry.

Atribut:

PRICE_PER_KG: Harga tetap per kilogram untuk laundry, yaitu Rp 8000.
Metode main (Entry Point):

Membuat daftar laundry (ArrayList<LaundryItem>): Program membuat daftar yang berisi beberapa item laundry (LaundryItem), seperti "PDH", "CELANA", "JAKET", dan "HANDUK".

Menampilkan daftar item laundry: Menggunakan perulangan for untuk memanggil metode displayItem() pada setiap item dalam daftar, sehingga menampilkan informasi setiap item (nama, berat, status).

Menandai item sebagai selesai: Program mencari item dengan nama tertentu (misalnya, "PDH") dan menandainya sebagai selesai menggunakan metode markAsCompleted(). Jika item ditemukan, maka statusnya akan berubah menjadi "Completed", dan jika tidak ditemukan, program akan menampilkan pesan "Item not found".

Menghitung total harga laundry: Menghitung total biaya berdasarkan berat semua item di dalam daftar. Total harga didapat dengan mengalikan berat setiap item dengan harga per kilogram (PRICE_PER_KG).

Menampilkan total harga: Setelah total harga dihitung, program menampilkan jumlah total dalam format "Rp".

3. Fungsi Program:
   
Menambahkan item laundry ke dalam daftar.

Menampilkan detail item laundry (nama, berat, dan status selesai/belum).

Menandai item tertentu sebagai selesai (completed).

Menghitung dan menampilkan total harga laundry berdasarkan berat semua item.
