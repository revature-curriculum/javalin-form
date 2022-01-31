package objects;

public class ShoppingItem {

    String name;
    float price;
  
  public ShoppingItem(String name, float price){
     this.name = name;
     this.price = price;
  }
  
  public String getName(){
     return name;
  }
  
  public float getPrice(){
    return price;
  }
    
}
