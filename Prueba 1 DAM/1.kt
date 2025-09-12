// Aquí deben dejar el código de la pregunta 1
// Colecciones (10 puntos)
fun main(){
    val numeros = listOf(1, 4, 12, 4, 5, 45, 8, 10)
    //lista de numeros impares
    val numImpar = numeros.filter { it % 2 != 0 }
    println(numImpar)
    //encontrar primer numeros mayor a 11
    println(numeros.find { it > 11 })
    //encontrar primer y ultimo numero de la lista y sumarlo
    val primerNum = numeros.first()
    val ultimoNum = numeros.last()
    println(primerNum + ultimoNum)

}