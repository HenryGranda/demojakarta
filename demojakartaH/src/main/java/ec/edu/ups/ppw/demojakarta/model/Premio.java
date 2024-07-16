package ec.edu.ups.ppw.demojakarta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PREMIO")

public class Premio {
	@Id
    @Column(name = "pre_id")
    private Integer id;
    
    @Column(name = "pre_descripcion")
    private String descripcion;
    
    @Column(name = "pre_valor")
    private Float valor;
    
    @Column(name = "rif_id")
    private Integer idRifa;

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Float getValor() {
        return valor;
    }
    
    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public Integer getIdRifa() {
        return idRifa;
    }
    
    public void setIdRifa(Integer idRifa) {
        this.idRifa = idRifa;
    }

}
