// Aquí deben dejar el código de la pregunta 4
// Condicionales (10 puntos)

fun main(){
    val edad = 15

    //validar que la edad sea mayor o menor edad
    if (edad >0 && edad < 150) {
        if (edad >= 18) {
            println("la persona es mayor de edad")
        } else {
            println("la persona es menor de edad")
        }
    }else{
        println("el valor debe ser menor que 150")
    }
}