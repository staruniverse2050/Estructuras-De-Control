fun main(){
    //Algoritmo que convierta un mapa inmutable a mutable, recuerde utilizar la función toMutableMap().
    //Creación de mapa inmutable
  val Producto = mapOf(
      "producto1" to "Manzana",
      "producto2" to "Coco",
      "producto3" to "Suavitel"
  )
  //Función toMutableMap
  val Productos = Producto.toMutableMap() //Convierte el mapa inmutable a mutable
  println("Se ha modicado el mapa inmutable a mutable, quedaría de la siguiente manera: $Productos")
  }
  