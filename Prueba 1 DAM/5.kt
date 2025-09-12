// Aquí deben dejar el código de la pregunta 5
// Clases y Herencia (20 puntos)
fun main(){
    //clase padre persona
    open class Persona(
        val nombre: String,
        val edad: Int,
        val rut: String
            ) {
        open fun mostrarInfo() {
            println("nombre: $nombre, edad: $edad, rut: $rut")
        }
    }
//clase hija profesor
    class Profesor(
        nombre: String,
        edad: Int,
        rut: String,
        val especialidad: String
    ): Persona(nombre, edad, rut){
        override fun mostrarInfo() {
            println("nombre: $nombre, edad: $edad, rut: $rut, especialidad: $especialidad")
        }
        fun Explicar(nombre: String) {
            println("el profesor $nombre le enseña sobre $especialidad al estudiante")
        }
    }
//clase hijo Estudiante
    class Estudiante(
        nombre: String,
        edad: Int,
        rut: String,
        val matricula: Int,
        val carrera: String
    ): Persona(nombre, edad, rut){
        override fun mostrarInfo(){
            println("nombre: $nombre, edad: $edad, rut: $rut, val: $matricula, carrera: $carrera")
        }
        fun Estudiar(especialidad: String){
            println("el alumno aprende sobre $especialidad ")
        }
    }


// dando valores a clases profesor y estudiante
    val profe = Profesor("Carlos", 35, "10.598.632.8", "Especialista en sistemas")
    val alumno = Estudiante("marco", 20, "20.526.962.7", 6432, "ingenieria Informatica")
    profe.Explicar(alumno.nombre )
    alumno.Estudiar(profe.especialidad +" del profesor "+  profe.nombre)
    profe.mostrarInfo()
    alumno.mostrarInfo()
}