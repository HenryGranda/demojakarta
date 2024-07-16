package ec.edu.ups.ppw.demojakarta.buisness;

import java.util.List;


import ec.edu.ups.ppw.demojakarta.model.Cliente;
import ec.edu.ups.ppw.denojakarta.dao.ClienteDao;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;

@Stateless
public class Gestion_Cliente {
	
	 @Inject
	    private ClienteDao daoCliente;
	    
		
	    public Cliente getCliente(String cedula) throws Exception {
			if(cedula.length() != 10) {
				throw new Exception("Cedula Incorrecta");
			}
			
			Cliente cliente = daoCliente.read(cedula);
			if(cliente == null)
				throw new Exception("Cliente no existe");
			return cliente;
		}
		
		public List<Cliente> getClientes(){
			return daoCliente.getAll();
		}
		
		public void createCliente(Cliente cliente) throws Exception {
			if(cliente.getCedula().length() != 10) {
				throw new Exception("Cedula Incorrecta");
			}
			daoCliente.insert(cliente);
		}
		
		public void updateCliente(Cliente cliente) throws Exception{
			
			
			if(cliente.getCedula().length() != 10) {
				throw new Exception("Cedula Incorrecta");
			}
			
			daoCliente.update(cliente);
		}
		
		
		public void deleteCliente(String cedula) throws Exception{
			Cliente cliente = daoCliente.read(cedula);
			if(cliente == null) {				
				throw new Exception("Cliente no existe");
			}
			else {
				daoCliente.delete(cedula);
			}
			
		}
}
