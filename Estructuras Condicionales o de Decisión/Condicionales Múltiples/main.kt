
//Algoritmo que permita saber si una pareja a logrado llegar a las bodas de oro y diga cuanto llevan de casados

//Condicionales multiples (else if) 

//Se importan paquetes de java para importar las diferentes clases que vamos a utilizar
import java.text.SimpleDateFormat  //clase que nos ayuda a mostrar las fechas en el formato que queramos o a reconstruirlas a partir de una cadena de texto.
import java.util.* 
import java.util.Date //indica la fecha actual

fun main(){
  print("¿En qué año se casó con su pareja? ")
  var matrimonio:Int = readLine()!!.toInt()

  
  val formato = SimpleDateFormat("yyyy") //Mostramos solamente el año
  val fecha = formato.format(Date()) //Decimos que nos traiga el año actual
  val año:Int = Integer.valueOf(fecha) //Convertimos a entero la fecha

  var años_casados:Int = (año-matrimonio)

  if(años_casados >= 50){
    println("Felicidades han llegado al aniversaro de las bodas de oro, llevan casados $años_casados año(s)")
    
  }else if(años_casados >=50 && años_casados == 1){
    println("Aún no han llegado a las bodas de oro, llevan casados $años_casados año")
  }else{
    println("Aún no han llegado a las bodas de oro, llevan casados $años_casados años")
    
  }
}

