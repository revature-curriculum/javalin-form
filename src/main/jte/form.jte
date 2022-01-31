<html lang="en">

<head>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
    <p>Hello visitor!</p>

    <form method="post">

        <h1>Add a shopping item</h1>
        <label>Item name</label>
        <input type="text" name="itemName" placeholder="Delicious Food" required value="">
        <label>Item price</label>
        <input type="number" step="0.01" name="itemPrice" placeholder="10.0" required value="">
        <input type="submit" value="Add">
    </form>

    <a href="/">Back</a>

</body>
</html>