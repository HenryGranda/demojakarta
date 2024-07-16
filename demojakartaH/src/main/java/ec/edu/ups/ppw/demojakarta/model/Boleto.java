package ec.edu.ups.ppw.demojakarta.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_BOLETO")

public class Boleto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bol_id")
	private int boletoId;
	
	@Column(name="bol_fechaVenta")
	private String fechaVenta;

	public int getBoletoId() {
		return boletoId;
	}

	public void setBoletoId(int boletoId) {
		this.boletoId = boletoId;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	
	@ManyToOne
	@JoinColumn(name="rif_id")
	private Rifa rifa;
	
	@ManyToOne
	@JoinColumn(name="cli_id")
	private Cliente clientes;
	     
}
