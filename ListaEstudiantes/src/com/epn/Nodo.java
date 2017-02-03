package com.epn;

public class Nodo {
	
	//componentes del nodo
	private String dato;
	private String cedula;
	private Nodo liga;
	
	public Nodo() {
		super();
	}
	public Nodo(String dato, Nodo liga,String cedula) {
		super();
		this.dato = dato;
		this.liga = liga;
		this.cedula=cedula;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public Nodo getLiga() {
		return liga;
	}
	public void setLiga(Nodo liga) {
		this.liga = liga;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}