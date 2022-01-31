@import objects.ShoppingItem
@import java.util.*
@param ArrayList<ShoppingItem> shoppingList


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <h3>Welcome</h3>
    <h3>Hello visitor!</h3>

    @for(ShoppingItem item : shoppingList)
    <li>${item.getName()} has a price of ${item.getPrice()}</li>
    @endfor

    <br>

    <a href="/getForm">Add Item</a>

</body>
</html>