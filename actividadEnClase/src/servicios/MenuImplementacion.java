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
			System.out.println("1. Version empleado");
			break;
		}
		case (2): {
			System.out.println("1. Version cliente");
			break;
		}
		case (3): {
			System.out.println("1. Cerrar aplicacion");
			cerrado=true;
			break;
		}
			
			
		}
		
		}while(cerrado==false);
		
		

	}

}
