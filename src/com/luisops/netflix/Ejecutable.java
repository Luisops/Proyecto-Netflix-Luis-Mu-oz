package com.luisops.netflix;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejecutable {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Pelicula> miArrayDePeliculas = new ArrayList<Pelicula>();
		miArrayDePeliculas.add(new Pelicula("Rescatando al soldado Ryan", "Drama", "Steven Spielberg", 169, 1998));
		miArrayDePeliculas.add(new Pelicula("Aprueba de Fuego", "Drama Romance y Cine Religioso"));
		miArrayDePeliculas.add(new Pelicula());
		miArrayDePeliculas.add(new Pelicula("Reto de Valientes", "Drama y Cine Religioso", "Alex Kendrick", 130, 2011));
		miArrayDePeliculas.add(new Pelicula("Desafio a los Gigantes", "Drama"));
		
		
		System.out.println("--------------Lista de todas la Peliculas-----------------------\n");
		
		for (Pelicula pelicula : miArrayDePeliculas) {
			
			System.out.println(pelicula);
		}
	    ArrayList<Serie> miArrayDeSerie = new ArrayList<Serie>();
		miArrayDeSerie.add(new Serie("Masha y el Oso", "Aventura y Comedia", "Oleg Kuzukov", 7, 4));
		miArrayDeSerie.add(new Serie("Shaun the Sheep", "Comedia y Aventura", "Nick Park",7, 6));
		miArrayDeSerie.add(new Serie("La Guardia del Leon", "Animación y Aventura"));
		miArrayDeSerie.add(new Serie("Anne with an E", "Drama", "Nick Caro",69, 3));
		miArrayDeSerie.add( new Serie("Bolivar", "Juana Uribe"));
	
		 System.out.println("--------------Lista de todas las Series---------------------\n");
		
		 for (Serie serie : miArrayDeSerie) {
			System.out.println(serie);
		}
		//marcar como visto
		try {
			 miArrayDePeliculas.get(3).marcarVisto("1h 10m 15s");
			 miArrayDePeliculas.get(4).marcarVisto("1h 5m 2s");
			 miArrayDePeliculas.get(6).marcarVisto("1h 4m 3s");//
			
			 miArrayDeSerie.get(1).marcarVisto("2m 05s");
			 miArrayDeSerie.get(3).marcarVisto("5m 10s");
		} catch (Exception e) {
			System.out.println("Error al marcar visto");
		}
		
		 
		System.out.println("------------------Lista de Peliculas que se visualizaron----------------\n");
		
		for (Pelicula pelicula : miArrayDePeliculas) {
			
			if (pelicula.esVisto()) {
				System.out.println(pelicula.toString());
				System.out.println(" => "+pelicula.tiempoVisto()+"\n");
			}
		}
		
		System.out.println("------------------Lista de Series que se visualizaron----------------\n");
		
		for (Serie serie : miArrayDeSerie) {
			
			if (serie.esVisto()) {
				System.out.println(serie.toString());
				System.out.println(" => "+serie.tiempoVisto()+"\n");
			}
		}
		
		//Series mas vistas y peliculas mas recientes
		System.out.println("------------------Pelicula mas reciente----------------\n");
		System.out.println(peliculaRecinte(miArrayDePeliculas));
		System.out.println("------------------Series mas vistas----------------\n");
		System.out.println(seriesMasVistas(miArrayDeSerie));
	}
	

	public static String peliculaRecinte(ArrayList<Pelicula> misPeliculas) {
		int maximo = 0;
		int indice = 0;//3
		
		for (int i = 0; i < misPeliculas.size(); i++) {
			if(misPeliculas.get(i).getAno()>maximo) {
				maximo = misPeliculas.get(i).getAno();
				indice=i;
			}
	
		}
		
		return misPeliculas.get(indice).toString();
	}
	
	public static String seriesMasVistas(ArrayList<Serie> misSeries) {
		int maximo=0;
		int indice=0;
		
		for (int i = 0; i < misSeries.size(); i++) {
			if(misSeries.get(i).getNoTemporada()>maximo) {
				maximo= misSeries.get(i).getNoTemporada();
				indice=i;
			}
			
		}
		
		return misSeries.get(indice).toString();
	}
}
