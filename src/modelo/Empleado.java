package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona {
private int sueldoBase ;

public int getSueldoBase() {
	return sueldoBase;
}

public void setSueldoBase(int sueldoBase) {
	this.sueldoBase = sueldoBase;
}

public Empleado(int idPersona, String nombre, String apellido, LocalDate fechaDeAlta, int sueldoBase, long dni) {
	super(idPersona, nombre, apellido, fechaDeAlta,dni);
	this.sueldoBase = sueldoBase;
}

public  int antiguedadEnAnios() {
return Period.between(fechaDeAlta.plusMonths(1), fechaDeAlta).getYears();	
}

@Override
public String toString() {
	return " \nEmpleado [sueldoBase=" + sueldoBase + ", idPersona=" + idPersona + ", nombre=" + nombre + ", apellido="
			+ apellido + ", fechaDeAlta=" + fechaDeAlta + ", dni=" + dni + ", getSueldoBase()=" + getSueldoBase()
			+ ", antiguedadEnAnios()=" + antiguedadEnAnios() + ", getDni()=" + getDni() + ", getIdPersona()="
			+ getIdPersona() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
			+ ", getFechaDeAlta()=" + getFechaDeAlta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
