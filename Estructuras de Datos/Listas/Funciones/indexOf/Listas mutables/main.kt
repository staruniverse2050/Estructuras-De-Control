fun main() {
    //Algoritmo que devuelva la posición del elemento si se encuentra y tambien que devuelva un numero si no se encuentra el elemento, recuerde utilizar la función indexOf()
  //Creación de listas mutables
  //Con numeros
  val numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)
  
  //Función indexOf
      val elementos = numeros.indexOf(12) // Devuelve -1 (porque no está)
      println(elementos)
      
  //Con String
    val nombres = mutableListOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina","Rocío","Carmela","Luffy","Nami","Ussop")
  
  //Función indexOf
      val elemento = nombres.indexOf("Luffy") // Devuelve un 7
      println(elemento)
  
  }
  