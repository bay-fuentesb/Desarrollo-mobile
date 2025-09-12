// Aquí deben dejar el código de la pregunta 2
// Ciclos  (10 puntos)
fun main(){
    data class Alumno(
        val nombre: String,
        val nota1: Int,
        val nota2: Int,
        val nota3: Int
    )
    val listaAlumno= listOf(
        Alumno("Alex", 55, 60, 40),
        Alumno("Iris", 30, 45, 62),
        Alumno("Juan", 50, 57, 63),
        Alumno("Nina", 68, 65, 60)
    )

    for (it in (listaAlumno)){
        val suma = it.nota1 + it.nota2 + it.nota3
        val prom = suma / 3
        val nombres = it.nombre
        println("el promedio de $nombres es: $prom")
    }
}