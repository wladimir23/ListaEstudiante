package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Lista list = new Lista(); //instanciamos la clase lista 
		
		do {
	    //salida de datos 
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null,	"Estructura de datos \n1.-Ingresar un estudiante \n2.-Buscar estudiante \n3.-Ver registro de estudiantes \n4.- Salir", "MENU",JOptionPane.INFORMATION_MESSAGE));
		
		//lista de procedimientos 
		switch (opcion) {
		case 1:
		list.ingresarEstudiante();
		break;
		case 2:
		String dato=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a buscar");
		list.buscar(dato.trim());
		break;
		case 3:
		JOptionPane.showMessageDialog(null, "REGISTRO ACTUAL DE ESTUDIANTES\n\n" + list);
		break;
		case 4:
		opcion = 4;
		break;
		default:
		break;
		}
		
		} while (opcion != 4);
		}
	}
