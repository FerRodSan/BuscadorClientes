package modelo;

import java.io.Serializable;

import control.ParaUi;

public class Cliente implements Serializable{

	private String nombre;
	private String apellido;
	private ParaUi paraui;

	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
