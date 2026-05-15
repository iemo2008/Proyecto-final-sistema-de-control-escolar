package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import com.formdev.flatlaf.FlatDarkLaf;

public class Administradores extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtxNombreAdmin;
	private JTextField txtxApellidosAdmin;
	private JTextField txtCorreoAdmin;
	private JTextField txtClaveAdmin;
	private JTextField txtUsuarioAdmin;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtxBuscarAdmin;
	private JButton btnBuscarAdmin;
	private JTable tablaAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Administradores dialog = new Administradores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Administradores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Administradores");
		setBounds(100, 100, 715, 469);
		getContentPane().setLayout(null);
		{
			txtxNombreAdmin = new JTextField();
			txtxNombreAdmin.setBounds(10, 22, 228, 18);
			getContentPane().add(txtxNombreAdmin);
			txtxNombreAdmin.setColumns(10);
		}
		{
			txtxApellidosAdmin = new JTextField();
			txtxApellidosAdmin.setColumns(10);
			txtxApellidosAdmin.setBounds(10, 66, 228, 18);
			getContentPane().add(txtxApellidosAdmin);
		}
		{
			txtCorreoAdmin = new JTextField();
			txtCorreoAdmin.setColumns(10);
			txtCorreoAdmin.setBounds(10, 118, 228, 18);
			getContentPane().add(txtCorreoAdmin);
		}
		{
			txtClaveAdmin = new JTextField();
			txtClaveAdmin.setColumns(10);
			txtClaveAdmin.setBounds(10, 169, 228, 18);
			getContentPane().add(txtClaveAdmin);
		}
		{
			txtUsuarioAdmin = new JTextField();
			txtUsuarioAdmin.setColumns(10);
			txtUsuarioAdmin.setBounds(10, 215, 228, 18);
			getContentPane().add(txtUsuarioAdmin);
		}
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 10, 44, 12);
		getContentPane().add(lblNewLabel);
		{
			lblNewLabel_1 = new JLabel("Correo");
			lblNewLabel_1.setBounds(10, 107, 44, 12);
			getContentPane().add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Clave");
			lblNewLabel_2.setBounds(10, 158, 44, 12);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Usuario");
			lblNewLabel_3.setBounds(10, 197, 44, 12);
			getContentPane().add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Apellidos");
			lblNewLabel_4.setBounds(10, 55, 44, 12);
			getContentPane().add(lblNewLabel_4);
		}
		
		JButton btnCambiosAdmin = new JButton("New button");
		btnCambiosAdmin.setBounds(10, 286, 100, 73);
		getContentPane().add(btnCambiosAdmin);
		
		JButton btnIngresarAdmin = new JButton("New button");
		btnIngresarAdmin.setBounds(120, 264, 118, 29);
		getContentPane().add(btnIngresarAdmin);
		
		JButton btnModificarAdmin = new JButton("New button");
		btnModificarAdmin.setBounds(120, 308, 118, 29);
		getContentPane().add(btnModificarAdmin);
		
		JButton EliminarAdmin = new JButton("New button");
		EliminarAdmin.setBounds(120, 389, 118, 29);
		getContentPane().add(EliminarAdmin);
		
		JButton btnVolver = new JButton("New button");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administradores.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
				
			}
		});
		btnVolver.setBounds(10, 384, 100, 38);
		getContentPane().add(btnVolver);
		
		txtxBuscarAdmin = new JTextField();
		txtxBuscarAdmin.setBounds(386, 22, 271, 18);
		getContentPane().add(txtxBuscarAdmin);
		txtxBuscarAdmin.setColumns(10);
		{
			btnBuscarAdmin = new JButton("New button");
			btnBuscarAdmin.setBounds(285, 21, 84, 20);
			getContentPane().add(btnBuscarAdmin);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(291, 67, 376, 305);
		getContentPane().add(scrollPane);
		{
			tablaAdmin = new JTable();
			scrollPane.setViewportView(tablaAdmin);
		}
	}
}
