package com.luisops.netflix;

public class Serie extends Netflix implements IVisualizable{

	private int noTemporada = 1;
	
	public Serie() {
		super();
		this.noTemporada = 1;
	}

	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.noTemporada = 3;
		
	}

	public Serie(String titulo, String genero, String creador, int duracion, int noTemporadas) {
		super(titulo, genero, creador, duracion);
		this.noTemporada = noTemporadas;
	}

	public int getNoTemporada() {
		return noTemporada;
	}



	public void setNoTemporada(int noTemporada) {
		this.noTemporada = noTemporada;
	}

	public String toString() {
		
		return  super.toString()+"\nNo temporadas: "+noTemporada+"\n";
	}

	

	
	

	
}
