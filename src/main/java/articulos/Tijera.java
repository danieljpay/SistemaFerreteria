package articulos;

public class Tijera extends Escalera {

    public Tijera(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Este tipo de escalera es desplegable para quedar más compacta, " +
                "se puede extender para formar un triángulo y tener un apoyo más firme en la parte" +
                " delantera donde usted se subirá. Solamente separe en dos la escalera para extenderla.";
        System.out.println(instruct);
        return instruct;
    }
}
