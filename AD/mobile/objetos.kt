package mobile

import kotlin.time.times

// =============================================================================
// EJEMPLO: Crear un objeto Pokemon en Kotlin
// =============================================================================


// crearemos un objeto para representar un pokemon
open class Pokemon(
    // aquí van las propiedades del objeto
    val nombre: String,

    var hp: Int,
    var atk: Int,
    var atkSp: Int,
    var def: Int,
    var defSp: Int,
    var estado: String = "normal"
)
{
    // aquí van los métodos del objeto
    fun info(){
        println("$nombre | HP:$hp | ATK:$atk | atkSp: $atkSp | def: $def | defSp: $defSp | estado: $estado")
    }
    fun DanoFisico(dano: Int) {
        val danoFinal = (dano - def).coerceAtLeast(0)  // Asegura que el daño no sea negativo
        println("$nombre recibe $danoFinal de daño")
        hp -= danoFinal
        if (hp < 0){
            hp = 0
            println("$nombre ha sido derrotado")
        }
    }
    fun cambioEstado(Nuev_Estado: String){
        estado = Nuev_Estado
        println("$nombre ahora está $Nuev_Estado")
    }

    fun estaVivo(): Boolean {
        return hp > 0
    }
}
class TipoFuego(nombre:String, hp:Int, atk: Int, atkSp: Int, def: Int, defSp: Int ): Pokemon(nombre, hp, atk, atkSp, def, defSp){
    fun stab(){
        atk += 10
        atkSp += 10
        println("⚔️ $nombre aumenta su ataque en 10! Ataque actual: $atk")
        println("⚔️ $nombre aumenta su ataque espacial en 10  Ataque especial actual: $atkSp")
    }



}


fun main(){
    val chan = Pokemon("chandelure", 60, 55, 145, 90,90 )
    val char = Pokemon("Charmeleon", 58, 64, 80, 64, 65)
    // Mostrar información antes de recibir daño
    chan.info()
    char.info()

    // Charmeleon ataca a Chandelure
    chan.DanoFisico(char.atk)  // Chandelure recibe daño según el ataque de Charmeleon
    chan.info()  // Verificar la nueva vida de Chandelure


}
