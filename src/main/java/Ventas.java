import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ventas {

    Producto producto=new Producto();

    private int idVenta;
    private double valorTotalVenta;
    private ArrayList<Producto> productosVendidos;
    private Date fechaHora;

    public Ventas() {

        this.idVenta = idVenta;
        this.productosVendidos = new ArrayList<>();
        this.valorTotalVenta=valorTotalVenta;
        this.fechaHora = new Date();

    }

    public int getIdVenta() {
        return idVenta;
    }
    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public double getValorTotalVenta() {
        return valorTotalVenta;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void agregarProducto(Producto producto, int cantidad){

        if(producto.getCantidadEnStock() >= cantidad){
            producto.setCantidadEnStock(producto.getCantidadEnStock()-cantidad);
            productosVendidos.add(producto);
            valorTotalVenta += producto.getPrecio()*cantidad;
        } else {
            System.out.println("uy, parece que se nos agoto el producto "+producto.getNombre());
        }
    }

    public double calcularValorTotal(){
        valorTotalVenta=0.0;
        for (Producto producto:productosVendidos){

            valorTotalVenta+=producto.getPrecio();
        }
        return valorTotalVenta;
    }
}



