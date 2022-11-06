package Avengers;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList;

    // constructor


    // this will act like a setter method
    public GroceryList(){
        groceryList = new ArrayList<>();
    }

    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public String toString () {
String list = "You have " + groceryList.size() + " items in your list.";

for (int i=0; i<groceryList.size();i++) {
    list += "\n" + (i+1) + "." + groceryList.get(i);
}

        return list;
    }

    public void modifyGroceryItem (int index, String newItem) {
        groceryList.set(index, newItem);
        System.out.println("Grocery item " + (index+1) + " has been modified.");
    }

    public void removeGroceryItem (int index) {
        groceryList.remove(index);
    }

    public String findGroceryItem (String item) {

        String result = "Not Found"; // bulamazasa -1 verir

        if (groceryList.indexOf(item)>=0) {
            result = item + " found at " + groceryList.indexOf(item);
        }
        return result;

    }


}
