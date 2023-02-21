fun main(){
    //Algoritmo que devuelva los primeros elementos del primer conjunto que no están prsentes en otro conjunto, esta actividad deberá estar hecho en conjunto mutable y conjunto inmutable, tambien recuerde utilizar la función subtract.
    
    //Conjuntos inmutables
  
    //Función subtract()
  val CampoA = setOf(1, 2, 3, 8, 5)
  val CampoB = setOf(6, 7, 8, 9, 10)
  val elementos = CampoA.subtract(CampoB) // Devuelve los primeros elementos del primer conjunto que no están presentes en el segundo conjunto.
  println(elementos)
  
  //Conjuntos mutables
  
    //Función subtract()
  val PersonalD = mutableSetOf("María", "Becky", "Carolina", "David", "Karolina")
  val PersonalF = mutableSetOf("Aram", "Lola", "Carmen", "Lina", "David")
  val elemento = PersonalD.subtract(PersonalF) // Devuelve los primeros elementos del primer conjunto que no están presentes en el segundo conjunto.
  println(elemento)
  }
  