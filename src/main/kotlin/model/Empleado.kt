package model

open class Empleado {

    var nombre: String
    open var edad: Int
    open var salario: Int
    open val plus: Int

    constructor(){
        this.nombre = " "
        this.edad = 0
        this.salario = 0
        this.plus = 300
    }

    constructor(nom: String, ed: Int, sal: Int, pl: Int) {
        this.nombre = nom
        this.edad = ed
        this.salario = sal
        this.plus = pl
    }

}