package models;

/**
 * Clase Videojuegos
 * 
 * @author adiaz
 *
 */

public class VideoJuegos {

	// Propiedades
	private String nombre;
	private int pegi;
	private String genero;
	private String desarrolladora;
	private int horas;

	/**
	 * Contructor de un videojuego
	 * 
	 * @param nombre         Nombre del videojuego
	 * @param pegi           Edad recomendada para jugar a ese videojuego
	 * @param genero         Genero que pertenece el videojuego
	 * @param desarrolladora Desarrolladora del videojuego
	 * @param horas          Horas que le has jugado a ese videojuego
	 */

	public VideoJuegos(String nombre, int pegi, String genero, String desarrolladora, int horas) {
		super();
		this.nombre = nombre;
		this.pegi = pegi;
		this.genero = genero;
		this.desarrolladora = desarrolladora;
		this.horas = horas;
	}

	/**
	 * Metodo que te devuelve el nombre del videojuego
	 * 
	 * @return Nombre del videojuego
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que envia el nombre que queremos poner al videojuego
	 * 
	 * @param nombre Nombre al que le queremos poner al videojuego
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que te devuelve el pegi del videojuego
	 * 
	 * @return Pegi del videojuego
	 */

	public int getPegi() {
		return pegi;
	}

	/**
	 * Metodo que envia el pegi que queremos poner al videojuego
	 * 
	 * @param pegi Pegi al que le queremos poner al videojuego
	 */

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	/**
	 * Metodo que te devuelve el genero del videojuego
	 * 
	 * @return Genero del videojuego
	 */

	public String getGenero() {
		return genero;
	}

	/**
	 * Metodo que envia el genero que queremos poner al videojuego
	 * 
	 * @param genero Genero al que le queremos poner al videojuego
	 */

	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Metodo que te devuelve la desarrolladora del videojuego
	 * 
	 * @return Desarrolladora del videojuego
	 */

	public String getDesarrolladora() {
		return desarrolladora;
	}

	/**
	 * Metodo que envia la desarrolladora que queremos poner al videojuego
	 * 
	 * @param desarrolladora Desarrolladora al que le queremos poner al videojuego
	 */

	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}

	/**
	 * Metodo que te devuelve las horas que has jugado al videojuego
	 * 
	 * @return Horas que has jugado
	 */

	public int getHoras() {
		return horas;
	}

	/**
	 * Metodo que envia las horas que hemos jugado al videojuego
	 * 
	 * @param horas Horas que hemos jugado al videojuego
	 */

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
