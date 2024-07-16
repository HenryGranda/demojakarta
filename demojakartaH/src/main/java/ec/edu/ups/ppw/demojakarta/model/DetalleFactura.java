package ec.edu.ups.ppw.demojakarta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_DETALLE_FACTURA")
public class DetalleFactura {
	
	@Id
    @Column(name="det_codigo")
    private int codigo;

    @Column(name="det_cantidad")
    private int cantidad;

    @Column(name="det_precio")
    private Double precio;
    
    @Column(name="det_total")
    private Double total;
    
    

    
    public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@ManyToOne
    @JoinColumn(name = "fac_codigo")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "pro_codigo")
    private Producto producto;

	
    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
    
	  @Override
	    public String toString() {
	        return "[codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total 
	                + ", producto=" + (producto != null ? producto.getNombre() : "null") + "]";
	    }

}
