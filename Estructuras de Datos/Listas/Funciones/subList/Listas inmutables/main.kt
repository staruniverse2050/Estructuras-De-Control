fun main(){
    //Algoritmo que devuelva una lista con los elementos según la posición asignada, recuerde utilizar la función subList() y en este ejercicio deberá hacerlo con ayuda de listas inmutables.

    //Creación de listas inmutables
    //Con String
      val nombres = listOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina")
    
    //Función subList
  val elementos = nombres.subList(0, 3) // Devuelve una lista que incluye [0,1,2]
  println(elementos)
  
    //Con números
      val numeros = listOf(1,2,3,4,5,6,7,8,9,10)
  
    //Función subList
  val elemento = numeros.subList(1,6) // Devuelve una lista que incluye [1,2,3,4,5]
  println(elemento)
  }
  