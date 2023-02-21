//Sintaxis
//do {
// Bloque de código a ejecutar
//} while (condición)

//Algoritmo que solicite n cantidad de números hasta que el usuario ingrese el número 10

fun main() {
var numero:Int
  //Creamos el ciclo con el mensaje que queremos mostrar, es decir, el mensaje que se repetirá infinitamente hasta cumplir ocn la condición dada en el while
  do{
    print("Ingrese un número: ")
    numero = readLine()!!.toInt()
    
  }while(numero != 10) //Si la condición se cumple, el ciclo se detendrá, sino, entonces seguirá imprimiendo el mensaje anterior infinitamente
  println("Excelente, el número era $numero")
}