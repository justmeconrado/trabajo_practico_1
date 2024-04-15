package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    private String nombre;
    private Long codigo;
    private double precio;
    private int descuento;

    // Constructor por defecto
    public Producto() {

    }

    // Constructor con parametros
    public String getNombre() {
        return nombre;
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    // Metodo CalcularDescuento
    public double CalcularDescuento() {
        double montoDescuento = 0;
        double auxiliar;
        double precioDescuento;

        // Si el descuento es mayor o igual a 0 se realiza el descuento.
        if (descuento >= 0) {
            auxiliar = (double) descuento / 100;
            montoDescuento = precio * auxiliar;
            precioDescuento = precio - montoDescuento;
        }
        // Si el descuento es menor a 0 no se realiza el descuento.
        else
        precioDescuento = precio - montoDescuento;
        return precioDescuento;
    }

}