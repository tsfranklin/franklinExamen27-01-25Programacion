package controladores;
import java.util.LinkedList;
import java.util.Queue;

public class Colecciones4 {
	
	/**Imagina una cola en una tienda. Realiza las siguientes operaciones utilizando una cola (Queue) :
		Crea una cola y agrega los elementos: "Cliente1", "Cliente2", "Cliente3", "Cliente4".
		Imprime la cola.
		Atiende (elimina) al primer cliente de la cola.
		Imprime la cola después de atender al cliente.
		Verifica quién es el siguiente cliente en la cola.
		Razona:
		¿Cómo funciona el procesamiento de la cola? ¿Qué significa FIFO?¿Y LIFO?
		
		R// FIFO (First In, First Out): Significa "primero en entrar, primero en salir". En una cola, el primer elemento en ser agregado es el primero en ser eliminado.
            LIFO (Last In, First Out): Es lo opuesto a FIFO, y se utiliza en estructuras como pilas. En una pila, el último elemento en ser agregado es el primero en ser eliminado.
		
		¿Cómo se utiliza el método poll() y cómo se diferencia de peek()?
		
		poll(): Este método elimina y devuelve el elemento en la parte frontal de la cola. Si la cola está vacía, devuelve null.
        peek(): Este método devuelve el elemento en la parte frontal de la cola sin eliminarlo. Si la cola está vacía, devuelve null.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // Crear una cola
        Queue<String> colaClientes = new LinkedList<>();

        // Agregar clientes a la cola
        colaClientes.add("Cliente1");
        colaClientes.add("Cliente2");
        colaClientes.add("Cliente3");
        colaClientes.add("Cliente4");

        // Imprimir la cola
        System.out.println("Cola inicial: " + colaClientes);

        // Atender al primer cliente
        String primerCliente = colaClientes.poll();
        System.out.println("Se atendió a: " + primerCliente);
        

        // Imprimir la cola después de atender al primer cliente
        System.out.println("Cola después de atender al primer cliente: " + colaClientes);

        // Verificar quién es el siguiente cliente
        String siguienteCliente = colaClientes.peek();
        System.out.println("El siguiente cliente es: " + siguienteCliente);
		
				
				
}
	}