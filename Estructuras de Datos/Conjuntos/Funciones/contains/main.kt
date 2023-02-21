fun main(){
    //Algoritmo que imprima si el número está dentro del conjunto o no, tenga en cuenta que deberá hacer dos conjuntos los cuales debe ser inmutables con números e inmutables con string

//Conjuntos inmutables

  //Función contains()
val CampoA = setOf(1, 2, 3, 4, 5)

if (CampoA.contains(2)) {
    println("El conjunto contiene el número 2")
} else {
    println("El conjunto no contiene el número 2")
}

//Conjuntos mutables

  //Función contains()
val PersonalD = mutableSetOf("María", "Becky", "Carolina", "David", "Karolina")

if (PersonalD.contains("Mario")) {
    println("El conjunto contiene al Señor Mario")
} else {
    println("El conjunto no contiene al Señor Mario")
}
}
