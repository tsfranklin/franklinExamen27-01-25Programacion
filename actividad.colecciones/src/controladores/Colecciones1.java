package controladores;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; //esta es la interfaz
public class Colecciones1 {

	// TODO Auto-generated method stub
			/**Dado un conjunto de nombres de estudiantes, realiza las siguientes operaciones utilizando una lista (List):
	Crea una lista de nombres de estudiantes y agrega los siguientes valores: "Ana", "Juan", "Pedro", "Laura", "Ana".
	Imprime la lista completa.Cambia el nombre del tercer estudiante a "Carlos".
	Elimina el nombre "Laura" de la lista.
	Comprueba si el nombre "Ana" está presente en la lista.Ordena la lista alfabéticamente y vuelve a imprimirla.
	Razona:
	¿Por qué es importante el orden de los elementos en una lista?

	R// Porque permite organizar datos de manera lógica, lo que facilita búsquedas y comparaciones

	¿Qué ocurre cuando hay elementos duplicados?

	R// La lista permite elementos repetidos, y estos se mantienen en la posición en la que fueron agregados.

	¿Por qué la operación contains() no elimina duplicados en las listas?

	R// Porque contains()solo verifica si un elemento existe en la lista, pero no lo modifica ni lo elimina. 
	*/
	
	public static void main(String[] args) {
		

		// creamos la lista y agregamos a los estudiantes
		List<String> estudiante = new ArrayList<String>();
		estudiante.add("Ana");
		estudiante.add("Juan");
		estudiante.add("Pedro");
		estudiante.add("Laura");
		estudiante.add("Ana");
		
		
		//Imprime la lista completa
		System.out.println("lista completa: "+ estudiante);
		
		
		//Cambia el nombre del tercer estudiante a "Carlos"
		estudiante.set(2, "Carlos");
		System.out.println("Cambio de pedro por Carlos: "+ estudiante);
		
		// Comprobar si "Ana" está en la lista
        boolean estaAna = estudiante.contains("Ana");
        System.out.println("¿Está Ana en la lista?: " + estaAna);

        // . Ordenar la lista alfabéticamente
        Collections.sort(estudiante);
        System.out.println("Lista ordenada: " + estudiante);
		
		//Elimina el nombre "Laura" de la lista.
		estudiante.remove("Laura");
		System.out.println("Se elimino a laura: "+ estudiante);
		
		
		//Ordena la lista alfabéticamente
		estudiante.sort(null);
		System.out.println("lista ordenada alfabeticamente: "+ estudiante);
		
		
	
		
		
	}

}
