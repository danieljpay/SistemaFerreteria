package articulos;

public abstract class Escalera extends Herramienta {

    public Escalera(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String usarHerramienta() {
        String verb = "colocando la escalera...";
        System.out.println(verb);
        return verb;
    }

}
