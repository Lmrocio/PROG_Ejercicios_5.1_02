fun main(){

    val ventas = Departamento("Ventas")


    val empleado1 = EmpleadoFijo(11810.0, 4, "Inda", 4431)
    val empleado2 = EmpleadoPorHora(4000.0, 4.0, "Adri", 9442)
    val empleado3 = EmpleadoFijo(1182.0, 2, "Rocío", 2343)

    ventas.agregarEmpleado(empleado1)
    ventas.agregarEmpleado(empleado2)
    ventas.agregarEmpleado(empleado3)

    ventas.mostrarEmpleado()


}