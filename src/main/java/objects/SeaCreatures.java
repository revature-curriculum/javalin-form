package objects;

public class SeaCreatures {

  String name;
  int size;
  String color;

  public SeaCreatures(String name, int size, String color){
    this.name = name;
    this.size = size;
    this.color = color;
  }

  public String getName(){
    return name;
  }

  public int getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }
    
}
