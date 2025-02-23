class EmpleadoPorHora(var horasTrabajadas: Double,
                      var tarifaPorHora: Double,
                      nombre: String,
                      id: Int) : Empleado(nombre, id){


    init {
        require(id.toString().length == 4){"El ID debe contar siempre con 4 posiciones numéricas"}
    }

    /**
     * Reescribe la función heredada de la clase Empleado para calcular el salario mensual con las horas
     * trabajadas y la tarifa por horas
     *
     * @return Double
     */
    override fun calculaSalario(): Double{
        return horasTrabajadas * tarifaPorHora
    }
}