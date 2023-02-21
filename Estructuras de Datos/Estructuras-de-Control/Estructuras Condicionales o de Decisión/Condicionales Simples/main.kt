//Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique que la persona es menor de edad

fun main() {
  print("Ingrese la edad: ")
  val edad:Int = readLine()!!.toInt()

  //Creamos una condición que evaluará un dato, si resulta verdadero, entrará a ella
  if(edad < 18){
    println("La persona es menor de edad")
  }
  //Si no cumple con la condición, solamente imprimirá este mensaje
  println("La edad es: $edad")
}