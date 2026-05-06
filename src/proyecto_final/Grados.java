package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

public class Grados extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
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
		setBounds(100, 100, 622, 336);
		getContentPane().setLayout(null);
		{
			table = new JTable();
			table.setBounds(10, 11, 421, 227);
			getContentPane().add(table, BorderLayout.WEST);
		}
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		txtGrado.setBounds(478, 47, 89, 20);
		getContentPane().add(txtGrado);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		txtGrupo.setBounds(478, 101, 89, 20);
		getContentPane().add(txtGrupo);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(478, 144, 89, 23);
		getContentPane().add(btnIngresar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(477, 181, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(477, 215, 89, 23);
		getContentPane().add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(477, 249, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(174, 249, 89, 23);
		getContentPane().add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Grado:");
		lblNewLabel.setBounds(441, 50, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		lblNewLabel_1.setBounds(441, 104, 46, 14);
		getContentPane().add(lblNewLabel_1);
	}
}
//