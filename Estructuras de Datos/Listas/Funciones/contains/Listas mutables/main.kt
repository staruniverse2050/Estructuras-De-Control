fun main(){
    //Algoritmo que devuelva en tipo de dato booleano (true o false) si el elemento se encuentra en la lista, recuerde utilizar la función contains.
    
    //Creación de listas mutables
    //Con String
    val nombres = mutableListOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina","Rocío","Carmela","Luffy","Nami","Ussop")
    
    //Función contains
  val elementos = nombres.contains("Luffy") // Devuelve true
  println("En esta lista se encuentra el Señor Luffy? $elementos")
  
    //Con números
  val numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)
  
    //Función contains
  val elemento = numeros.contains(23) // Devuelve false
  println("En esta lista se encuentra el numero 23? $elemento")
  }
  