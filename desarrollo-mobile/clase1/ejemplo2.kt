package clase1

fun main(){

    val a =25
    val b = 0
    fun sumar(a:Int, b:Int){
        print("Voy a sumar $a + $b = " )
        println(a+b)
    }
    fun restar(a:Int, b:Int){
        print("Voy a restar $a - $b = " )
        println(a-b)
    }

    fun multiplicar(a:Int, b:Int){
        print("Voy a multiplicando $a * $b = " )
        println(a*b)
    }
    fun dividir(a:Int, b:Int){
        print("Voy a dividir $a / $b = " )
        if (b ==0){
            print("no se puede dividir por 0")
        }else{
            println(a/b)
        }
    }
    fun modulo(a:Int, b:Int){
        print("Voy a Modular $a % $b = " )
        if (b ==0){
            print("no se puede hacer el modulo por 0")
        }else{
            println(a%b)
        }
    }

sumar(a,b)
restar(a,b)
multiplicar(a,b)
dividir(a,b)
modulo(a,b)

}