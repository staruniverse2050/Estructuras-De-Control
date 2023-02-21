//Algoritmo que solicite el ingreso de un número e indique si es positivo o negativo

fun main() {
  print("Ingrese un número: ")
  val num:Int = readLine()!!.toInt()

  //Creamos una condición
  if(num > 0){ //Si es verdadera entrará a esta condición
    println("El número es positivo")
  }else{ //Si es falsa entrará al NO
    println("El número es negativo")
  }
  //Mensaje que dice cual es el número ingresado
  println("El número es: $num")
}