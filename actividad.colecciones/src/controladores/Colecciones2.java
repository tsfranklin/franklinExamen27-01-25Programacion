package controladores;
import java.util.Set;
import java.util.HashSet;

public class Colecciones2 {
	
	/**Dado un conjunto de números enteros, realiza las siguientes operaciones utilizando un conjunto (Set):
	Crea un conjunto de números enteros y agrega los valores: 1, 3, 5, 7, 3, 1.
	Imprime el conjunto.Intenta agregar el número 5 nuevamente y verifica si se ha añadido.
	Elimina el número 7 del conjunto.
	Imprime el conjunto después de todas las modificaciones.
	Razona:
	¿Por qué los elementos duplicados no se agregan en un Set?
	
	R// Porque un Setestá diseñado para contener solo valores únicos.
	
	¿Cómo se comporta el orden de los elementos en un Set?
	
	R//HashSetno garantiza un orden específico. Si se necesita orden, se puede usar TreeSet
	*/
	
	public static void main(String[] args) {
	     Set<Integer> numeros = new HashSet<>();
	     numeros.add(1);
	     numeros.add(3);
	     numeros.add(5);
	     numeros.add(7);
	     numeros.add(3);
	     numeros.add(1);
	     
	     
	     System.out.println(numeros);
	     System.out.println(numeros.size());
	     

	    // Intentar agregar el número 5 nuevamente
	        boolean agregado = numeros.add(5);
	        System.out.println("¿Se agregó el número 5 nuevamente?: " + agregado);

	   // Eliminar el número 7
	        numeros.remove(7);
	        System.out.println("Conjunto después de eliminar el 7: " + numeros);
	     
	     
	     
	

}
}