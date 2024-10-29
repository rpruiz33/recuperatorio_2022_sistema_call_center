package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Persona {
private boolean activo;

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}




@Override
public String toString() {
	return "\nCliente [activo=" + activo + ", idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido
			+ ", fechaDeAlta=" + fechaDeAlta + ", dni=" + dni + "]";
}

public Cliente(int idPersona, String nombre, String apellido, LocalDate fechaDeAlta, boolean activo, long dni) {
	super(idPersona, nombre, apellido, fechaDeAlta, dni);
	this.activo = activo;
}
public  int antiguedadEnAnios() {
return Period.between(LocalDate.now(), fechaDeAlta).getYears();	
}

 
}
