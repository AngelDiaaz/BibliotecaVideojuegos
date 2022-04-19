package almacen;

import java.util.ArrayList;

import models.Usuario;
import models.VideoJuegos;

/**
 * Clase que contiene un ArrayList para almacenar los videojuegos y otro
 * ArrayList para almacenar los usuarios
 * 
 * @author adiaz
 *
 */

public class Biblioteca {

	// ArrayList donde se almacena los videojuegos
	public static ArrayList<VideoJuegos> juegos = new ArrayList<VideoJuegos>();

	// ArrayList donde se almacena los usuarios
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

}
