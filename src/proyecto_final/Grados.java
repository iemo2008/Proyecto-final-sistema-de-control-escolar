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
			Metodos.Personalizar_frame();
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
		setBounds(100, 100, 636, 377);
		getContentPane().setLayout(null);
		{
			table = new JTable();
			table.setBounds(216, 136, 385, 188);
			getContentPane().add(table, BorderLayout.WEST);
		}
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		txtGrado.setBounds(10, 35, 180, 20);
		getContentPane().add(txtGrado);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		txtGrupo.setBounds(10, 76, 180, 20);
		getContentPane().add(txtGrupo);
		
		EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
		btnIngresar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/impoticon.png")));
		btnIngresar.setBounds(10, 116, 180, 54);
		getContentPane().add(btnIngresar);
		
		EstiloBoton btnModificar = new EstiloBoton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/modificateicon.png")));
		btnModificar.setBounds(10, 192, 180, 54);
		getContentPane().add(btnModificar);
		
		EstiloBoton btnBuscar = new EstiloBoton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/searchcaticon.png")));
		btnBuscar.setBounds(216, 72, 134, 54);
		getContentPane().add(btnBuscar);
		
		EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/eliminateicon.png")));
		btnEliminar.setBounds(10, 268, 180, 56);
		getContentPane().add(btnEliminar);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.setIcon(new ImageIcon(Grados.class.getResource("/iconos/restarticon.png")));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Grados.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
			}
		});
		btnVolver.setBounds(450, 14, 151, 54);
		getContentPane().add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Grado:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField txtBuscarGrupo = new JFormattedTextField();
		txtBuscarGrupo.setBounds(360, 85, 238, 29);
		getContentPane().add(txtBuscarGrupo);
	}
}
//