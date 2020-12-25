package articulos;

public class Carpintero extends Martillo {

    public Carpintero(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "El martillo carpintero tiene una parte donde puede golpear y" +
                " en la parte de atrás cuenta con un saca clavos, siendo este de ayuda para" +
                " dos propósitos.";
        System.out.println(instruct);
        return instruct;
    }
}
