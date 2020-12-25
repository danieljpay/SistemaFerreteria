package articulos;

public class Frontal extends Linterna {

    public Frontal(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Este tipo de linterna se coloca en la frente del usuario, " +
                "se ajusta con los elásticos que trae incluídos y una vez bien ajustada, " +
                "presionar el botón Power y apuntar hacia el adelante de la frente del usuario.";
        System.out.println(instruct);
        return instruct;
    }
}
