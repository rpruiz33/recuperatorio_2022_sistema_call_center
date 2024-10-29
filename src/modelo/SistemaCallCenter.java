package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaCallCenter {
private List <Llamada> lstLlamadas;
private List <Persona> lstPersonas;
public List<Llamada> getLstLlamadas() {
	return lstLlamadas;
}
public void setLstLlamadas(List<Llamada> lstLlamadas) {
	this.lstLlamadas = lstLlamadas;
}
public List<Persona> getLstPersonas() {
	return lstPersonas;
}
public void setLstPersonas(List<Persona> lstPersonas) {
	this.lstPersonas = lstPersonas;
}
public SistemaCallCenter() {
	super();
	this.lstLlamadas = new ArrayList<Llamada>();
	this.lstPersonas = new ArrayList<Persona>();
	
}


public Persona traerPersona(long dni) {
	Persona per=null;
	int i=0;
	while(i<lstPersonas.size()&& per==null) {
		if(lstPersonas.get(i).getDni()==dni) {
			per=lstPersonas.get(i);
		}
		i++;
	}
	
	
return per;	
}

public boolean agregarCliente(String nombre, String apellido, long dni, LocalDate fechaAlta,boolean activo) throws Exception {
	Persona per=traerPersona(dni);
	if(per!=null) {
		throw new Exception ("ya existe la persona con el dni");
	}
	int id=1;
	if(lstPersonas.size()>0) {
		id=lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
	}
	return lstPersonas.add(new Cliente(id ,nombre, apellido,   fechaAlta,activo,dni));
	
}
public boolean agregarEmpleado(String nombre, String apellido, long dni, LocalDate fechaAlta,int sueldoBase) throws Exception {
	Persona per=traerPersona(dni);
	if(per!=null) {
		throw new Exception ("ya existe la persona con el dni");
	}
	int id=1;
	if(lstPersonas.size()>0) {
		id=lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
	}
	return lstPersonas.add(new Empleado(id ,nombre, apellido,   fechaAlta,sueldoBase,dni));
	
}

public boolean esNivelDeSatisfaccionValido(int nivelSatisfaccion) {
	return  nivelSatisfaccion > 0 &&	nivelSatisfaccion < 6;
}
public boolean agregarLlamada( LocalDate fecha, LocalTime hora, Empleado empleado,Cliente cliente, int nivelSatisfaccion) throws Exception {
	int id=1;
	boolean a= esNivelDeSatisfaccionValido( nivelSatisfaccion);
	if(!a)
	{
		throw new Exception("numero invalidp");
	}

	if(lstLlamadas.size()>0) {
		id=lstLlamadas.get(lstLlamadas.size()-1).getIdLlamada()+1;
	}
	 
	return lstLlamadas.add(new Llamada(id, fecha, hora,  empleado, cliente,nivelSatisfaccion));
	
}


public List<Cliente> traerCliente(boolean estadoCliente) {
	List<Cliente> aux=new ArrayList<Cliente>();	
	for (int i=0;i<lstPersonas.size();i++) {
		if(lstPersonas.get(i) instanceof Cliente &&((Cliente)lstPersonas.get(i)).isActivo()==estadoCliente) {
			aux.add((Cliente)lstPersonas.get(i));
		}
	}
	
	
return aux;	
}

public List<Persona> traerPersonaAntiguedad(int mayorigual){
	List<Persona> aux=new ArrayList<Persona>();	
	for (int i=0;i<lstPersonas.size();i++) {
		if(lstPersonas.get(i).antiguedadEnAnios()<=mayorigual) {
			aux.add(lstPersonas.get(i));
		}
	}
	
	
return aux;	
}

public List<Llamada> traerLlamada(LocalDate fecha, LocalTime horaDesde,LocalTime horaHasta){
	List<Llamada> aux=new ArrayList<Llamada>();	
	for (int i=0;i<lstLlamadas.size();i++) {
		if(lstLlamadas.get(i).getFecha().isEqual(fecha)&&lstLlamadas.get(i).getHora().isAfter(horaDesde)&&lstLlamadas.get(i).getHora().isBefore(horaHasta)) {
			aux.add(lstLlamadas.get(i));
		}
	}
	
	
return aux;	
}
}

