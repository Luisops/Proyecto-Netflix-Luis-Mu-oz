package com.luisops.netflix;

import java.util.Arrays;

public class Ejecutable {

	
	public static void main(String[] args) {
		
		//int miArray[] = new int[5];
		
		Pelicula miArrayDePeliculas[] = new Pelicula[5];
	    miArrayDePeliculas[0] = new Pelicula("Rescatando al soldado Ryan", "Drama", "Steven Spielberg", 169, 1998) ;
		miArrayDePeliculas[1] = new Pelicula("Aprueba de Fuego", "Drama Romance y Cine Religioso");
		miArrayDePeliculas[2] = new Pelicula();
		miArrayDePeliculas[3] = new Pelicula("Reto de Valientes", "Drama y Cine Religioso", "Alex Kendrick", 130, 2011);
		miArrayDePeliculas[4] = new Pelicula("Desafio a los Gigantes", "Drama");
		
		System.out.println("--------------Lista de todas la Peliculas-----------------------\n");
		
		for (Pelicula pelicula : miArrayDePeliculas) {
			
			System.out.println(pelicula);
		}
	    
		Serie  miArrayDeSerie[] =  new Serie[5];
		 miArrayDeSerie[0] =  new Serie("Masha y el Oso", "Aventura y Comedia", "Oleg Kuzukov", 7, 4);
		 miArrayDeSerie[1] =  new Serie("Shaun the Sheep", "Comedia y Aventura", "Nick Park",7, 6);	
		 miArrayDeSerie[2] =  new Serie("La Guardia del Leon", "Animación y Aventura");
		 miArrayDeSerie[3] =  new Serie("Anne with an E", "Drama", "Nick Caro",69, 3);		 
		 miArrayDeSerie[4] =  new Serie("Bolivar", "Juana Uribe");
	
		 System.out.println("--------------Lista de todas las Series---------------------\n");
		
		 for (Serie serie : miArrayDeSerie) {
			System.out.println(serie);
		}
		//marcar como visto
		
		miArrayDePeliculas[3].marcarVisto("1h 10m 15s");
		miArrayDePeliculas[4].marcarVisto("1h 5m 2s");
		miArrayDeSerie[1].marcarVisto("2m 05s");
		miArrayDeSerie[3].marcarVisto("5m 10s");
		 
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
	

	public static String peliculaRecinte(Pelicula mispeliculas[]) {
		int maximo = 0;
		int indice = 0;//3
		
		for (int i = 0; i < mispeliculas.length; i++) {
			if(mispeliculas[i].getAno()>maximo) {
				maximo = mispeliculas[i].getAno();
				indice=i;
			}
	
		}
		
		return mispeliculas[indice].toString();
	}
	
	public static String seriesMasVistas(Serie misSeries[]) {
		int maximo=0;
		int indice=0;
		
		for (int i = 0; i < misSeries.length; i++) {
			if(misSeries[i].getNoTemporada()>maximo) {
				maximo= misSeries[i].getNoTemporada();
				indice=i;
			}
			
		}
		
		return misSeries[indice].toString();
	}
}
