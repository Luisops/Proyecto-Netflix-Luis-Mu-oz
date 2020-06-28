package com.luisops.netflix;

public class Netflix implements IVisualizable{

	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private boolean visto= false;
	
	private String tiempoVisto = "00h 00m";
	
	public Netflix() {
		this.titulo="Pasion de Cristo";
		this.genero="Drama , Religion";
		this.creador="Mel Gibson";
		this.duracion=126;
	}
	
	public Netflix(String titulo, String genero) {
		
		this.titulo=titulo;
		this.genero=genero;
		this.creador=" ";
		this.duracion=00;
		
	}

	public Netflix(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
	
		return  "TITULO: "+getTitulo()+"\nGENERO: "+getGenero()+"\nCREADOR: "+getCreador()+"\nDURACION: "+getDuracion()+" minutos";
	}

	@Override
	public void marcarVisto(String tiempoVisualizacion) {
		this.visto= true;
		this.tiempoVisto = "Visualizado hasta: "+ tiempoVisualizacion;
		
	}

	@Override
	public boolean esVisto() {
		
		return visto;
	}

	@Override
	public String tiempoVisto() {
		// TODO Auto-generated method stub
		return this.tiempoVisto;
	}

	
	
}
