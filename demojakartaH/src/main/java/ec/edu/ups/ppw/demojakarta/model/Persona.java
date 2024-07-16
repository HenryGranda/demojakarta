package ec.edu.ups.ppw.demojakarta.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PERSONA")
public class Persona {
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="per_cedula")
    private String cedula;
	
	@Column(name="per_nombre")
	private String nombre;
	
	@Column(name="per_direccion")
	private String direccion;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@OneToMany(mappedBy = "cliente",cascade=CascadeType.ALL)
    private List<Factura> facturas;

}
