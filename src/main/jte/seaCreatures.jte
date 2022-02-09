@import objects.SeaCreatures
@import java.util.*
@param ArrayList<SeaCreatures> seaCreatures

<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>

  @for(SeaCreatures sc : seaCreatures)
    <li>${sc.getName()} has a size of ${sc.getSize()} and is ${sc.getColor()} in color!</li>
  @endfor

  <br>

  <a href="/getscForm">Add Sea Creature</a>

</body>

</html>