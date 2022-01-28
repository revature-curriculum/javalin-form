@import objects.ShoppingList
@param ShoppingList groceryList

Welcome

<html lang="en">
<body>

    <p>Hello visitor!</p>

    @for(String item : groceryList.getList())
    <li>${item}</li>
    @endfor

    <br>

    <a href="/getForm">Add Item</a>

</body>
</html>