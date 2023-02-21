fun main(){
    //Algoritmo que devuelva los elementos de manera organizada ya sea si es string que se ordene alfabeticamente o si es números de ordene de menor a mayor, recuerde utilizar la función sorted() y en este ejercicio deberá hacerlo con ayuda de listas mutables.

    //Creación de listas mutables
   //Con String
    val nombres = mutableListOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina","Rocío","Carmela","Luffy","Nami","Ussop")
    
    //Función sorted
  val elementos = nombres.sorted()  // Devuelve una lista de manera ordenada (en forma alfabetica)
  println(elementos)
  
  //Con numeros
  val numeros = mutableListOf(5,7,1,9,10,56,20,560,6,16)
  
    //Función sorted
  val elemento = numeros.sorted()  // Devuelve una lista de manera ordenada (menor a mayor)
  println(elemento)
  }
  