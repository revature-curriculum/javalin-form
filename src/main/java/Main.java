import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.ShoppingList;

public class Main {

    static ShoppingList groceryList;

    // TO-DO

    public static void main(String[] args) {

        groceryList = new ShoppingList();

        groceryList.addItem("Eggs");
        groceryList.addItem("Bread");

        Javalin app = Javalin.create().start(4100);
        
        app.get("/", ctx -> { 
            ctx.render("index.jte", Collections.singletonMap("groceryList", groceryList));
        });

        app.get("/getForm", getFormHandler);

        app.post("/getForm", postFormHandler);

        // TO-DO

    }

    public static Handler getFormHandler = ctx -> {
        
        ctx.render("form.jte");

    };

    public static Handler postFormHandler = ctx -> {

        String itemName = ctx.formParam("foodName");

        groceryList.addItem(itemName);

        ctx.redirect("/");

    };

    // TO-DO

}
