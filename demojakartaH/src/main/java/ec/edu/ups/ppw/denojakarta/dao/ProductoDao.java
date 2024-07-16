package ec.edu.ups.ppw.denojakarta.dao;

import java.util.List;

import ec.edu.ups.ppw.demojakarta.model.Cliente;
import ec.edu.ups.ppw.demojakarta.model.Producto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ProductoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Producto producto) {
		em.persist(producto);
	}
	
	public void update(Producto producto) {
		em.merge(producto);
		
	}
	
	public void delete(String codigo) {
		Producto producto = this.read(codigo);
		em.remove(producto);
		
	}
	
	public Producto read(String codigo) {
	    Producto producto = em.find(Producto.class, codigo);
		return producto;
	}
	
	public List<Producto> getAll(){
		String jpql = "SELECT p FROM Producto p";
		Query query = em.createQuery(jpql,Producto.class);
		return query.getResultList();
	}
	

}
