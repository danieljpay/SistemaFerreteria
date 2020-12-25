package articulos;

public abstract class Linterna extends Herramienta {

    public Linterna(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String usarHerramienta() {
        String verb = "alumbrando...";
        System.out.println(verb);
        return verb;
    }

}
