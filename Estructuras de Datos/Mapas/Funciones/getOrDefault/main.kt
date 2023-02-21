fun main(){
    //Algoritmo que devuelva el elemento que coincida con la clave, es decir, si colocamos la clave nombre, acompañado de un valor, 
    //supongamos que telefono es el valor entonces, debe de imprimir a quien le pertenece ese número y se evidencie el nombre, recuerde utiliza la función getOrDefault().
    
    //Creación de mapa inmutable
    val mapaC = mapOf(
      "Identificación" to 1092445018,
      "Nombre" to "Martha Muñoz",
      "Telefono" to 3214567473,
      
      "Identificación" to 1032463663,
      "Nombre" to "Karen Cruz",
      "Telefono" to 3245635652,
  
      "Identificación" to 6424535324,
      "Nombre" to "Marina Oliveros",
      "Telefono" to 3214535252
  )
  //Función getOrDefault
  val Mapear = mapaC.getOrDefault("Nombre", 3214535252) //Devuelve el nombre de la persona quien le pertenece el numero ingresado como valor
  println(Mapear)
  
      //Creación de mapa mutable
    val mapaD = mutableMapOf(
      "Nombre" to "Karina Sanchez",
      "Formación" to "ADSI",
      "Número de ficha" to 2469285,
  
      "Nombre" to "Cristian Luna",
      "Formación" to "ADSI",
      "Número de ficha" to 2469285,
  
      "Nombre" to "Natalia Buendía",
      "Formación" to "ADSO",
      "Número de ficha" to 2445674
  )
  //Función getOrDefault
  val Buscar = mapaD.getOrDefault("Formación", 2445674) //Devuelve el nombre de la formación
  println(Buscar)
  }
  