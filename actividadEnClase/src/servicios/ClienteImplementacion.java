package servicios;
import java.util.Scanner;
import dtos.ClienteDto;
import java.util.ArrayList;
import controlador.Inicio;

public class ClienteImplementacion implements ClienteInterfaz {
	
	
	
	@Override
	public void nuevoCliente() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    ArrayList<String> partesNombreSinEspacio = new ArrayList<String>();
	    
		String dni = null;
		String nombreCompleto = null;
		String nombre = null;
		String apellido1 = null;
		String apellido2 = null;
		String email = null;
		String contrasena = null;
		Boolean esValidado=false;
		
		
	
        do {
        	System.out.print("Ingrese el DNI: ");
            dni = sc.nextLine();
            if (!validarDni(dni)) {
                System.out.println("DNI inválido. Por favor, inténtelo de nuevo.");
            }
        } while (!validarDni(dni)); // Se repite hasta que el DNI sea válido
		
		
        //nuevoCliente.setDni(dni);

        System.out.print("Ingrese el nombre completo, en el orden de primero los apellidos y por ultimo el nombre: ");
        nombreCompleto = sc.nextLine();
        //nuevoCliente.setNombreCompleto(nombreCompleto);

        // Separamos el nombre completo en nombre y apellidos
        String[] partesNombre = nombreCompleto.split(" ");
        // recorremos el vector para separar seleccionar string vacio
        for (int i = 0; i < partesNombre.length; i++) {
        	if (!partesNombre[i].isEmpty()) {
        		
        		partesNombreSinEspacio.add(partesNombre[i]);
        		
        	}
            
        }
        //asignamos nombre y apellidos
        if (partesNombreSinEspacio.size()==3) {
        nombre=(partesNombreSinEspacio.get(partesNombreSinEspacio.size()-1));
        //nuevoCliente.setNombre(nombre);
        
        apellido2=(partesNombreSinEspacio.get(partesNombreSinEspacio.size()-2));
        //nuevoCliente.setApellido2(apellido2);
        
        apellido1=(partesNombreSinEspacio.get(partesNombreSinEspacio.size()-3));
        //nuevoCliente.setApellido1(apellido1);
       
        }else {
        	nombre=(partesNombreSinEspacio.get(partesNombreSinEspacio.size()-1));
            //nuevoCliente.setNombre(nombre);
            
            apellido1=(partesNombreSinEspacio.get(partesNombreSinEspacio.size()-2));
            //nuevoCliente.setApellido1(apellido1);
        	
        }
        
        System.out.print("Ingrese el email: ");
        email=sc.nextLine();
        //nuevoCliente.setEmail(email);

        System.out.print("Ingrese la contraseña: ");
        contrasena=sc.nextLine();
      
        
        //nuevoCliente.setContrasena(contrasena);
        
        ClienteDto nuevoCliente = new ClienteDto(generarId(), dni, nombre, apellido1, apellido2, email, contrasena, esValidado);
        
        //se añade el cliente a la lista global
        Inicio.clientes.add(nuevoCliente);
        
        System.out.println("Cliente registrado exitosamente.");
         
        
    }

	private long generarId() {
	        long ultimoId = 0;
	        if (!Inicio.clientes.isEmpty()) {
	            ultimoId = Inicio.clientes.get(Inicio.clientes.size() - 1).getId();
	        }
	        return ultimoId + 1 ;
	    }
	
    public boolean validarDni(String dni) {
        if (dni.length() != 9) {
            return false; // Longitud incorrecta
        }

        String numeros = dni.substring(0, 8);
        char letra = Character.toUpperCase(dni.charAt(8));

        try {
            int numeroDni = Integer.parseInt(numeros);
            char letraEsperada = calcularLetraDni(numeroDni);
            return letra == letraEsperada; // Comparamos la letra ingresada con la calculada
        } catch (NumberFormatException e) {
            return false; // Formato de números incorrecto
        }
    }

    private char calcularLetraDni(int numeroDni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroDni % 23;
        return letras.charAt(resto);
    }

	 
    public void accederCliente(Scanner sc) {
    	String correoX;
    	String contrasenaX;
    	int contador = 1;
    	
    	if (Inicio.clientes.isEmpty()) {
            System.out.println("No hay clientes registrados. Por favor, regístrese primero.");
            return; // Volvemos al menú principal
        }
    	while (contador <=3) {
    		
    	
    	
    	System.out.println("ingresar correo: ");
    	correoX = sc.nextLine();
    	
    	sc.nextLine();
   
    	
    	System.out.println("ingresar contraseña: ");
    	contrasenaX = sc.nextLine();
    	
    	
    	for (ClienteDto cliente : Inicio.clientes) {
    		if (cliente.getEmail().equals(correoX) && cliente.getContrasena().equals(contrasenaX) && cliente.isEsValidado())  {
    			System.out.println("INICIO DE SESIÓN CORRECTO");
    			
    		    return;
    			
    			
    		}else {
    			System.out.println("Correo o contaseña incorrecto intentelo denuvo");
    			contador++;
    		}
    		
    		}
    	} System.out.println("Ha superado el número máximo de intentos");
    	
    	
    }
	   
	  
}
