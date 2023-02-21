fun main() {
    //Algoritmo que devuelva la posición del elemento si se encuentra y tambien que devuelva un numero si no se encuentra el elemento, recuerde utilizar la función indexOf(), realicelo con lista inmutable

//Creación de listas inmutables
//Con numeros
    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)

//Función indexOf
    val elementos = numeros.indexOf(3) // Devuelve 2 
    println(elementos)

  
//Con String
    val nombres = listOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina")

//Función indexOf
    val elemento = nombres.indexOf("Marina") // Devuelve un -1 (porque no está)
    println(elemento)

}
