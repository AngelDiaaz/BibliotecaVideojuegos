package models;

/**
 * Clase Usuario
 * 
 * @author adiaz
 *
 */

public class Usuario {

	// Propiedades
	private String nombre;
	private String passwd;

	/**
	 * Constructor de un usuario
	 * 
	 * @param nombre Nombre del usuario
	 * @param passwd Contraseña del usuario
	 */

	public Usuario(String nombre, String passwd) {
		super();
		this.nombre = nombre;
		this.passwd = passwd;
	}

	/**
	 * Metodo que te devuelve el nombre del usuario
	 * 
	 * @return Nombre del usuario
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que envia el nombre que queremos poner al usuario
	 * 
	 * @param nombre Nombre al que le queremos poner al usuario
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que te devuelve la contraseña del usuario
	 * 
	 * @return Contraseña del usuario
	 */

	public String getPasswd() {
		return passwd;
	}

	/**
	 * Metodo que envia la contraseña que queremos poner al usuario
	 * 
	 * @param passwd Contraseña al que le queremos poner al usuario
	 */

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
