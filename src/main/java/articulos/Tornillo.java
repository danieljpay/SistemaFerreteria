package articulos;

public abstract class Tornillo extends Herramienta {

    public Tornillo(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String usarHerramienta() {
        String verb = "usando tornillo...";
        System.out.println(verb);
        return verb;
    }

}
