package test;

import java.time.LocalDate;

import java.time.LocalTime;

import modelo.SistemaCallCenter;
import modelo.Cliente;
import modelo.Empleado;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SistemaCallCenter sistema =new SistemaCallCenter();
	try {
		System.out.println(sistema.agregarCliente("Luis", "Perez", 11111111, LocalDate.of(2020, 1, 1), true));
		System.out.println(sistema.agregarCliente("Lucas", "Pereyra", 22222222, LocalDate.of(2020, 2, 1), false));
		System.out.println(sistema.agregarEmpleado("Pedro", "Gomez", 33333333, LocalDate.of(2020, 1, 11), 10000));
		System.out.println(sistema.agregarEmpleado("Pablo", "Lopez", 44444444, LocalDate.of(2022, 3, 15), 9000));
		
	} catch (Exception e) {

		e.printStackTrace();
	}
	System.out.println(sistema.getLstPersonas());
	try {
		System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 6), LocalTime.of(10, 10), (Empleado)sistema.traerPersona(33333333),(Cliente) sistema.traerPersona(11111111),5));
		System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 6), LocalTime.of(10, 10), (Empleado)sistema.traerPersona(33333333),(Cliente) sistema.traerPersona(11111111),5));
		System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 6), LocalTime.of(10, 15), (Empleado)sistema.traerPersona(33333333),(Cliente) sistema.traerPersona(22222222),5));
		System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 6), LocalTime.of(10, 20), (Empleado)sistema.traerPersona(44444444),(Cliente) sistema.traerPersona(11111111),3));
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(sistema.getLstLlamadas());
	System.out.println("------------------");
	System.out.println(sistema.traerCliente(true));
	System.out.println("------------------");
	System.out.println(sistema.traerPersonaAntiguedad(2));
	System.out.println("------------------");
	System.out.println(sistema.traerLlamada(LocalDate.of(2022,11 ,6), LocalTime.of(10,10), LocalTime.of(10, 18)));

	
	try {
		System.out.println(sistema.agregarCliente("Marcos","RIos", 22222222,LocalDate.of(2020,2,1), true));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		System.out.println(sistema.agregarEmpleado("Miguel","Martinez", 44444444,LocalDate.of(2020,2,1),9500));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 07),LocalTime.of(10, 30),(Empleado)sistema.traerPersona(33333333),(Cliente)sistema.traerPersona(11111111),77));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
