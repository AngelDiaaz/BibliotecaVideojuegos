package views;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class BibliotecaView {

	private JFrame frame;
	private JButton btnSiguiente;
	private JButton btnAtras;

	/**
	 * Create the application.
	 */
	public BibliotecaView() {
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
	
	private void configureUIComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 603, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setForeground(Color.BLACK);
		btnSiguiente.setBackground(Color.LIGHT_GRAY);
		btnSiguiente.setFont(new Font("Verdana", Font.BOLD, 14));
		btnSiguiente.setBounds(487, 23, 75, 61);
		frame.getContentPane().add(btnSiguiente);

		btnAtras = new JButton("<");
		btnAtras.setForeground(Color.BLACK);
		btnAtras.setBackground(Color.LIGHT_GRAY);
		btnAtras.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAtras.setBounds(23, 23, 75, 61);
		frame.getContentPane().add(btnAtras);
	}
	
	private void configureListeners() {
		
	}
}
