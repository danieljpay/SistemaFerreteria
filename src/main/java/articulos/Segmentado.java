package articulos;

public class Segmentado extends Tornillo {

    public Segmentado(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Coloque el tornillo encima de la superficie donde desee " +
                "colocarlo y use un desarmador plano para ajustarlo.";
        System.out.println(instruct);
        return instruct;
    }
}
