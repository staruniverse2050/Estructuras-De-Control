fun main(){
    //Algoritmo que devuelva el número (elemento) que tienen en común ambos conjuntos con conjunto inmutable y conjunto inmutable haga que no devuelva nada (recuerde que para que esto suceda no deben de tener elementos en común los conjuntos)
    //Conjuntos inmutables
  
    //Función intersect()
  val CampoA = setOf(1, 2, 3, 8, 5)
  val CampoB = setOf(6, 7, 8, 9, 10)
  val elementos = CampoA.intersect(CampoB) // Devuelve un 8 (ya que se encuentra en ambos conjuntos)
  println(elementos)
  
  //Conjuntos mutables
  
    //Función intersect()
  val PersonalD = mutableSetOf("María", "Becky", "Carolina", "David", "Karolina")
  val PersonalF = mutableSetOf("Aram", "Lola", "Carmen", "Lina", "David")
  val elemento = PersonalD.intersect(PersonalF) // No devuelve nada porque no comparten elementos en común
  println(elemento)
  }