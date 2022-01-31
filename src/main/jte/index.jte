@import objects.ShoppingList
@param ShoppingList groceryList


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">






</head>
<body>

    <h3>Welcome</h3>
    <h3>Hello visitor!</h3>

    @for(String item : groceryList.getList())
    <li>${item}</li>
    @endfor

    <br>

    <a href="/getForm">Add Item</a>

</body>
</html>