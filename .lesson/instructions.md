## JTE Forms Advanced
---
### Description

In this lab we will cover how add forms to your web application using Javalin and JTE.

---
### Steps

1. In src -> main -> java -> objects -> SeaCreature.java add at least three fields. One should be the name of the animal, and another the color of the animal. You can choose the rest.
2. Create a constructor for the class.
3. Create getters for all the fields. These getters should be public so other files can access them.
4. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. This arraylist should be static and be created outside the main method.
5. Add at least 4 SeaCreature objects to your list. This should be done in the main method. See the ShoppingItems reference example in the same file.
6. Create a handler that will render seaCreatures.jte and send it your list of SeaCreature objects.
7. Create a route for the handler.
8. In src -> main -> jte -> seaCreatures.jte add the required imports and parameters.
    * Remember to import java.util.* for the arraylist.
    * Remember to use the same name for the parameter and the key for the singletonMap.
9. Create a for loop inside the body tags. This for loop should iterate through all the sea creatures with a sentence using the various fields you created in your sea creature class file. See sample output for reference.
    * You can use a getter with ${seaCreature.getName()}.
10. Create a link that goes back to the index page (route is normally "/" for index.jte).
11. Create a link that goes to the seaCreatureForm route that you will create.
12. In the Main.java class create a handler that will create variables and set them to inputs from the formParameters of the sea creature form.
    * For example if you had a size field: int size = ctx.formParam("size");
    * Do this for all the fields you have.
13. Create a new seaCreature object with the variables you have created.
14. Add this new sea creature to the arraylist.
15. In src -> main -> jte -> seaCreatureForm.jte create a form enclosed in the body tag.
16. Add fields to the form for all the fields you need to create a new sea creature (like name, color, size).
    * Make sure to add a name to each form input so you can receive them from your form parameters in the handler you created.
17. Add a link leading back to the seaCreatures list route.
18. Run the code, add a sea creature using the form. Now go to the list page and see if the new sea creature has been added to the list!

---
### Sample Output
Some facts about my favorite sea creatures:
* Blue Whales have a size of 90 feet and are blue-gray in color.
* Starfish have a size of 40 inches and are orange in color.
* Anglerfish have a size of 1 foot and are black in color.
* Bottlenose Dolphins have a size of 8.9 feet and are gray in color.
<br>
Add Sea Creatures Button

---
