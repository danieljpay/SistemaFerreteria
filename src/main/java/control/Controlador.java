package control;

import articulos.*;
import errores.CantidadCeroExcepcion;

import java.util.ArrayList;
import javax.swing.*;

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
    public ArrayList<Herramienta> listaCarrito;
    public DefaultListModel modeloHerramientas;
    public DefaultListModel modeloCarrito;

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
        this.listaCarrito = new ArrayList<>();
        this.modeloHerramientas = new DefaultListModel();
        this.modeloCarrito = new DefaultListModel();
        iniciarListaHerramientas();
    }

    public ArrayList<Herramienta> getListaHerramientas() {
        return listaHerramientas;
    }

    public ArrayList<Herramienta> getListaCarrito() {
        return listaCarrito;
    }

    public DefaultListModel getModeloHerramientas() {
        return modeloHerramientas;
    }

    public DefaultListModel getModeloCarrito() {
        return modeloCarrito;
    }
    
    private void iniciarListaHerramientas() {
        modeloHerramientas.addElement("Martillo carpintero");
        listaHerramientas.add(this.martilloCarpintero);
        modeloHerramientas.addElement("Martillo ebanista");
        listaHerramientas.add(martilloEbanista);
        modeloHerramientas.addElement("Linterna frontal");
        listaHerramientas.add(this.linternaFrontal);
        modeloHerramientas.addElement("Linterna camping");
        listaHerramientas.add(this.linternaCamping);
        modeloHerramientas.addElement("Escalera tijera");
        listaHerramientas.add(this.escaleraTijera);
        modeloHerramientas.addElement("Escalera extensión");
        listaHerramientas.add(this.escaleraExtension);
        modeloHerramientas.addElement("Desarmador estrella");
        listaHerramientas.add(this.desarmadorEstrella);
        modeloHerramientas.addElement("Desarmador plano");
        listaHerramientas.add(this.desarmadorPlano);
        modeloHerramientas.addElement("Tornillo Phillips");
        listaHerramientas.add(this.tornilloPhillips);
        modeloHerramientas.addElement("Tornillo segmentado");
        listaHerramientas.add(this.tornilloSegmentado);
    }

    public void agregarACarrito(int indice) {
        try {
            if(this.listaHerramientas.get(indice).getCantidadDisponible() != 0) {
                Herramienta alCarrito = this.listaHerramientas.get(indice);
                this.listaCarrito.add(alCarrito);
                this.modeloCarrito.addElement(this.modeloHerramientas.get(indice));
            } else {
                throw new CantidadCeroExcepcion("Este artículo está agotado.");
            }
        } catch(CantidadCeroExcepcion e1) {
            String mensaje = "Este artículo se encuentra agotado.";
            String titulo = "Artículo no disponible";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarDelCarrito(int indice) {
        this.listaCarrito.remove(indice);
        this.modeloCarrito.remove(indice);
    }

    public void realizarCompra() {
        ArrayList<Integer> cantidades = new ArrayList<>();
        try{
            for(Herramienta cadaHerramienta: listaHerramientas) {
                cantidades.add(cadaHerramienta.getCantidadDisponible());
            }

            for(int i = 0; i < this.listaCarrito.size(); i++) {
                for (int j = 0; j < this.listaHerramientas.size(); j++) {
                    if(this.listaCarrito.get(i).getClass() == this.listaHerramientas.get(j).getClass()) {
                        if(this.listaHerramientas.get(j).getCantidadDisponible() == 0) {
                            throw new CantidadCeroExcepcion("Este artículo está agotado.");
                        }
                        this.listaHerramientas.get(j).setCantidadDisponible(this.listaHerramientas.get(j).getCantidadDisponible() - 1);
                    }
                }
            }
            this.listaCarrito.clear();
            this.modeloCarrito.clear();
        } catch(CantidadCeroExcepcion e1) {
            String mensaje = "Este artículo se agotó en medio de su compra, por lo que no se completará la compra." +
                    " Por favor, revise su carrito de compra.";
            String titulo = "Artículo agotado";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            for(int k = 0; k < listaHerramientas.size(); k++) {
                listaHerramientas.get(k).setCantidadDisponible(cantidades.get(k));
            }
        }
    }

    public void limpiarCarrito() {
        this.listaCarrito.clear();
        this.modeloCarrito.clear();
    }

}
