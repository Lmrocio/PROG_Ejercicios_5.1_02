class EmpleadoFijo(var salarioAnual: Double, var numPagas: Int, nombre: String, id: Int) : Empleado (nombre, id) {


    init {
        require(id.toString().length == 4){"El ID debe contar siempre con 4 posiciones numéricas"}
    }

    /**
     * Reescribe la función heredada de la clase Empleado para calcular el salario mensual el salario
     * anual y el número de pagas.
     *
     * @return Double
     */
    override fun calculaSalario(): Double {
        return salarioAnual / numPagas
    }
}