class Departamento(val nombre: String) {

    var listaEmpleado = mutableListOf<Empleado>()

    constructor(nombre: String, listaEmpleado: MutableList<Empleado>):this(nombre){
        this.listaEmpleado = listaEmpleado
    }

    fun agregarEmpleado(empleado: Empleado){
        listaEmpleado.add(empleado)
    }

    fun calculaSalariTotal(): Double{
        var salarioTotal = 0.0

        for(empleado in listaEmpleado){

            salarioTotal += empleado.calculaSalario()
        }

        return salarioTotal
    }

    fun mostrarEmpleado(){
        for(empleado in listaEmpleado){
            println(empleado)
        }
    }
}