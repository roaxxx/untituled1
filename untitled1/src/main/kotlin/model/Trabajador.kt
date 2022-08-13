package model

class Trabajador {
    var salario: Int = 0

    fun getSalario(cantidadS:Int){
        val  vector = Array(cantidadS){0}
        for (i in 0 until cantidadS){
            println("diguite el salario")
            vector[i] = readLine()!!.toInt()
        }
        printArraySalario(vector)
    }
    fun printArraySalario(vector: Array<Int>) {
        for(i in vector){
            println("El salario es ${i}")
        }
    }
}