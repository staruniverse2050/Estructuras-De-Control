
//Algoritmo que solicite el nombre de n cantidad de personas que llegan a clases se permitirá el ingreso hasta que el usuario decida, el sistema deberá indicar el final de la cantidad de personas que llegaron

//Sintaxis
//while(condicion){
//Bloque de codigo a ejecutar
//}

fun main(){
  var respuesta:String? = "si"
  var contador:Int = 0 //Creamos un contador que será el que nos almacene ciertos datos y lo cuente, según las veces ingresadas
    
    while(respuesta == "si"){ //El ciclo se repetirá siempre y cuando la persona digite si a la pregunta, esto es una condición
      print("\nIngrese su nombre: ")
      val nombre:String? = readLine()
  
      println("Hola $nombre bienvenido a la clase! \n")
      contador++ // operador de incremento, representado por dos signos de suma ( ++ ), incrementa en la unidad al operando
      print("Ingrese si, si aún hay personas por entrar: ") //Este mensaje hará que el ciclo se repita infinitamente si la persona digita si
      respuesta = readLine()
    }
    //Finaliza el ciclo cuando la persona coloque algo diferente a la condición declarada
    println("Llegaron $contador Personas!")
    println("No se admiten mas estudiantes")
  }