fun main(){

    //Algoritmo que tenga una condición if else y 
    //dependiendo del valor de los pares imprimir si hay campos repetidos o no, 
    //recuerde utilizar la función equals().
    //Creación de pares
  
    //Función equals
  val Aprendiz1 = Pair("Karen", 25)
  val Aprendiz2 = Pair("Karen", 25)
  val Aprendiz3 = Pair("Pablo", 30)
  
  if(Aprendiz1.equals(Aprendiz2) || Aprendiz1.equals(Aprendiz3)) {
    println("Hay campos repetidos")
  }else{
    println("No hay campos repetidos")
  }
  }
  