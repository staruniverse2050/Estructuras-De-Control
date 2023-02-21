//Algoritmo que solicite el nombre de una persona y 3 notas, calculando el promedio de ellas

fun main() {
    //Imprimimos un mensaje por consola y le pedimos que ingrese datos por teclado
    print("Ingrese un nombre: ")
    
    var nombre:String? = readLine()
    print("Ingrese la nota 1: ")
    
    var nota1:Double = readLine()!!.toDouble()
    print("Ingrese la nota 2: ")
    
    var nota2:Double = readLine()!!.toDouble()
    print("Ingrese la nota 3: ")
    
    var nota3:Double = readLine()!!.toDouble()
    
    var prom:Double = (nota1+nota2+nota3)/3
    
    //Redondeamos el promedio
    println("El promedio del estudiante $nombre fue de %.2f".format(prom))
    
    }