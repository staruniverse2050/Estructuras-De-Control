fun main(){
    //Algoritmo que fusione los elementos de un conjunto con los elementos de otro conjunto recuerde que deberá utilizar la función union y deberá realizar este ejercicio con conjuntos inmutables y conjuntos mutables.
    
  //Conjuntos inmutables
  
    //Función union()
  val CampoA = setOf(1, 2, 3, 4, 5)
  val CampoB = setOf(6, 7, 8, 9, 10)
  val unir = CampoA.union(CampoB) // Devuelve la fusión entre ambas [1,2,3,4,5,6,7,8,9,10]
  println(unir)
  
  //Conjuntos mutables
  
    //Función union()
  val PersonalD = mutableSetOf("María", "Becky", "Carolina", "David", "Karolina")
  val PersonalF = mutableSetOf("Aram", "Lola", "Carmen", "Lina", "Sara")
  val fusion = PersonalD.union(PersonalF) // Devuelve la fusión entre ambas ["María","Becky","Carolina","David","Karolina","Aram", "Lola", "Carmen", "Lina", "Sara"]
  println(fusion)
  }
  