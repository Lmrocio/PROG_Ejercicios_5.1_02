abstract class Empleado (private val nombre: String,
                         private val id: Int){

    abstract fun calculaSalario() : Double

    override fun toString(): String {
        return "$nombre con ID-$id que tiene un sueldo mensual de ${"%.2f".format(this.calculaSalario())}"
    }
}