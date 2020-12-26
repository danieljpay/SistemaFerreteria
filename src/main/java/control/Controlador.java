package control;

import articulos.*;

import java.util.ArrayList;

public class Controlador {
    private Carpintero martilloCarpintero;
    private Ebanista martilloEbanista;
    private Frontal linternaFrontal;
    private Camping linternaCamping;
    private Tijera escaleraTijera;
    private Extension escaleraExtension;
    private Estrella desarmadorEstrella;
    private Plano desarmadorPlano;
    private Phillips tornilloPhillips;
    private Segmentado tornilloSegmentado;
    private ArrayList<Herramienta> listaHerramientas;
    public ArrayList<Herramienta> carrito;

    public Controlador() {
        this.martilloCarpintero = new Carpintero(10, 25.50, "Martillo carpintero");
        this.martilloEbanista = new Ebanista(10, 32.20, "Martillo ebanista");
        this.linternaFrontal = new Frontal(10, 50.20, "linterna frontal");
        this.linternaCamping = new Camping(10, 21.30, "Linterna camping o de mano");
        this.escaleraTijera = new Tijera(10, 220, "Escalera en forma de tijera");
        this.escaleraExtension = new Extension(10, 310, "Escalera con extensión limitada");
        this.desarmadorEstrella = new Estrella(10, 34, "Desarmador funcional para tornillos Phillips");
        this.desarmadorPlano = new Plano(10, 29.50, "Desarmador funcional para tornillos Segmentado");
        this.tornilloPhillips = new Phillips(10, 8.50, "Tornillo con hendidura en forma de cruz en la parte superior");
        this.tornilloSegmentado = new Segmentado(10, 6, "Tornillo con línea hundida en la parte superior");
        this.listaHerramientas = new ArrayList<>();
        this.carrito = new ArrayList<>();
    }

    public void agregarACarrito(int indice) {
        Herramienta alCarrito = listaHerramientas.get(indice);
        alCarrito.setCantidadDisponible(1);
        carrito.add(alCarrito);
    }

    public void eliminarDelCarrito(int indice) {
        carrito.remove(indice);
    }

    public void realizarCompra() {
        for(int i = 0; i < carrito.size(); i++) {
            for (int j = 0; j < listaHerramientas.size(); j++) {
                if(carrito.get(i).getClass() == listaHerramientas.get(j).getClass()) {
                    listaHerramientas.get(j).setCantidadDisponible(listaHerramientas.get(j).getCantidadDisponible() - 1);
                }
            }
        }
    }

    public void limpiarCarrito() {
        carrito.clear();
    }

}
