package articulos;

public class Estrella extends Desarmador {

    public Estrella(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Coloca el desarmador estrella encima del tornillo a quitar y solamente " +
                "gira hacia el lado derecho para ajustar y hacia el lado izquierdo para quitar.";
        System.out.println(instruct);
        return instruct;
    }
}
