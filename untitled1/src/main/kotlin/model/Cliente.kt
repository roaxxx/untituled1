package model

class Cliente constructor(val nombre:String, var inversion:Int) {

    fun invertir(nInversion:Int){
        inversion = inversion + nInversion
    }
    fun retirar(retiro:Int){
        inversion = inversion - retiro
    }
    fun consultar():String = " El total del cliente es ${inversion}"
}