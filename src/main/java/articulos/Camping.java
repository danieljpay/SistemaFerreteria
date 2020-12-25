package articulos;

public class Camping extends Linterna {

    public Camping(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Presionar botón Power para encender la linterna con luz fija, " +
                "si gusta tener un luz intermitente presione 2 veces el botón Power," +
                " para apagar la linerna solamente presiona una vez más el botón Power.";
        System.out.println(instruct);
        return instruct;
    }
}
