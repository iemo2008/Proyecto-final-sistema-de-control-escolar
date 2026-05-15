package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class Materias extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		setModal(true);
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setBounds(100, 100, 381, 342);
		getContentPane().setLayout(null);
		{
			JFormattedTextField txtNombre = new JFormattedTextField();
			txtNombre.setBounds(63, 17, 285, 20);
			getContentPane().add(txtNombre);
		}
		{
			table = new JTable();
			table.setBounds(10, 47, 337, 131);
			getContentPane().add(table);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 19, 49, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
			btnEliminar.setBounds(259, 189, 71, 38);
			getContentPane().add(btnEliminar);
		}
		{
			EstiloBoton btnBuscar = new EstiloBoton("Buscar");
			btnBuscar.setBounds(180, 189, 69, 38);
			getContentPane().add(btnBuscar);
		}
		{
			EstiloBoton btnModificar = new EstiloBoton("Modificar");
			btnModificar.setBounds(95, 188, 75, 38);
			getContentPane().add(btnModificar);
		}
		{
			EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
			btnIngresar.setBounds(10, 189, 75, 38);
			getContentPane().add(btnIngresar);
		}
		{
			EstiloBoton btnVolver = new EstiloBoton("Volver");
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Materias.this.setVisible(false);
					Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
					VentanaSeleccion.setLocationRelativeTo(null);
					VentanaSeleccion.setVisible(true);
				}
			});
			btnVolver.setBounds(10, 237, 75, 38);
			getContentPane().add(btnVolver);
		}
	}

}
//