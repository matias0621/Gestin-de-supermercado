package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    //Atributos: id, fecha, cliente, listaProductos, total
    private int idVenta;
    private static int contador=0;
    private LocalDateTime fecha;
    private Cliente cliente;
    private List<Producto> listaProductos;
    private double total;

    //Constructor
    public Venta(LocalDateTime fecha, Cliente cliente,double total) {

        this.idVenta = ++contador; //autoincremental para que cada venta sea unica
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<Producto>();
        this.total = total;
    }

    public Venta(LocalDateTime fecha, List<Producto> listaProductos, double total) {
        this.idVenta = ++contador;
        this.fecha = fecha;
        this.listaProductos = new ArrayList<Producto>();
        this.total = total;
    }

    //Metodos

    public int getIdVenta() {
        return idVenta;
    }

    public static int getContador() {
        return contador;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Supermercado Luna \n{" +
                "idVenta=" + idVenta +
                "\n fecha=" + fecha +
                "\n listaProductos=" + listaProductos +
                "\n total=" + total +
                '}';
    }
}