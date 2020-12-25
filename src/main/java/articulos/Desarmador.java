package articulos;

public abstract class Desarmador extends Herramienta {

    public Desarmador(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String usarHerramienta() {
        String verb = "usando desarmador...";
        System.out.println(verb);
        return verb;
    }

}
