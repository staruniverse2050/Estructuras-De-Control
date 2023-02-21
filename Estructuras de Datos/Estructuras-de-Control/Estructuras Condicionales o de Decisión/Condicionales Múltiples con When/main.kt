//Algoritmo que dependiendo del codigo ingresado, realice la acción correspondiente

fun main() {
  //Creamos una cadena multilinea
  var menu:String? = """
  Menu opciones
  1. Saludo
  2. Digitar nombre de una persona
  3. Suma de 2 números
  
  Ingrese una opción: 
  """
  print(menu)
  
  var opcion:Int = readLine()!!.toInt()
  
  //Empezamos hacer uso de la estructura when
  when(opcion){
  //Creamos nuestras condiciones
    1 -> println("Hola Señor Usuario")
    2 -> {
      print("Ingrese el nombre de una persona: ")
      val nombre:String? = readLine()
      println("Hola $nombre")
    }
    3 -> {
    print("Ingrese el primer número: ")
    val num1:Int = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2:Int = readLine()!!.toInt()
    val suma:Int = (num1+num2)
    println("La suma de $num1 + $num2 = $suma")
  }
  //Creamos la condición de negación, si ninguna de las anteriores se llega a cumplir, entonces se ejecutará esta
  else -> println("Opción inválida")
  }
  }
  