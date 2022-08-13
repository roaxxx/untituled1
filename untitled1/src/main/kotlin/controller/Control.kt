package controller

import model.*
import view.IOManager

class Control {

    val iom = IOManager()
    val std = Estudiante()
    val wk = Trabajador()

    fun init(){
        val clients = iom.readInt("Diguite el número de clientes")
        val arrayCliente = Array<Cliente?>(clients){null}

        for (i in 0 until clients){
            val cl = Cliente(iom.readString("Digite el nombre"),iom.readInt("Digite la inversion"))
            arrayCliente[i] = cl
        }

        val cl1 = arrayCliente[1]

        print("El cliente: ${cl1?.nombre} tiene ${cl1?.consultar()} retira ${cl1?.retirar(iom.readInt("El retiró"))} " +
                "tiene ${cl1?.consultar()} ")

        val cl = Cliente(iom.readString("Digite el nombre"),iom.readInt("Digite la inversion"))
        val fondo = Fondo(arrayCliente)
        print(fondo.prinTotal())
    }

    fun makeCal(){
        val cal = Calculadora(9.0,8.0)
        println("Suma ${cal.sumar()} resta:" +
                " ${cal.restar()} multiplicar " +
                "${cal.multiplicar()} " +
                "dividir ${cal.dividir()}")

    }
    fun makeTriagule(){
        val tg = Triangulo()
        tg.isEquilatero()
    }
    fun estudenC(){
        wk.getSalario(iom.readInt("Ingrese la cantidad de salarios: "))
    }
    fun makeSalari(){
        std.getScores()
        std.makeAverage()
        val nivel: String = std.nivel
        println("El promedio es ${std.promedio} y el nivel es ${nivel}")
    }
}