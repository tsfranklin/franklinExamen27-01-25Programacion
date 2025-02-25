package controladores;
import java.util.Map;
import java.util.HashMap;

public class Colecciones3 { 
	
	
	/**Dado un conjunto de estudiantes y sus calificaciones, realiza las siguientes operaciones utilizando un mapa (Map):
Crea un mapa con el nombre del estudiante como clave y la calificación como valor. 
Agrega los siguientes estudiantes: ("Ana", 85), ("Juan", 90), ("Pedro", 78), ("Laura", 92).
Imprime el mapa completo.
Modifica la calificación de "Pedro" a 80.
Elimina el estudiante "Juan".Consulta la calificación de "Laura".
Razona
¿Por qué es importante que las claves sean únicas en un mapa?

R// En un mapa, las claves sirven para identificar de forma única cada valor. Si permitiéramos claves duplicadas, 
el mapa se volvería confuso y no podríamos saber qué valor corresponde a cada clave.

¿Qué sucede si intentas agregar una clave que ya existe?

R//Si intentas agregar una clave que ya existe en un mapa, el valor anterior asociado a esa clave será reemplazado por el nuevo valor. Por ejemplo, si agregamos 
nuevamente "Ana" con una calificación diferente, la calificación anterior de Ana será sobrescrita.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> alumnoCalificacion = new HashMap<>();
		
		alumnoCalificacion.put("Ana", 85);
		alumnoCalificacion.put("Juan", 90);
		alumnoCalificacion.put("Pedro", 78);
		alumnoCalificacion.put("Laura", 92);
		
		System.out.println(alumnoCalificacion);
		
		//Modificar la calificación de "Pedro" a 80
		
		alumnoCalificacion.put("Pedro",80);
		
		System.out.println(alumnoCalificacion);
		
		//Elimina el estudiante "Juan"
		
		alumnoCalificacion.remove("Juan");
		
		System.out.println(alumnoCalificacion);
		
		//Consulta la calificación de "Laura"
		System.out.println(alumnoCalificacion.get("Laura"));
		
		
		
		
		

	}

}
