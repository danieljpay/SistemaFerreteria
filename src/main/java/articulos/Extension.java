package articulos;

public class Extension extends Escalera {

    public Extension(int cantidadDisponible, double precio, String descripcion) {
        super(cantidadDisponible, precio, descripcion);
    }

    @Override
    public String mostrarInstructivoUso() {
        String instruct = "Coloque la escalera en posición vertical y jalar la parte superior de " +
                "esta para extenderla y poder llegar a lugares más lejanos, una vez que la extienda con la" +
                " medida necesaria, puede asegurarla para que esta se mantenga en la medida deseada.";
        System.out.println(instruct);
        return instruct;
    }
}
