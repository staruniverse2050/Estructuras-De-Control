fun main(){
    //Algoritmo que devuelva la posición de un elemento especificado si se encuentra y tambien que devuelva un numero si no se encuentra el elemento especificado, recuerde utilizar la función lastIndexOf(), realicelo con lista mutable

//Creación de listas mutables
//Con String
val nombres = mutableListOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina","Rocío","Carmela","Luffy","Nami","Ussop")

//Función lastindexOf
val elementos = nombres.lastIndexOf("Pepe") // Devuelve un -1 (porque no se encuentra en la lista)
println(elementos)

//Con números
val numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)

//Función lastindexOf
val elemento = numeros.lastIndexOf(10) // Devuelve un 9
println(elemento)
}

