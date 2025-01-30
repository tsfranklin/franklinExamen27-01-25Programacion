package servicios;
import java.util.Scanner;
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public void MostrarMenu() {
		
		System.out.println("__MENU__");
		System.out.println("1. Version empleado");
		System.out.println("2. Version cliente");
		System.out.println("3. Cerrar aplicacion");

	}

	@Override
	public void TomarVersion(Scanner sc) {
		
		int version;
		boolean cerrado = false;
		
		do {
		System.out.println("toma una opcion: ");
		version = sc.nextInt();
		
		switch (version) {
		case (1): {
			
			MenuVersionEmpleado(sc);
			
			break;
		}
		case (2): {
			System.out.println("2. Version cliente");
			break;
		}
		case (3): {
			System.out.println("3. Aplicacion cerrada");
			cerrado=true;
			break;
		}
						
		}
		
		}while(cerrado==false);
	}
		
      @Override
      public void MenuVersionEmpleado(Scanner sc) {
    	  
    	  Scanner scEmpleado = new Scanner(System.in); //si pongo sc me dice que he duplicado la variable
  		  int vEmpleado;
  		  	
  		do {
  		System.out.println("__MENU DE VERSION EMPLEADO__");
  		System.out.println("1. Validar empleado");
  		System.out.println("2. Borrar cliente");
  		System.out.println("3. Mostrar cliente");
  		System.out.println("4. Volver al menu inicial");
  		
  		System.out.println("tomar una opcion: ");
  		vEmpleado = scEmpleado.nextInt();
  		
  		switch (vEmpleado) {
  		case (1): {
  			System.out.println("1. Validar empleado");
  			break;
  		}
  		case (2): {
  			System.out.println("2. Borrar cliente");
  			break;
  		}
  		case (3): {
  			System.out.println("3. Mostrar cliente");
  			break;
  		}
  		case (4):	
  			System.out.println("4. Volver al menu inicial");
  			MostrarMenu();
  			
  			
  		}
  			
  			
  		
  		}while(vEmpleado != 4 );
  		
  		
    	  
      }
      
	}


