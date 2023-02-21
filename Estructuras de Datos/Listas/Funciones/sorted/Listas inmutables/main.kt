fun main(){
    //Algoritmo que devuelva los elementos de manera organizada ya sea si es string que se ordene alfabeticamente o si es números de ordene de menor a mayor, recuerde utilizar la función sorted() y en este ejercicio deberá hacerlo con ayuda de listas inmutables.

    //Creación de listas inmutables
    //Con String
      val nombres = listOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina")
    
    //Función sorted
  val elementos = nombres.sorted()  // Devuelve una lista de manera ordenada (en forma alfabetica)
  println(elementos)
  
    //Con números
      val numeros = listOf(6,3,16,7,9,1,5,10)
  
    //Función sorted
  val elemento = numeros.sorted()  // Devuelve una lista de manera ordenada (menor a mayor)
  println(elemento)
  }
  