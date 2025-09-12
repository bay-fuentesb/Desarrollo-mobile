// Aquí deben dejar el código de la pregunta 3
// Funciones de orden superior (10 puntos)

fun main(){
    fun operacion(x: Int, y: Int,operacion:(Int,Int) -> Int): Int {
        return operacion(x ,y )
    }
    val suma = operacion(2,2, ){ a,b -> a + b}
    println(suma)
    val multiplicacion = operacion(2, 2){ a,b -> a * b}
    println(multiplicacion)

}