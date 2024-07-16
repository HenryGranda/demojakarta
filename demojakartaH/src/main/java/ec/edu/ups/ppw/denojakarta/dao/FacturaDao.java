package ec.edu.ups.ppw.denojakarta.dao;

import java.util.List;

import ec.edu.ups.ppw.demojakarta.model.Cliente;
import ec.edu.ups.ppw.demojakarta.model.Factura;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class FacturaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Factura factura) {
		em.persist(factura);
	}
	
	public void update(Factura factura) {
		em.merge(factura);
		
	}
	
	public void delete(String codigo) {
		Factura factura = this.read(codigo);
		em.remove(factura);
		
	}
	
	public Factura read(String codigo) {
	    Factura factura = em.find(Factura.class, codigo);
		return factura;
	}
	
	public List<Factura> getAll(){
		String jpql = "SELECT f FROM Factura f";
		Query query = em.createQuery(jpql,Factura.class);
		return query.getResultList();
	}

}
