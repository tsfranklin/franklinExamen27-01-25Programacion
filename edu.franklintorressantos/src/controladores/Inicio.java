package controladores;

import java.util.Scanner;

import servicios.Elemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 * @author ftortos
 * aqui esta la entra a nuestro programa
 */
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean cerrar = false;
		
		//creamos  listas de los elementos
		 
		List<String> elementosNombres= new ArrayList();
		List<Integer> elementosCantidad= new ArrayList();
		List<String> elementosDescripcion= new ArrayList();
		
		
		//atributos de las clase
		long idElemento;
		String codigoElemento;
		String nombreelemento;
		 String descripcionElemento;
		int cantidadElemento;
		String fchAlta;
		String fchaBaja;
		
		
		
		// realizamos un menu con sus diferecntes opciones
		do {
		System.out.println("----MENU-----");
		System.out.println("0. cerrar");
		System.out.println("1. dar de alta");
		System.out.println("2. modificar cantidad");
		System.out.println("3. eliminar elemento");
		
		System.out.println("dime una opcion: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
           case (0): {
			
			System.out.println("programa cerrado");
			cerrar = true;
				
		   }
		   case (1): {
			
			System.out.println("--opcion dar de alta---");
			System.out.println("añade el nombre del producto nuevo: ");
			nombreelemento = sc.next();
			elementosNombres.add(nombreelemento);
			
			System.out.println("añade la cantidad del producto nuevo: ");
			cantidadElemento = sc.nextInt();
			elementosCantidad.add(cantidadElemento);
			
			System.out.println("añade la descripcion: ");
			descripcionElemento = sc.next();
			elementosDescripcion.add(descripcionElemento);
			
			
			System.out.println(elementosNombres);
			System.out.println(elementosCantidad);
			System.out.println(elementosDescripcion);
			
			
			
			
			break;
				
		}
		   case (2): {
				
				System.out.println("opcion modificar cantidad: ");
				System.out.println("nombre del producto a modificar: ");
				nombreelemento = sc.next();
				elementosNombres.contains(nombreelemento);
				if (elementosNombres.contains(nombreelemento)==true) {
					 //elementosNombres.//queria buscar el numero del indice para depsues buscarlo
					 //en la lista que las cantidades la posicion que hay y remplazarla depsues 
				}
					
				
				
				
				break;
				
				
					
			}
		   case (3): {
				
				System.out.println("opcion eliminar elemento: ");
				break;
					
			}
		
		}
		 nombreelemento = "";
		 cantidadElemento = 0;
		 descripcionElemento = "";
		 
		 
		}while(cerrar==false);

		 
	}

}
