class EmpleadoFijo(var salarioAnual: Double, var numPagas: Int, nombre: String, id: Int) : Empleado (nombre, id) {


    override fun calculaSalario(): Double {
        return salarioAnual / numPagas
    }
}