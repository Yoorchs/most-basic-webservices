package com.ipartek.formacion;

import java.io.Serializable;

public class Libro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	private String titulo;
	
	public Libro() {
		super();
		this.numero = 0;
		this.titulo = "";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Libro [numero=" + numero + ", titulo=" + titulo + "]";
	}
}
