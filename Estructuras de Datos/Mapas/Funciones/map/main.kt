fun main(){
    //Algoritmo que una vez creado un mapa se puedan alterar los elementos en cuanto a su valor, hagalo con mapa mutable e inmutable, además, no olvide utilizar la función map().
    //Creación de mapa inmutable
  val mapaF = mapOf(
      "producto1" to 300.0,
      "producto2" to 500.0,
      "producto3" to 600.0
  )
  //Función map
  val Mapear = mapaF.map { (clave, valor) ->
      val NewClave = "nuevo_${clave}"
      val NewValor = valor * 1.1
      NewClave to NewValor
  }
  
  println("Se modificaron los precios de los productos a continuación los precios actuales: $Mapear\n")  // Devuelve el valor del nuevo mapa que será el precio del producto del mapa original multiplicado por 1.1 (un aumento del 10%).
  
      //Creación de mapa mutable
    val mapaD = mutableMapOf(
      "producto1" to 600.0,
      "producto2" to 200.0,
      "producto3" to 900.0
  )
  //Función map
  val Buscar = mapaD.map { (clave, valor) ->
      val nuevaClave = "nuevo_${clave}"
      val nuevoValor = valor * 1.1
      nuevaClave to nuevoValor
  }
  
  println("Se modificaron los precios de los productos a continuación los precios actuales: $Buscar") // Devuelve el valor del nuevo mapa que será el precio del producto del mapa original multiplicado por 1.1 (un aumento del 10%).
  }
  