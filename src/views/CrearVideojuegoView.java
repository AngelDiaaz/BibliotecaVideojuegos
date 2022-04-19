package views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import almacen.Biblioteca;
import models.VideoJuegos;

/**
 * Clase java swing donde se muestra la view para registrar un nuevo videojuego
 * 
 * @author adiaz
 *
 */

public class CrearVideojuegoView {

	// Propiedades
	private JFrame frame;
	private JTextField tfPegi;
	private JLabel lblAdd;
	private JButton btnCrear;
	private JTextField tfNombre;
	private JTextField textDesarrolladora;
	private JTextField textGenero;
	private JButton btnSalir;
	private JTextField txtHoras;

	/**
	 * Create the application.
	 */
	public CrearVideojuegoView() {
		initialize();
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
	private void configureUIComponents() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 560, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblAdd = new JLabel("A\u00F1adir Videojuego");
		lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblAdd.setBounds(121, 23, 386, 45);
		frame.getContentPane().add(lblAdd);

		tfNombre = new JTextField();
		tfNombre.setText("nombre");
		tfNombre.setColumns(10);
		tfNombre.setBounds(93, 95, 314, 23);
		frame.getContentPane().add(tfNombre);

		tfPegi = new JTextField();
		tfPegi.setText("pegi (insertar n\u00FAmero)");
		tfPegi.setBounds(93, 129, 314, 23);
		frame.getContentPane().add(tfPegi);
		tfPegi.setColumns(10);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(352, 299, 89, 23);
		frame.getContentPane().add(btnCrear);

		textDesarrolladora = new JTextField();
		textDesarrolladora.setText("desarrolladora");
		textDesarrolladora.setColumns(10);
		textDesarrolladora.setBounds(93, 197, 314, 23);
		frame.getContentPane().add(textDesarrolladora);

		textGenero = new JTextField();
		textGenero.setText("genero");
		textGenero.setColumns(10);
		textGenero.setBounds(93, 163, 314, 23);
		frame.getContentPane().add(textGenero);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(93, 299, 89, 23);
		frame.getContentPane().add(btnSalir);

		txtHoras = new JTextField();
		txtHoras.setText("hoas (insertar n\u00FAmero)");
		txtHoras.setColumns(10);
		txtHoras.setBounds(93, 231, 314, 23);
		frame.getContentPane().add(txtHoras);
	}

	/**
	 * Funciones de los elementos de la view
	 */
	private void configureListeners() {
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarJuego();
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new BibliotecaView();
			}
		});
	}

	/**
	 * Metodo que inserta un videojuego en el ArrayList de videojuegos, en el que
	 * comprueba si ya esta registrado o no. Una vez creado y guardado se cierra la
	 * pesta�a y se va a la view donde se muestra los videojuegos
	 */
	private void insertarJuego() {
		boolean repetido = false;
		if (tfPegi.getText().isEmpty()) {
			JOptionPane.showMessageDialog(btnCrear, "Revisa todos los campos");
		} else {
			for (VideoJuegos juegos : Biblioteca.juegos) {
				if (juegos.getNombre().equalsIgnoreCase(tfNombre.getText())) {
					repetido = true;
				}
			}
			if (repetido == false) {
				String nombre = tfNombre.getText();
				int pegi = Integer.parseInt(tfPegi.getText());
				String genero = textGenero.getText();
				String desa = textDesarrolladora.getText();
				int horas = Integer.parseInt(txtHoras.getText());

				VideoJuegos p = new VideoJuegos(nombre, pegi, genero, desa, horas);
				Biblioteca.juegos.add(p);

				JOptionPane.showMessageDialog(btnCrear, "Videojuego a�adido");
				new BibliotecaView();
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(btnCrear, "Videojuego ya registrado");
			}

		}
	}
}
