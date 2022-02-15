package models;

public class VideoJuegos {
	
	private String nombre;
	private int pegi;
	private String genero;
	private String desarrolladora;
	private int horas;
	
	public VideoJuegos(String nombre, int pegi, String genero, String desarrolladora, int horas) {
		super();
		this.nombre = nombre;
		this.pegi = pegi;
		this.genero = genero;
		this.desarrolladora = desarrolladora;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPegi() {
		return pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDesarrolladora() {
		return desarrolladora;
	}

	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
