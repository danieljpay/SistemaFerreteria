package articulos;

public class prueba {
    public static void main(String[] args) {
        Herramienta martillitoCarpintero = new Carpintero(2, 24, "Martillo con doble propósito");
        System.out.println(martillitoCarpintero.getCantidadDisponible());
        System.out.println(martillitoCarpintero.getDescripcion());
        System.out.println(martillitoCarpintero.getPrecio());

        Herramienta martillitoEbanista = new Ebanista(4, 47,
                "Martillo antiguo para mayor precisión en superfies pequeñas."
        );
        System.out.println(martillitoEbanista.getCantidadDisponible());
        System.out.println(martillitoEbanista.getDescripcion());
        System.out.println(martillitoEbanista.getPrecio());

        Herramienta linternaFrontal = new Frontal(3, 31, "Linterna que el usuario se " +
                "puede colocar en su frente.");
        System.out.println(linternaFrontal.getCantidadDisponible());
    }
}
