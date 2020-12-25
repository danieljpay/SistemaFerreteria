package articulos;

public class Phillips extends Tornillo {

    public Phillips(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Coloque el tornillo encima de la superficie donde desee " +
                "colocarlo y use un desarmador estrella para ajustarlo.";
        System.out.println(instruct);
        return instruct;
    }
}
