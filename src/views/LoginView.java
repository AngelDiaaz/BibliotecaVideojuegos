package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import almacen.Biblioteca;
import models.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase java swing donde se muestra la view del login del programa
 * 
 * @author adiaz
 *
 */

public class LoginView {

	// Propiedades
	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField pfPassword;
	private JLabel lblLogin;
	private JLabel lblUsuario;
	private JLabel lblPasswd;
	private JButton btnEntrar;
	private JButton btnRegistro;
	private JButton btnSalir;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		configureUIComponents();
		configureListeners();
	}

	/**
	 * Componentes de la view
	 */
	public void configureUIComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblLogin.setBounds(166, 11, 93, 47);
		frame.getContentPane().add(lblLogin);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(93, 99, 69, 20);
		frame.getContentPane().add(lblUsuario);

		lblPasswd = new JLabel("Contrase\u00F1a");
		lblPasswd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPasswd.setBounds(64, 144, 98, 20);
		frame.getContentPane().add(lblPasswd);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.setBounds(208, 99, 151, 22);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		pfPassword = new JPasswordField();
		pfPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pfPassword.setBounds(208, 144, 151, 22);
		frame.getContentPane().add(pfPassword);

		btnEntrar = new JButton("Entrar\r\n");
		btnEntrar.setBounds(310, 195, 93, 36);
		frame.getContentPane().add(btnEntrar);

		btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(180, 195, 98, 36);
		frame.getContentPane().add(btnRegistro);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(45, 195, 93, 36);
		frame.getContentPane().add(btnSalir);
	}

	/**
	 * Funciones de los elementos de la view
	 */
	public void configureListeners() {
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarLogin();
			}
		});

		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegistroView();
				frame.dispose();
			}
		});

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		pfPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) { // Para que al pulsar la tecla enter, te deje acceder
					comprobarLogin();
				}
			}
		});

	}

	/**
	 * Metodo que comprueba si el usuario y la contrase�a es correcta. Comprueba que
	 * este registrado en el programa, si lo esta te manda a la view de los
	 * videojuegos
	 */
	private void comprobarLogin() {
		String username = txtUsuario.getText();
		String password = new String(pfPassword.getPassword());
		boolean encontrado = false;

		for (Usuario usu : Biblioteca.usuarios) { // Recorre el array list usuarios
			if (username.equals(usu.getNombre()) && password.equals(usu.getPasswd())) { // Si el usuario
																						// coincide con
																						// la contrase�a y el
																						// nombre
				encontrado = true;
				break;
			}
		}

		if (encontrado == true) {
			new BibliotecaView();
			frame.dispose();

		} else {
			JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrecta vuelve a probar");
		}

	}
}
