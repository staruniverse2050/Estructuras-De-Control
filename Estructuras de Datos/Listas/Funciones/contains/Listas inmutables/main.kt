fun main(){
    //Algoritmo que devuelva en tipo de dato booleano (true o false) si el elemento se encuentra en la lista, recuerde utilizar la función contains.

  //Creación de listas inmutables
  //Con numeros
  val numeros = listOf(1,2,3,4,5,6,7,8,9,10)

  //Función contains
  val elementos = numeros.contains(5) // Devuelve true
  println("Esta lista contiene un 5? $elementos")

  //Con String
  val nombres = listOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina")

  //Función contains
  val elemento = nombres.contains("Karen") // Devuelve false
  println("En esta lista se encuentra la Señora Karen? $elemento")
}
