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
import javax.swing.ImageIcon;

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
		setBounds(100, 100, 880, 556);
		getContentPane().setLayout(null);
		{
			txtxNombreAdmin = new JTextField();
			txtxNombreAdmin.setBounds(10, 32, 228, 18);
			getContentPane().add(txtxNombreAdmin);
			txtxNombreAdmin.setColumns(10);
		}
		{
			txtxApellidosAdmin = new JTextField();
			txtxApellidosAdmin.setColumns(10);
			txtxApellidosAdmin.setBounds(10, 77, 228, 18);
			getContentPane().add(txtxApellidosAdmin);
		}
		{
			txtCorreoAdmin = new JTextField();
			txtCorreoAdmin.setColumns(10);
			txtCorreoAdmin.setBounds(10, 126, 228, 18);
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
			lblNewLabel_1.setBounds(10, 105, 44, 12);
			getContentPane().add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Clave");
			lblNewLabel_2.setBounds(10, 147, 44, 12);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Usuario");
			lblNewLabel_3.setBounds(10, 197, 44, 12);
			getContentPane().add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Apellidos");
			lblNewLabel_4.setBounds(10, 55, 59, 12);
			getContentPane().add(lblNewLabel_4);
		}
		
		EstiloBoton btnIngresarAdmin = new EstiloBoton("Ingresar");
		btnIngresarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/impoticon.png")));
		btnIngresarAdmin.setBounds(10, 274, 228, 54);
		getContentPane().add(btnIngresarAdmin);
		
		EstiloBoton btnModificarAdmin = new EstiloBoton("Modificar");
		btnModificarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/modificateicon.png")));
		btnModificarAdmin.setBounds(10, 420, 228, 54);
		getContentPane().add(btnModificarAdmin);
		
		EstiloBoton EliminarAdmin = new EstiloBoton("Eliminar");
		EliminarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EliminarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/eliminateicon.png")));
		EliminarAdmin.setBounds(10, 349, 228, 54);
		getContentPane().add(EliminarAdmin);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/restarticon.png")));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administradores.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
				
			}
		});
		btnVolver.setBounds(718, 14, 138, 42);
		getContentPane().add(btnVolver);
		
		txtxBuscarAdmin = new JTextField();
		txtxBuscarAdmin.setBounds(426, 71, 430, 32);
		getContentPane().add(txtxBuscarAdmin);
		txtxBuscarAdmin.setColumns(10);
		{
			btnBuscarAdmin = new EstiloBoton("Buscar");
			btnBuscarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarAdmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscarAdmin.setBounds(261, 58, 147, 57);
			getContentPane().add(btnBuscarAdmin);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 127, 608, 347);
		getContentPane().add(scrollPane);
		{
			tablaAdmin = new JTable();
			scrollPane.setViewportView(tablaAdmin);
		}
	}
}
