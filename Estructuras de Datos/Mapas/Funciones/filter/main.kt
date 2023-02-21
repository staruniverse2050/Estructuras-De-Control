fun main(){
    //Algoritmo que obtenga el valor correspondiente a una clave existente en el mapa y imprima por pantalla dichos elementos que cumplan con la condición, recuerde utilizar la función filter().
    //Creación de mapa inmutable
    val mapaC = mapOf(
      "Identificación" to 8,
      "Nombre" to "Martha Muñoz",
      "Telefono" to 3214567473
  )
  //Función filter
  
  // Filtra los elementos del mapa que tienen un valor igual a 8
  val Mapear = mapaC.filter { it.value == 8 }    // Obtener el valor correspondiente a una clave existente en el mapa
  
  println("La identificación es: $Mapear")
  
      //Creación de mapa mutable
    val mapaD = mutableMapOf(
      "Nombre" to "Karina Sanchez",
      "Formación" to "ADSI",
      "Número de ficha" to 5
  )
  //Función filter
  
  // Filtra los elementos del mapa que tienen un valor igual a 5
  val Buscar = mapaD.filter { it.value == 5 }  
  // Obtener el valor correspondiente a una clave existente en el mapa
  
  println("El número de la ficha es: $Buscar")
  }
  