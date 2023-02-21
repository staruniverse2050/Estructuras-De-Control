fun main(){
    //Algoritmo que convierta un conjunto inmutable en un conjunto mutable utilizando la función toMutableSet().
    
    //Conjuntos inmutables
  val CampoA= setOf(1, 2, 3, 4, 5)
    //Función toMutableSet()
  val CampoB = CampoA.toMutableSet() //Convierte un conjunto inmutable en un conjunto mutable.
  CampoB.add(6) //Agrega un elemento al conjunto
  
  println(CampoB)
  }
  