class Departamento(val nombre: String) {

    var listaEmpleado = mutableListOf<Empleado>()

    constructor(nombre: String, listaEmpleado: MutableList<Empleado>):this(nombre){
        this.listaEmpleado = listaEmpleado
    }

    /**
     * Almacena a los empleados en una lista.
     *
     */
    fun agregarEmpleado(empleado: Empleado){
        listaEmpleado.add(empleado)
    }

    /**
     * Recorre la lista de empleados, llamando a la función calcularSalario() de la clase
     * empleado y añade ese salario mensual a salarioTotal para calcular el total a pagar a
     * todos los empleados.
     *
     * @return salarioTotal:Double
     */
    fun calculaSalariTotal(): Double{
        var salarioTotal = 0.0

        for(empleado in listaEmpleado){

            salarioTotal += empleado.calculaSalario()
        }

        return salarioTotal
    }

    /**
     * Recorre la lista de empleados para mostrar la información de cada uno.
     */
    fun mostrarEmpleado(){
        for(empleado in listaEmpleado){
            println(empleado)
        }
    }
}