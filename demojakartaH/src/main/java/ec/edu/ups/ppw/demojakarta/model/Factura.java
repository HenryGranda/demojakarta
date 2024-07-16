package ec.edu.ups.ppw.demojakarta.model;


import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_FACTURA")
public class Factura {
	
	@Id
    @Column(name="fac_codigo")
    private int codigo;

    @Column(name="fac_fecha")
    private Date fecha;
    
    
    @ManyToOne
    @JoinColumn(name = "per_cedula")
    private Persona cliente;

    @OneToMany(mappedBy = "factura",cascade=CascadeType.ALL)
    private List<DetalleFactura> detallesFactura;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public List<DetalleFactura> getDetallesFactura() {
		return detallesFactura;
	}

	public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
		this.detallesFactura = detallesFactura;
	}
	
	@Override
    public String toString() {
        return "[#Factura=" + codigo + ", fecha=" + fecha + ", cliente=" + (cliente != null ? cliente.getNombre() : "null")
                + ", detalles=" + detallesFactura + "]";
    }

    
    
}
