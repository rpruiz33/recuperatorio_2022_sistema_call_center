package modelo;

import java.time.LocalDate;

public abstract class  Persona {
protected int idPersona;
protected String nombre;
protected String apellido;
protected LocalDate fechaDeAlta;
protected long dni;

public long getDni() {
	return dni;
}
public void setDni(long dni) {
	this.dni = dni;
}
public int getIdPersona() {
	return idPersona;
}
public void setIdPersona(int idPersona) {
	this.idPersona = idPersona;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDate getFechaDeAlta() {
	return fechaDeAlta;
}
public void setFechaDeAlta(LocalDate fechaDeAlta) {
	this.fechaDeAlta = fechaDeAlta;
}
public Persona(int idPersona, String nombre, String apellido, LocalDate fechaDeAlta, long dni) {
	super();
	this.idPersona = idPersona;
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaDeAlta = fechaDeAlta;
	this.dni = dni;
}


public abstract int antiguedadEnAnios(); 


}
