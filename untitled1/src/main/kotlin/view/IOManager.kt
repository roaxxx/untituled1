package view

class IOManager {

    fun printMessage(message: String){
        print(message)
    }

    fun readString(message:String):String{
        print(message)
        return readln()
    }

    fun readInt(message:String):Int{
        print(message)
        return readLine()!!.toInt()
    }

    fun readDouble(message:String):Double{
        return readLine()!!.toDouble()
    }

}