package mainapp;

import almacen.Biblioteca;
import models.Usuario;
import views.LoginView;

public class MainApp {

	public static void main(String[] args) {

		Biblioteca.usuarios.add(new Usuario("pepe","1"));
		
		System.out.println(Biblioteca.usuarios.get(0).getPasswd());
		
		new LoginView();
		
	}

}
