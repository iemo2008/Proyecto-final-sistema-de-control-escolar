package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class Seleccion_modificar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Seleccion_modificar dialog = new Seleccion_modificar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Seleccion_modificar() {
		setModal(true);
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setTitle("Tipo de usuario a administrar");
		setBounds(100, 100, 655, 389);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			EstiloBoton btnNewButton = new EstiloBoton("Administradores");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Administradores VentanaAdmin = new Administradores();
					VentanaAdmin.setLocationRelativeTo(null);
					VentanaAdmin.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconadmin.png"));
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(23, 36, 162, 105);
			contentPanel.add(btnNewButton);
		}
		{
			EstiloBoton btnNewButton = new EstiloBoton("Profesores");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Profesores Ventanaprof = new Profesores();
					Ventanaprof.setLocationRelativeTo(null);
					Ventanaprof.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconteacher.png"));
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(232, 36, 162, 105);
			contentPanel.add(btnNewButton);
		}
		{
			EstiloBoton btnNewButton = new EstiloBoton("Alumnos");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Alumnos VentanaAlumnos = new Alumnos();
					VentanaAlumnos.setLocationRelativeTo(null);
					VentanaAlumnos.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconstudent.png"));
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(435, 36, 162, 105);
			contentPanel.add(btnNewButton);
		}
		{
			EstiloBoton btnNewButton = new EstiloBoton("Materias");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Materias VentanaMaterias = new Materias();
					VentanaMaterias.setLocationRelativeTo(null);
					VentanaMaterias.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\classeicon.png"));
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(23, 184, 162, 105);
			contentPanel.add(btnNewButton);
		}
		{
			EstiloBoton btnNewButton = new EstiloBoton("Grados");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Grados VentanaGrados = new Grados();
					VentanaGrados.setLocationRelativeTo(null);
					VentanaGrados.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\gradesicon.png"));
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(232, 184, 162, 105);
			contentPanel.add(btnNewButton);
		}
		{
			EstiloBoton btnNewButton = new EstiloBoton("Volver");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setIcon(null);
			btnNewButton.setBackground(new Color(26, 55, 77));
			btnNewButton.setBounds(435, 213, 162, 76);
			contentPanel.add(btnNewButton);
		}
	}

}
//