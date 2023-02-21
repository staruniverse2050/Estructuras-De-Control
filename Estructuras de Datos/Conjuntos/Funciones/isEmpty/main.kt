fun main(){
    //Algoritmo que imprima si el conjunto se encuentra vacío o no  (que no tiene elementos dentro), los cuales debe ser conjuntos inmutables con números y conjuntos inmutables con string
   
   //Conjuntos inmutables
   //Función isEmpty()
  val CampoA = setOf(1, 2, 3, 8, 5)
  if (CampoA.isEmpty()){ 
     println("El conjunto está vacío")
  } else {
     println("El conjunto no está vacío")
  }
  //Conjuntos mutables
  
   //Función isEmpty()
  val PersonalF = mutableSetOf<String>()
  if (PersonalF.isEmpty()){ 
     println("El conjunto está vacío")
  } else {
     println("El conjunto no está vacío")
  }
  }
  