package mainapp;

import almacen.Biblioteca;
import models.Usuario;
import models.VideoJuegos;
import views.LoginView;

/**
 * Clase principal donde iniciamos el programa y registramos un usuario y
 * varios videojuegos para mostrar
 * 
 * @author adiaz
 *
 */

public class MainApp {
	
	/**
	 * Metodo principal o main
	 * @param args
	 */

	public static void main(String[] args) {

		//Creamos un usuario
		Biblioteca.usuarios.add(new Usuario("pepe", "1"));

		//Creamos varios videojuegos
		Biblioteca.juegos.add(new VideoJuegos("Los Simpson", 3, "Aventuras", "Bart Company", 2));
		Biblioteca.juegos.add(new VideoJuegos("God of War", 18, "Aventuras", "Santa Monica", 20));
		Biblioteca.juegos.add(new VideoJuegos("GTA V", 18, "Accion", "Rockstar", 7));
		Biblioteca.juegos.add(new VideoJuegos("Call of Duty", 16, "Disparos", "AAAAAA", 102));
		Biblioteca.juegos.add(new VideoJuegos("Barbie", 3, "Simulacion", "Kent y sus colegas S.L.", 200));

		//Iniciamos el programa a traves de la pestaña del login
		new LoginView();

	}

}
