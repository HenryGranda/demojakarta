package ec.edu.ups.ppw.demojakarta.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PRODUCTO")
public class Producto {
	
	@Id
    @Column(name="pro_codigo")
    private int codigo;
	
	@Column(name="pro_nombre")
    private String nombre;

    @Column(name="pro_precio")
    private double precio;

    @Column(name="pro_stock")
    private int stock;



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
    
    

}

