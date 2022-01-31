## Javalin Forms
---
### Description

In this lab we will cover how add forms to your web application using Javalin and JTE.

---
### Steps

1. In src -> main -> java -> objects, add your fields and getters to your SeaCreature.java file. Make sure to have at least 3 fields in this file. 
2. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. Add at least 4 SeaCreature objects to your list.
3. In Main.java add the required fields, methods and handlers for the SeaCreatures to be sent to seaCreature.jte. For reference see the fields, methods and handlers for ShoppingItem in Main.java. Your code should be written underneath the To-Do comments. Additionally in Main.java add the required code to receive sea creature data from the form you will create in seaCreatureForm.jte.
4. In src -> main -> java -> jte -> seaCreature.jte modify the file so it outputs a list of sea creatures with a sentence using the various fields you created in your SeaCreature.java file. See sample output for reference.
5. In src -> main -> java -> jte -> seaCreatureForm.jte modify the file to have a form so users can create a new sea creature with all the required fields. The user should be able to see the new sea creature if they go to the list of sea creatures route.


---
### Sample Output
Some facts about my favorite sea creatures:
* Blue Whales have a size of 90 feet and are blue-gray in color.
* Starfish have a size of 40 inches and are orange in color.
* Anglerfish have a size of 1 foot and are black in color.
* Bottlenose Dolphins have a size of 8.9 feet and are gray in color.
```java
"Add Sea Creatures"
```
---
