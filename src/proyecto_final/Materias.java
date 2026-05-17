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
import javax.swing.ImageIcon;

public class Materias extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
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
		setBounds(100, 100, 652, 371);
		getContentPane().setLayout(null);
		{
			JFormattedTextField txtNombre = new JFormattedTextField();
			txtNombre.setBounds(10, 61, 161, 20);
			getContentPane().add(txtNombre);
		}
		{
			table = new JTable();
			table.setBounds(200, 124, 415, 185);
			getContentPane().add(table);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 37, 49, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
			btnEliminar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/eliminateicon.png")));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEliminar.setBounds(10, 248, 161, 61);
			getContentPane().add(btnEliminar);
		}
		{
			EstiloBoton btnBuscarMateria = new EstiloBoton("Buscar");
			btnBuscarMateria.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscarMateria.setIcon(new ImageIcon(Materias.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarMateria.setBounds(200, 61, 125, 53);
			getContentPane().add(btnBuscarMateria);
		}
		{
			EstiloBoton btnModificar = new EstiloBoton("Modificar");
			btnModificar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/modificateicon.png")));
			btnModificar.setBounds(10, 174, 161, 64);
			getContentPane().add(btnModificar);
		}
		{
			EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
			btnIngresar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/impoticon.png")));
			btnIngresar.setBounds(10, 107, 161, 61);
			getContentPane().add(btnIngresar);
		}
		{
			EstiloBoton btnVolver = new EstiloBoton("Volver");
			btnVolver.setIcon(new ImageIcon(Materias.class.getResource("/iconos/restarticon.png")));
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Materias.this.setVisible(false);
					Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
					VentanaSeleccion.setLocationRelativeTo(null);
					VentanaSeleccion.setVisible(true);
				}
			});
			btnVolver.setBounds(502, 5, 113, 46);
			getContentPane().add(btnVolver);
		}
		{
			JFormattedTextField txtBuscarMateria = new JFormattedTextField();
			txtBuscarMateria.setBounds(347, 73, 268, 34);
			getContentPane().add(txtBuscarMateria);
		}
	}

}
//