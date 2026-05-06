package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JLabel;

public class Materias extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Materias dialog = new Materias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Materias() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JFormattedTextField txtNombre = new JFormattedTextField();
			txtNombre.setBounds(63, 0, 340, 20);
			getContentPane().add(txtNombre);
		}
		{
			table = new JTable();
			table.setBounds(63, 31, 337, 131);
			getContentPane().add(table);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 3, 49, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(329, 189, 69, 23);
			getContentPane().add(btnEliminar);
		}
		{
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(250, 189, 69, 23);
			getContentPane().add(btnBuscar);
		}
		{
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setBounds(150, 189, 75, 23);
			getContentPane().add(btnModificar);
		}
		{
			JButton btnIngresar = new JButton("Ingresar");
			btnIngresar.setBounds(65, 189, 75, 23);
			getContentPane().add(btnIngresar);
		}
		{
			JButton btnVolver = new JButton("Volver");
			btnVolver.setBounds(202, 227, 75, 23);
			getContentPane().add(btnVolver);
		}
	}

}
//