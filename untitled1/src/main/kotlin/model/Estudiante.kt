package model

class Estudiante {
    var promedio: Int = 0
    var nivel: String = " "
    val  vector = Array(10){0}
    //Llenado dinámico


    fun getScores(){
        for(i in 0 until  10) {
            println("Diguite la nota ${i}")
            vector[i] = readLine()!!.toInt()
        }
    }
    fun makeAverage(){
        for(i in vector) {
           promedio = promedio + i
        }
        promedio = (promedio/10)
        if(promedio >8 && promedio <= 10){
            nivel = "Alto"
        }else if(promedio >5 && promedio <=8){
            nivel = "medio"
        }else if(promedio<5){
            nivel = "bajo"
        }
    }
}