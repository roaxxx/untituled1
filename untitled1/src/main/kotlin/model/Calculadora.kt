package model

class Calculadora constructor(val numA:Double,val numb:Double){

    fun sumar():Double = numA + numb
    fun restar():Double = numA - numb
    fun multiplicar():Double = numA * numb
    fun dividir(): Double = if(numb==0.0){ numA/numb }else{ 0.0}
}
