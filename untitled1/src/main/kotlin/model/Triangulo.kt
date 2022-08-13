package model

class Triangulo {
    var lado1 = 0
    var lado2 = 0
    var lado3 = 0
    fun isEquilatero(){
        println("Digite el lado 1")
        lado1 = readLine()!!.toInt()
        println("Digite el lado 2")
        lado2 = readLine()!!.toInt()
        println("Digite el lado 3")
        lado3 = readLine()!!.toInt()
        if(lado1==lado2 && lado3==lado1){
            println("Es equilatero")
        }else{
            println("no es equilatero")
        }

    }
}