package com.epn;

import javax.swing.JOptionPane;

public class Lista {

	private Nodo P; //creacion del nodo
	
	//constructor vacio
	public Lista() {
	}
	//insertar un nodo 
	public void ingresarEstudiante() {
	Nodo Q = new Nodo();
	String cedula=JOptionPane.showInputDialog("Ingrese el numero de cedula del estudiante").trim();
	validar_cedula(cedula);
	Q.setCedula(cedula);
	Q.setDato(JOptionPane.showInputDialog("Ingrese el nombre del estudiante").trim());
	JOptionPane.showMessageDialog(null, "!Estudiante ingresado con exito!");
	Q.setLiga(this.P);//enlazar el nuvo nodo
	this.P = Q;
	}
	
	public boolean estaVacia(){
		
		return P == null;
	}	
	
	public void buscar(String elemento){
		Nodo actual= new Nodo();
		actual=P;
		    while(actual != null){
		        if (actual.getCedula().trim().equals(elemento)){
		        	JOptionPane.showMessageDialog(null,"Estudiante con numero de cedula "+elemento+" esta registrado");
		        	break;
		        }
		        	  actual=actual.getLiga();        
		    }    
	}
	
	public void validar_cedula(String cedula){
		Nodo actual= new Nodo();
		actual=P;
		    while(actual != null){
		        if (actual.getCedula().trim().equals(cedula)){
		        	JOptionPane.showMessageDialog(null,"Cedula ya Existente");
		        	ingresarEstudiante();
		        	break;
		        }
		        	  actual=actual.getLiga();        
		    }	    
	}
	//salida de datos 
	public String toString() {
	Nodo aux;
	String salida = "";
	aux = this.P;
	while (aux != null) {
	salida +=aux.getCedula()+"--"+aux.getDato().toString()+"\n";
	aux = aux.getLiga();
	}
	return salida;
	}
}