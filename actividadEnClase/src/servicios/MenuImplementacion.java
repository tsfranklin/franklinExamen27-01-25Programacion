package servicios;
import java.util.Scanner;
import servicios.ClienteImplementacion;
import servicios.Empleadolmplementacion;

public class MenuImplementacion implements MenuInterfaz {
	
	ClienteImplementacion registroCliente = new ClienteImplementacion();
	Empleadolmplementacion registroEmpleado = new Empleadolmplementacion();

	 
	//estructura menu inicial
	@Override
	public void MostrarMenu() {
		
		System.out.println("_______MENU_______");
		System.out.println("1. Version empleado");
		System.out.println("2. Version cliente");
		System.out.println("3. Cerrar aplicacion");

	}
   
	@Override
	public void TomarVersion(Scanner sc) {
		
		int version=0;
		boolean cerrado = false;
		try {
		do {
		System.out.println("toma una opcion: ");
		version = sc.nextInt();
		
		switch (version) {
		case (1): {
			
			MenuVersionEmpleado(sc);
			
			break;
		}
		case (2): {
			
			MenuVersionCliente(sc);
			
			break;
		}
		case (3): {
			System.out.println("(((Aplicacion cerrada)))");
			cerrado=true;
			break;
		}
						
		}
		
		}while(cerrado==false);}
		catch(Exception TomarVersion) {
			
			
		}
		
	}
		
      
	   //estructura sub menu o menu secundario version empleado
	
    private void MenuVersionEmpleado(Scanner sc){
    	  
    	  //Scanner scEmpleado = new Scanner(System.in); //si pongo sc me dice que he duplicado la variable
  		  int vEmpleado;
  		  	
  		do {
  		System.out.println("__MENU DE VERSION EMPLEADO__");
  		System.out.println("1. Validar cliente");
  		System.out.println("2. Borrar cliente");
  		System.out.println("3. Mostrar cliente");
  		System.out.println("4. Volver al menu inicial");
  		
  		System.out.println("tomar una opcion: ");
  		vEmpleado = sc.nextInt();
  		
  		switch (vEmpleado) {
  		case (1): {
  			System.out.println("1. Validar cliente");
  			
  			registroEmpleado.validarCliente(sc);
  			break;
  		}
  		case (2): {
  			System.out.println("2. Borrar cliente");
  			
  			registroEmpleado.borrarCliente(sc);
  			break;
  		}
  		case (3): {
  			System.out.println("3. Mostrar cliente");
  			
  			registroEmpleado.mostrarClientes();
  			break;
  		}
  		case (4): {
  			System.out.println("4. Menu inicial: ");
  			
  			break;	
  	  		
  		  }	
  		}
  		
  		}while(vEmpleado != 4 );
  		MostrarMenu();
  		 
  		
  		
  		
  		 
      }
         
       //estructura sub menu o menu secundario version cliente
       
       private void MenuVersionCliente(Scanner sc) {
    	   
    	   //Scanner scEmpleado = new Scanner(System.in);
   		int vCliente;
   		
   		
   		
   		do {
   		System.out.println("__MENU VERSION CLIENTE__");
   		System.out.println("1. Registro cliente");
   		System.out.println("2. Acceso cliente");
   		System.out.println("3. Volver al menu inicial");
   		
   		
   		System.out.println("tomar una opcion: ");
   		vCliente = sc.nextInt();
   		
   		switch (vCliente) {
   		case (1): {
   			System.out.println("1. Registro cliente");
   			
   			registroCliente.nuevoCliente();
   			break;
   		}
   		case (2): {
   			System.out.println("2. Acceso cliente");
   			registroCliente.accederCliente(sc);
   			break;
   		
   		}
   		case (3): {	
     		System.out.println("3. Menu inicial");
     		
     		break;
     			
     		}
   		 }
     		
     		}while(vCliente != 3 );
   		    
   		    MostrarMenu();
   		     
   		     
   		  
   		
     	}

    	   

       
       
       
	}


