fun main(){
    //Algoritmo que inserte los elementos de un mapa a otro mapa e imprima esos datos correspondientes una vez unidos, recuerde utilizar la función putAll(), además hagalo con mapa mutable e inmutable.
    //Creación de mapa inmutable
    val mapaC = mapOf(
      "Identificación" to 1092445018,
      "Nombre" to "Martha Muñoz",
      "Telefono" to 3214567473
  )
  //Función putAll
      //Creación de mapa mutable
    val mapaD = mutableMapOf(
      "Jornada" to "Mixta",
      "Formación" to "ADSI",
      "Número de ficha" to 2469285
  )
  mapaD.putAll(mapaC) //Agrega todos los pares clave-valor del mapaC al mapaD
  println("Los siguientes datos corresponden a un aprendiz: $mapaD")
  
  }
  