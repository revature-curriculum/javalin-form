package objects;

import java.util.*;

public class ShoppingList {

    ArrayList<String> groceryList;

    public ShoppingList(){
        groceryList = new ArrayList<>();
    }

    public void addItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getList(){
        return groceryList;
    }
    
}
