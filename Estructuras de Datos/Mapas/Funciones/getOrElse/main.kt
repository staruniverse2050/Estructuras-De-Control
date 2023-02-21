fun main(){
    //Algoritmo que obtenga el valor correspondiente a una clave existente en el mapa y imprima por pantalla el elemento, recuerde utilizar la función getOrElse().
    //Creación de mapa inmutable
    val mapaC = mapOf(
      "Identificación" to 1092445018,
      "Nombre" to "Martha Muñoz",
      "Telefono" to 3214567473
  )
  //Función getOrElse
  val Mapear = mapaC.getOrElse("Nombre") {0}     // Obtener el valor correspondiente a una clave existente en el mapa
  
  println("El nombre del aprendiz es: $Mapear")
  
      //Creación de mapa mutable
    val mapaD = mutableMapOf(
      "Nombre" to "Karina Sanchez",
      "Formación" to "ADSI",
      "Número de ficha" to 2469285
  )
  //Función getOrElse
  val Buscar = mapaD.getOrElse("Formación") {0} 
  // Obtener el valor correspondiente a una clave existente en el mapa
  
  println("El nombre de la formación es: $Buscar")
  }
  