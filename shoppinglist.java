// Name: Yuri Guillermo
// Date: October 13 2025
// Program: Shopping List Project
// A simple Java program that lets users create a shopping list,
// print it, count the items, and search for an item in the list.

import java.util.ArrayList;
import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Enter up to 5 items to buy:");

        // Step 1: Ask the user for up to 5 items
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            String item = scanner.nextLine().trim();

            if (!item.isEmpty()) {
                shoppingList.add(item);
            }
        }

        // Step 2: Print the complete shopping list
        System.out.println("\nYour shopping list:");
        System.out.println(String.join(", ", shoppingList));

        // Step 3: Count how many items were entered
        System.out.println("\nYou entered " + shoppingList.size() + " item(s).");

        // Step 4: Search feature (extra challenge)
        System.out.print("\nSearch for an item: ");
        String searchItem = scanner.nextLine().trim();

        if (shoppingList.contains(searchItem)) {
            System.out.println("✅ " + searchItem + " is in your shopping list!");
        } else {
            System.out.println("❌ " + searchItem + " is NOT in your shopping list.");
        }

        scanner.close();
    }
}
