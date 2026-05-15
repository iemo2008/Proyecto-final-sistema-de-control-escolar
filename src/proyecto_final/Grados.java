package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class Grados extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Grados dialog = new Grados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Grados() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 384, 375);
		getContentPane().setLayout(null);
		{
			table = new JTable();
			table.setBounds(10, 11, 183, 253);
			getContentPane().add(table, BorderLayout.WEST);
		}
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		txtGrado.setBounds(213, 35, 112, 20);
		getContentPane().add(txtGrado);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		txtGrupo.setBounds(213, 89, 112, 20);
		getContentPane().add(txtGrupo);
		
		EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
		btnIngresar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\impoticon.png"));
		btnIngresar.setBounds(213, 130, 134, 41);
		getContentPane().add(btnIngresar);
		
		EstiloBoton btnModificar = new EstiloBoton("Modificar");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\modificateicon.png"));
		btnModificar.setBounds(213, 182, 134, 41);
		getContentPane().add(btnModificar);
		
		EstiloBoton btnBuscar = new EstiloBoton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\searchcaticon.png"));
		btnBuscar.setBounds(213, 233, 134, 41);
		getContentPane().add(btnBuscar);
		
		EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\eliminateicon.png"));
		btnEliminar.setBounds(213, 287, 134, 41);
		getContentPane().add(btnEliminar);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Grados.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
			}
		});
		btnVolver.setBounds(46, 287, 112, 41);
		getContentPane().add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Grado:");
		lblNewLabel.setBounds(216, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		lblNewLabel_1.setBounds(216, 65, 46, 14);
		getContentPane().add(lblNewLabel_1);
	}
}
//