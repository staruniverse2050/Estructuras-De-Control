//Algoritmo que lea un número y determine si este es divisible entre 11

fun main() {
  //Pedimos por teclado la cantidad de veces que queremos que se repita el ciclo
  print("Ingrese la cantidad de números a procesar: ")
  val cantidad:Int = readLine()!!.toInt()

  //Creamos nuestro ciclo que empieza en 1 y termina según el usuario lo desee
  for(i in 1..cantidad){
    //Este mensaje se repetirá las veces que el usuario decida
    print("Ingrese un número: ")
    val numero:Int = readLine()!!.toInt()

    //Esta condición evalúa el numero que vaya ingresando el usuario dependiendo del mensaje que se repetirá varias veces
    if(numero % 11 == 0){
      println("El número es divisible entre 11")
    }else{
      println("El número no es divisible entre 11")
    }
  }
}