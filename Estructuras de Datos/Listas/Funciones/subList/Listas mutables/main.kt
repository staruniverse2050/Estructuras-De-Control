fun main(){
    //Algoritmo que devuelva una lista con los elementos según la posición asignada, recuerde utilizar la función subList() y en este ejercicio deberá hacerlo con ayuda de listas mutables.

    //Creación de listas mutables
    //Con String
    val nombres = mutableListOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina","Rocío","Carmela","Luffy","Nami","Ussop")
    
    //Función subList
  val elementos = nombres.subList(1, 7) // Devuelve una lista que incluye [1,2,3,4,5,6]
  println(elementos)
  
    //Con números
  val numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)
  
    //Función subList
  val elemento = numeros.subList(5,8) // Devuelve una lista que incluye [5,6,7]
  println(elemento)
  }
  
  
  