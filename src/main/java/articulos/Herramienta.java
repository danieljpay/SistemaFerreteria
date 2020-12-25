/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

/**
 *
 * @author DanielPerez
 */
public abstract class Herramienta implements Articulo {
    private int cantidadDisponible;
    private double precio;
    private String descripcion;

    public Herramienta(int cantidadDisponible, double precio, String descripcion) {
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public abstract String usarHerramienta();

    @Override
    public abstract String mostrarInstructivoUso();
}
