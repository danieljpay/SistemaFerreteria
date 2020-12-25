package articulos;

public class Ebanista extends Martillo {

    public Ebanista(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "El martillo ebanista tiene una parte donde puede golpear con " +
                "mayor superficie que un martillo normal y cuenta con otra parte de contraria, " +
                "con forma de L que ayuda a martillar superficies pequeñas con mayor precisión";
        System.out.println(instruct);
        return instruct;
    }
}
