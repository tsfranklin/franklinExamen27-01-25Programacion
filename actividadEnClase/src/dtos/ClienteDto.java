package dtos;

public class ClienteDto {
	
private long id;
private String dni;
private String nombreCompleto;
private String nombre;
private String apellido1;
private String apellido2;
private String email;
private String contrasena;
private boolean esValidado;



public ClienteDto() {
	super();
}
public ClienteDto(long id, String dni, String nombre, String apellido1, String apellido2,
		String email, String contrasena, boolean esValidado) {
	super();
	this.id = id;
	this.dni = dni;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.email = email;
	this.contrasena = contrasena;
	this.esValidado = esValidado;
    this.nombreCompleto = apellido1 + " " + apellido2 + ", " + nombre;
	
 }


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getDni() {
	return dni;
}


public void setDni(String dni) {
	this.dni = dni;
}


public String getNombreCompleto() {
	return nombreCompleto;
}


public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido1() {
	return apellido1;
}


public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}


public String getApellido2() {
	return apellido2;
}


public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getContrasena() {
	return contrasena;
}


public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}


public boolean isEsValidado() {
	return esValidado;
}


public void setEsValidado(boolean esValido) {
	this.esValidado = esValido;
}


@Override
public String toString() {
    return "DNI: " + dni + "\n" +
           "NOMBRE: " + apellido1+" "+apellido2+", "+nombre + "\n" +
           "ESTADO VALIDACIÓN: " + (esValidado ? "sí" : "no") + "\n" +
           "%%%%%%%%%%%%%";
}


}






