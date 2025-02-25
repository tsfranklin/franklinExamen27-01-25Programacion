package controlador;
import java.util.Scanner;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.ClienteImplementacion;
import servicios.ClienteInterfaz;
import dtos.ClienteDto;


import java.util.ArrayList;
import java.util.List;

public class Inicio {
	
	
	public static List <ClienteDto> clientes = new ArrayList();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MenuInterfaz oInterfaz = new MenuImplementacion();
		Scanner sc = new Scanner(System.in);
		
		oInterfaz.MostrarMenu();
		oInterfaz.TomarVersion(sc);
		System.out.println(clientes);
		
		
		
		
		
		
		
		/**ClienteDto cliente1 = new ClienteDto(001,"12345678A", "Franklin", "Torres", "Santos", "Frank@gmail.com", "f1234", true);
		
		System.out.println(cliente1.toString());
		
		cliente1.setNombre("Mauricio");
		cliente1.setApellido1("cardales");
		cliente1.setEsValidado(false);
		
		System.out.println(cliente1.toString());*/
		
		
		
		
		
	}

}
