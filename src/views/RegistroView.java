package views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import almacen.Biblioteca;
import models.Usuario;

public class RegistroView {

	private JFrame frame;
	private JTextField tfUsername;
	private JPasswordField pwdPassword;
	private JPasswordField pwdConfirmPassword;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblConfirmarPassword;
	private JButton btnRegister;
	private JLabel lblRegistrar;
	private JButton btnSalir;

	public RegistroView() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblRegistrar = new JLabel("Registro de usuarios");
		lblRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRegistrar.setBounds(96, 11, 242, 37);
		frame.getContentPane().add(lblRegistrar);

		tfUsername = new JTextField();
		tfUsername.setBounds(184, 82, 180, 20);
		frame.getContentPane().add(tfUsername);
		tfUsername.setColumns(10);

		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(184, 113, 180, 20);
		frame.getContentPane().add(pwdPassword);

		pwdConfirmPassword = new JPasswordField();
		pwdConfirmPassword.setBounds(184, 144, 180, 20);
		frame.getContentPane().add(pwdConfirmPassword);

		lblUsername = new JLabel("Username");
		lblUsername.setBounds(23, 82, 108, 14);
		frame.getContentPane().add(lblUsername);

		lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setBounds(23, 113, 117, 14);
		frame.getContentPane().add(lblPassword);

		lblConfirmarPassword = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmarPassword.setBounds(21, 144, 153, 14);
		frame.getContentPane().add(lblConfirmarPassword);

		btnRegister = new JButton("Registrar");
		btnRegister.addActionListener(new ActionListener() {
			// OnClick
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				String password = new String(pwdPassword.getPassword());
				String confirmarPassword = new String(pwdConfirmPassword.getPassword());
				if (password.length() >= 8) {
					if (password.equals(confirmarPassword)) {
						if (!username.isEmpty() && !password.isEmpty() && !confirmarPassword.isEmpty()) {

							Usuario u = new Usuario(username, password);
							boolean comprobar = comprobarNombreUsu(u);
							if (comprobar == true) {
								Biblioteca.usuarios.add(u);
								JOptionPane.showMessageDialog(btnRegister, "Usuario registrado correctamente");
								new LoginView();
								frame.dispose();
							} else {
								JOptionPane.showMessageDialog(btnRegister,
										"nombre de usuario ya registrado, pruebe con otro");
							}
						} else {
							JOptionPane.showMessageDialog(lblRegistrar, "Rellena todos los campos");
						}
					} else {
						JOptionPane.showMessageDialog(lblRegistrar, "Las contraseñas no coinciden");
					}
				} else {
					JOptionPane.showMessageDialog(lblRegistrar, "Las contraseñas tienen que tener mas de 8 caracteres");
				}
			}
		});
		btnRegister.setBounds(252, 202, 89, 23);
		frame.getContentPane().add(btnRegister);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new LoginView();
			}
		});
		btnSalir.setBounds(85, 202, 89, 23);
		frame.getContentPane().add(btnSalir);
	}

	private boolean comprobarNombreUsu(Usuario u) {

		for (Usuario usu : Biblioteca.usuarios) {
			if (usu.getNombre().equals(u.getNombre())) {
				return false;
			}
		}

		return true;
	}
}
