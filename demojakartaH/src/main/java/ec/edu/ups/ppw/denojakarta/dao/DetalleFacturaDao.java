package ec.edu.ups.ppw.denojakarta.dao;

import java.util.List;


import ec.edu.ups.ppw.demojakarta.model.DetalleFactura;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DetalleFacturaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(DetalleFactura detallefactura) {
		em.persist(detallefactura);
	}
	
	public void update(DetalleFactura detallefactura) {
		em.merge(detallefactura);
		
	}
	
	public void delete(String codigo) {
		DetalleFactura detallefactura = this.read(codigo);
		em.remove(detallefactura);
		
	}
	
	public DetalleFactura read(String codigo) {
		DetalleFactura detallefactura = em.find(DetalleFactura.class, codigo);
		return detallefactura;
	}
	
	public List<DetalleFactura> getAll(){
		String jpql = "SELECT d FROM DetalleFactura d";
		Query query = em.createQuery(jpql,DetalleFactura.class);
		return query.getResultList();
	}

}
