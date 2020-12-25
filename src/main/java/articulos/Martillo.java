package articulos;

public abstract class Martillo extends Herramienta {

    public Martillo(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String usarHerramienta() {
        String verb = "martillando...";
        System.out.println(verb);
        return verb;
    }

}
