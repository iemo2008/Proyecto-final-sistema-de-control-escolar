import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Administradores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreAdmin;
	private JTextField txtApellidosAdmin;
	private JTextField txtCorreoAdmin;
	private JTextField txtClaveAdmin;
	private JTextField txtUsuarioAdmin;
	private JTextField txtBusquedaAdmin;
	private JTable tblBusquedaAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administradores frame = new Administradores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Administradores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreAdmin = new JLabel("Nombre");
		lblNombreAdmin.setBounds(12, 24, 56, 16);
		contentPane.add(lblNombreAdmin);
		
		JLabel lblApellidosAdmin = new JLabel("Apellidos");
		lblApellidosAdmin.setBounds(12, 53, 56, 16);
		contentPane.add(lblApellidosAdmin);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(12, 82, 56, 16);
		contentPane.add(lblCorreo);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(12, 111, 56, 16);
		contentPane.add(lblClave);
		
		JLabel lblUsuarioAdmin = new JLabel("Usuario");
		lblUsuarioAdmin.setBounds(12, 140, 56, 16);
		contentPane.add(lblUsuarioAdmin);
		
		txtNombreAdmin = new JTextField();
		txtNombreAdmin.setBounds(80, 21, 116, 22);
		contentPane.add(txtNombreAdmin);
		txtNombreAdmin.setColumns(10);
		
		txtApellidosAdmin = new JTextField();
		txtApellidosAdmin.setBounds(80, 50, 116, 22);
		contentPane.add(txtApellidosAdmin);
		txtApellidosAdmin.setColumns(10);
		
		txtCorreoAdmin = new JTextField();
		txtCorreoAdmin.setBounds(80, 79, 116, 22);
		contentPane.add(txtCorreoAdmin);
		txtCorreoAdmin.setColumns(10);
		
		txtClaveAdmin = new JTextField();
		txtClaveAdmin.setBounds(80, 108, 116, 22);
		contentPane.add(txtClaveAdmin);
		txtClaveAdmin.setColumns(10);
		
		txtUsuarioAdmin = new JTextField();
		txtUsuarioAdmin.setBounds(80, 137, 116, 22);
		contentPane.add(txtUsuarioAdmin);
		txtUsuarioAdmin.setColumns(10);
		
		JButton btnCambiosAdmin = new JButton("Cambios realizados por el admin");
		btnCambiosAdmin.setBounds(12, 169, 103, 66);
		contentPane.add(btnCambiosAdmin);
		
		JButton btnNuevoAdmin = new JButton("Nuevo Admin");
		btnNuevoAdmin.setBounds(134, 173, 97, 25);
		contentPane.add(btnNuevoAdmin);
		
		JButton btnModificarAdmin = new JButton("Modificar");
		btnModificarAdmin.setBounds(134, 210, 97, 25);
		contentPane.add(btnModificarAdmin);
		
		JButton btnEliminarAdmin = new JButton("Eliminar");
		btnEliminarAdmin.setBounds(134, 248, 97, 25);
		contentPane.add(btnEliminarAdmin);
		
		txtBusquedaAdmin = new JTextField();
		txtBusquedaAdmin.setBounds(272, 21, 292, 22);
		contentPane.add(txtBusquedaAdmin);
		txtBusquedaAdmin.setColumns(10);
		
		JLabel lblBusquedaAdmin = new JLabel("Busqueda");
		lblBusquedaAdmin.setBounds(378, 0, 56, 16);
		contentPane.add(lblBusquedaAdmin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 63, 305, 213);
		contentPane.add(scrollPane);
		
		tblBusquedaAdmin = new JTable();
		scrollPane.setViewportView(tblBusquedaAdmin);

	}

}
