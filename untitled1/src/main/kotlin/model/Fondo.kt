package model

class Fondo(var arrayClient: Array<Cliente?>) {
    fun prinTotal():String{
        var total = 0
        for( i in arrayClient){
            total += i!!.inversion
        }
        return "el total del fondo es: ${total}"
    }
}