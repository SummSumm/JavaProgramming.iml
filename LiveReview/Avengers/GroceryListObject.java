package Avengers;

import java.util.ArrayList;
import java.util.Scanner;


public class GroceryListObject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean run = true;

printInstructions();
        GroceryList shoppinglist = new GroceryList();


        while (run) {
            System.out.println("Select an option");
            int answer = input.nextInt();

            switch (answer) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println(shoppinglist);
                    break;
                case 2:
                    System.out.println("Enter your item");
                    input.nextLine();
                    shoppinglist.addGroceryList(input.nextLine());
                                        break;
                case 3:
                    System.out.println("Enter item number");
                    int itemNo = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter replacement item");
                    String replacement = input.nextLine();
                    shoppinglist.modifyGroceryItem(itemNo, replacement);
                    break;
                case 4:
                    System.out.println("Enter item no to replace");
                    int removeItem = input.nextInt();
                    shoppinglist.removeGroceryItem(removeItem);
                    break;

                case 5:
                    System.out.println("Enter item to search");
                    input.nextLine();
                    String searched = input.nextLine();
                    shoppinglist.findGroceryItem(searched);
                    break;
                case 6:
                    System.exit(0);


            }



        }


    }

    public static void printInstructions() {

        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item from the list.");
        System.out.println("\t 6 - To quit the application.");

    }
}
