package com.luisops.netflix;

public class Pelicula extends Netflix implements IVisualizable{
	
	private int ano;
	
	public Pelicula() {
		super();
		
		this.ano = 2004;
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.ano = 2006;
	}
	
	public Pelicula(String titulo, String genero, String creador, int duracion,int ano) {
		super(titulo,genero,creador, duracion);
		this.ano = ano;
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		
		return  super.toString()+"\nAño: "+ano+"\n";
	}

	

	
	

}
