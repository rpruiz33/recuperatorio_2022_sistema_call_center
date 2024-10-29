package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Llamada {
private int idLlamada;
private LocalDate fecha;
private LocalTime hora;
private Empleado emplado;
private Cliente cliente;
private int nivelSatisfaccion;
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public int getNivelSatisfaccion() {
	return nivelSatisfaccion;
}




public int getIdLlamada() {
	return idLlamada;
}
public void setIdLlamada(int idLlamada) {
	this.idLlamada = idLlamada;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public Empleado getEmplado() {
	return emplado;
}
public void setEmplado(Empleado emplado) {
	this.emplado = emplado;
}





public Llamada(int idLlamada, LocalDate fecha, LocalTime hora, Empleado emplado, Cliente cliente,
		int nivelSatisfaccion) {
	super();
	this.idLlamada = idLlamada;
	this.fecha = fecha;
	this.hora = hora;
	this.emplado = emplado;
	this.cliente = cliente;
	this.nivelSatisfaccion = nivelSatisfaccion;
}
public void setNivelSatisfaccion(int nivelSatisfaccion) {
	this.nivelSatisfaccion = nivelSatisfaccion;
}
@Override
public String toString() {
	return "\nLlamada [idLlamada=" + idLlamada + ", fecha=" + fecha + ", hora=" + hora + ", emplado=" + emplado
			+ ", cliente=" + cliente + ", nivelSatisfaccion=" + nivelSatisfaccion + "]\n";
}



}
