package ec.edu.ups.ppw.demojakarta.model;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "TBL_RIFA")

public class Rifa 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rif_id")
    private int id;
    
    @Column(name = "rif_nombre")
    private String nombre;
    
    @Column(name = "rif_razon")
    private String razon;
    
    @Column(name = "rif_fecha")
    private Date fecha;
    
    @Column(name = "rif_valor_boleto")
    private Float valorBoleto;
    
    @Column(name = "rif_cantidad_boletos")
    private int cantidadBoletos;
    
    // ONE TO MANY  RIFA-PREMIO
    @OneToMany
    @JoinColumn(name="rif_id")
    
    private List<Premio> premios;
    
    // ONE TO MANY  RIFA-BOLETO
    @OneToMany
    @JoinColumn(name="rif_id")
    
    private List<Boleto> boletos;

    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRazon() {
        return razon;
    }
    
    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Float getValorBoleto() {
        return valorBoleto;
    }
    
    public void setValorBoleto(Float valorBoleto) {
        this.valorBoleto = valorBoleto;
    }
    
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

}
