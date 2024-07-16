package ec.edu.ups.ppw.demojakarta.buisness;

import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.demojakarta.model.Cliente;
import ec.edu.ups.ppw.demojakarta.model.DetalleFactura;
import ec.edu.ups.ppw.demojakarta.model.Factura;
import ec.edu.ups.ppw.demojakarta.model.Persona;
import ec.edu.ups.ppw.demojakarta.model.Producto;
import ec.edu.ups.ppw.denojakarta.dao.ClienteDao;
import ec.edu.ups.ppw.denojakarta.dao.DetalleFacturaDao;
import ec.edu.ups.ppw.denojakarta.dao.FacturaDao;
import ec.edu.ups.ppw.denojakarta.dao.PersonaDao;
import ec.edu.ups.ppw.denojakarta.dao.ProductoDao;
import jakarta.annotation.PostConstruct;
@Startup
@Singleton
public class Inicio {
	
	@Inject
	private ClienteDao daoCliente;
	
	@Inject
	private PersonaDao daoPersona;
	
	@Inject
	private FacturaDao daoFactura;
	
	@Inject
	private DetalleFacturaDao daoDetalleFactura;
	
	@Inject
	private ProductoDao daoProducto;
	
	@PostConstruct
	public void init() {
		//System.out.println("Hola munda EJB");

	    
	    Cliente cliente = new Cliente();
		cliente.setCedula("1234567891");
		cliente.setNombre("Henry Granda");
		cliente.setDireccion("Uncovia");
		//cliente.setEmail("huambi123@gmail.com");
		daoCliente.insert(cliente);
		
		/*Persona persona = new Persona();
		persona.setCedula("1401070857");
		persona.setNombre("Henry Granda");
		persona.setDireccion("Uncovia");
		
		daoPersona.insert(persona);
		
		List<Persona> listado = daoPersona.getAll();
		
		for(Persona per:listado) {
			System.out.println(per.getCedula()+ " " + per.getNombre() );
		}
		
		
		Producto producto = new Producto();
		producto.setCodigo(01);
		producto.setPrecio(12.12);
		producto.setStock(100);
		producto.setNombre("camisa");
		
		daoProducto.insert(producto);
		
		List<Producto> listado2 = daoProducto.getAll();
		
		for(Producto pro:listado2) {
			System.out.println(pro.getCodigo()+ " " + pro.getNombre() );
		}
		
		
	    Factura factura = new Factura();
        factura.setCodigo(1);
        factura.setFecha(new Date());
        factura.setCliente(persona);
        
        daoFactura.insert(factura);
        
        List<Factura> listado3 = daoFactura.getAll();
        
        for (Factura fac : listado3) {
            System.out.println("Cliente de la factura: " + fac.getCliente().getNombre() + " Numero de factura: " + fac.getCodigo() + " Detalles: " + fac.getDetallesFactura());
        }
	        
        DetalleFactura detalleFactura = new DetalleFactura();
        detalleFactura.setCodigo(1);
        detalleFactura.setCantidad(3);
        detalleFactura.setPrecio(300.00); // precio total = cantidad * precio del producto
        detalleFactura.setProducto(producto);
        Double preciototal = (detalleFactura.getPrecio() * detalleFactura.getCantidad());
        detalleFactura.setTotal(preciototal);
        
        // Agregar DetalleFactura a la Factura
        List<DetalleFactura> detalles = new ArrayList<>();
        detalles.add(detalleFactura);
        factura.setDetallesFactura(detalles);
        
        detalleFactura.setFactura(factura); 
        
        daoDetalleFactura.insert(detalleFactura);
        List<DetalleFactura> listado4 = daoDetalleFactura.getAll();
        
        for (DetalleFactura defa : listado4) {
            System.out.println(" Factura: " + defa.getFactura());
        }
        
        // Cliente adicional (sin uso en este ejemplo)*/
      
	}

}
