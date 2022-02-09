import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.ShoppingItem;
import objects.SeaCreatures;

public class Main {

  static ArrayList<ShoppingItem> shoppingList = new ArrayList<>();

  static ArrayList<SeaCreatures> seaCreatures = new ArrayList<>();

  public static void main(String[] args) {

    shoppingList.add(new ShoppingItem("Shirt", 30.0f));
    shoppingList.add(new ShoppingItem("Pants", 35.0f));

    seaCreatures.add(new SeaCreatures("Blobfish", 2, "pink"));
    seaCreatures.add(new SeaCreatures("Sea Angel", 1, "green-cyan"));
    seaCreatures.add(new SeaCreatures("Peacock Mantis Shrimp", 4, "orange"));
    seaCreatures.add(new SeaCreatures("Firefly Squid", 25, "brownish-red"));

    Javalin app = Javalin.create().start(4100);
    
    app.get("/", ctx -> { 
      ctx.render("index.jte", Collections.singletonMap("shoppingList", shoppingList));
    });

    app.get("/getForm", getFormHandler);

    app.post("/getForm", postFormHandler);

    app.get("/seaCreatures", ctx -> { 
      ctx.render("seaCreatures.jte", Collections.singletonMap("seaCreatures", seaCreatures));
    });

    app.get("/getscForm", getscFormHandler);

    app.post("/postscForm", addscHandler);

  }

  public static Handler getFormHandler = ctx -> {
      
    ctx.render("form.jte");

  };

  public static Handler postFormHandler = ctx -> {

    String itemName = ctx.formParam("itemName");
    float itemPrice = Float.parseFloat(ctx.formParam("itemPrice"));

    shoppingList.add(new ShoppingItem(itemName, itemPrice));

    ctx.redirect("/");

  };

  public static Handler getscFormHandler = ctx -> {
      
    ctx.render("seaCreatureForm.jte");

  };

  public static Handler addscHandler = ctx -> {

    String name = ctx.formParam("name");
    int size = Integer.parseInt(ctx.formParam("size"));
    String color = ctx.formParam("color");  

    seaCreatures.add(new SeaCreatures(name, size, color));

    ctx.redirect("/");

  };


    

}
