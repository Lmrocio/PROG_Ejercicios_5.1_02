class EmpleadoPorHora(var horasTrabajadas: Double, var tarifaPorHora: Double, nombre: String, id: Int) : Empleado(nombre, id){

    override fun calculaSalario(): Double{
        return horasTrabajadas * tarifaPorHora
    }
}