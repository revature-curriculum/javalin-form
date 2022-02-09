import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.ShoppingItem;

public class Main {

    static ArrayList<ShoppingItem> shoppingList = new ArrayList<>();

    // TO-DO

    public static void main(String[] args) {

        shoppingList.add(new ShoppingItem("Shirt", 30.0f));
        shoppingList.add(new ShoppingItem("Pants", 35.0f));

        Javalin app = Javalin.create().start(4100);
        
        app.get("/", ctx -> { 
            ctx.render("index.jte");
        });

        app.get("/shoppingList", ctx -> {
          ctx.render("shoppingList.jte", Collections.singletonMap("shoppingList", shoppingList));
        });

        app.get("/getForm", getFormHandler);

        app.post("/getForm", postFormHandler);

        // TO-DO

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

    // TO-DO

}
