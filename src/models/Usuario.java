package models;

public class Usuario {
	
	private String nombre;
	private String passwd;
	
	public Usuario(String nombre, String passwd) {
		super();
		this.nombre = nombre;
		this.passwd = passwd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	

}
