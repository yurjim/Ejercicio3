package model

class Comercial: Empleado {

    var comision: Int
    override var edad: Int = 0
    override var salario: Int = 0
    override val plus: Int = 300

    constructor(nom: String, ed: Int, sal: Int, pl: Int, comision: Int):
            super (nom, ed, sal, pl)

    init {
        this.comision = 0
    }

    constructor(com: Int){
        this.comision = com
    }

    fun plus(edad: Int, comision: Int) {
        if(edad > 30 && comision > 200){
            salario += plus
            println("Recibió el Plus " + "- Salario: $salario \n")
        }else{
            println("No recibió el Plus " + "- Salario: $salario \n")
        }
    }
}