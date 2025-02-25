package servicios;
import java.util.Scanner;
import controlador.Inicio;
import dtos.ClienteDto;
import servicios.ClienteImplementacion;

public class Empleadolmplementacion implements EmpleadoInterfaz {
	
	
	ClienteImplementacion validar = new ClienteImplementacion();
	

	    @Override
	    public void validarCliente(Scanner sc) {

	        // 1. Mostrar clientes no validados
	        if (Inicio.clientes.isEmpty()) {
	            System.out.println("No hay clientes registrados.");
	            return; // Salimos si no hay clientes
	        }

	        boolean hayClientesParaValidar = false; // Variable para controlar si hay clientes para validar

	        for (ClienteDto cliente : Inicio.clientes) {
	            if (!cliente.isEsValidado()) { // Si el cliente no está validado
	                System.out.println(cliente); // Imprime la información del cliente
	                hayClientesParaValidar = true; // Marcamos que sí hay clientes para validar
	            }
	        }

	        if (!hayClientesParaValidar) { 
	            System.out.println("No hay clientes pendientes de validar.");
	            return; // Salimos si no hay clientes para validar
	        }

	        // 2. Solicitar DNI y validar cliente
	        System.out.print("Ingrese el DNI del cliente a validar: ");
	        String dniValidar = sc.next();

	        for (ClienteDto cliente : Inicio.clientes) {
	            if (cliente.getDni().equals(dniValidar)) { // Si encontramos el cliente con el DNI ingresado
	                cliente.setEsValidado(true); // Lo validamos
	                System.out.println("Cliente validado correctamente.");
	                return; // Salimos después de validar al cliente
	            }
	        }

	        System.out.println("No se encontró ningún cliente con ese DNI."); // Si no se encontró el cliente
	   
	    }
	    
	    
	    @Override
	    public void borrarCliente(Scanner sc) {
	     
        
	    	    String dniBorrar;
	    	    do {
	    	        System.out.print("Ingrese un DNI correcto para borrar cliente: ");
	    	        dniBorrar = sc.next();
	    	    } while (!validar.validarDni(dniBorrar)); // Validar DNI hasta que sea válido

	    	    for (ClienteDto cliente : Inicio.clientes) {
	    	        if (cliente.getDni().equals(dniBorrar)) {
	    	            Inicio.clientes.remove(cliente);
	    	            System.out.println("Cliente borrado correctamente.");
	    	            return; // Volver al menú principal
	    	        }
	    	    }

	    	    System.out.println("No se encontró ningún cliente con ese DNI.");
	    	    
	    }
	    	
	    	
		@Override
	    public void mostrarClientes() {
	            
                int clienteNoValido=0;
                
    	        for (ClienteDto cliente : Inicio.clientes) {
    	            if (cliente.isEsValidado()) {
    	                System.out.println("DNI: " + cliente.getDni());
    	                System.out.println("NOMBRE: " + cliente.getNombreCompleto());
    	                System.out.println("ESTADO VALIDACIÓN: Sí"); // Ya está validado
    	                System.out.println("%%%%%%%%%%%%%%%%%%");
    	            }else {
    	            	clienteNoValido++;
    	            }
    	            
    	        } System.out.println("Existen: " + clienteNoValido + "clientes no validados");
	    	    	
	    }

}
