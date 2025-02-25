package edu.temario;
import java.util.Scanner;


//import controlador.Inicio;

import java.util.ArrayList;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	ArrayList <String> partesNombresSinEspacio = new ArrayList<String>();
		
	String dni;
	dni = "12345678Z";
	
	String ultimaLetr;
	
	ultimaLetr = dni.substring(8);
	System.out.println(ultimaLetr.toLowerCase());
	
	
	
	char letra;
	
	letra = Character.toLowerCase(dni.charAt(8));
	
	System.out.println(letra);
	
	/*String nombreCompleto;
		System.out.println("dime el nombre completo: ");
		nombreCompleto = sc.nextLine();
		String[] partesNombre = nombreCompleto.split(" ");
		System.out.println(partesNombre.length);
		
		
		for (int i =0; i<partesNombre.length; i++) {
			if (!partesNombre[i].isEmpty()) {
			System.out.println(partesNombre[i]);
			partesNombresSinEspacio.add(partesNombre[i]);
			
			}		
			
		}
        
		System.out.println(partesNombresSinEspacio);
		/**if (partesNombresSinEspacio.size()==3)
			
		for (String partes : partesNombresSinEspacio) {
			
				System.out.println(partes);
			}
		*/	
		}
        }

	


