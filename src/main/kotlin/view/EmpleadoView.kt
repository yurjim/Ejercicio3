package view
import model.Empleado
import model.Comercial
import model.Repartidor

class EmpleadoView {
    fun Menu(){

        val comercial1 = Comercial("Ana", 45, 500,300,300)
        val comercial2 =Comercial("Pablo", 20, 500,300,100)

        println(comercial1.plus(50, 300))
        println(comercial2.plus(20, 100))

        val repartidor1 = Repartidor("Juan", 24, 500, 300," 3 ")
        val repartidor2 = Repartidor("Maria", 36, 500,300," 1 ")

        println(repartidor1.plus(24, "3"))
        println(repartidor2.plus(36, "1"))
    }
}