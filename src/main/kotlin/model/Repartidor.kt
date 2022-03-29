package model

class Repartidor: Empleado{

    var zona: String = " "

    constructor(nom: String, ed: Int, sal: Int, pl: Int, zon: String):
            super (nom, ed, sal, pl)

    init {
        this.zona = ""
    }

    constructor(zon: String){
        this.zona = zon
    }

    fun plus(edad: Int, zona: String) {
        if(edad < 25 && zona == "3"){
            salario += plus
            println("Recibió el Plus " + "- Salario: $salario \n")
        }else{
            println("No recibió el Plus " + "- Salario: $salario \n")
        }
    }

}