import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Maestro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreMae;
	private JTextField txtApellidoMae;
	private JTextField txtCorreoMae;
	private JTextField txtClaveMae;
	private JTextField txtGrupoMae;
	private JTextField textField;
	private JTable tblProf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maestro frame = new Maestro();
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
	public Maestro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreMae = new JLabel("Nombre");
		lblNombreMae.setBounds(12, 23, 56, 16);
		contentPane.add(lblNombreMae);
		
		JLabel lblNewLabel = new JLabel("Apellidos");
		lblNewLabel.setBounds(12, 52, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo");
		lblNewLabel_1.setBounds(12, 81, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Clave");
		lblNewLabel_2.setBounds(12, 116, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Grupo");
		lblNewLabel_3.setBounds(12, 145, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		txtNombreMae = new JTextField();
		txtNombreMae.setBounds(82, 20, 116, 22);
		contentPane.add(txtNombreMae);
		txtNombreMae.setColumns(10);
		
		txtApellidoMae = new JTextField();
		txtApellidoMae.setBounds(80, 49, 116, 22);
		contentPane.add(txtApellidoMae);
		txtApellidoMae.setColumns(10);
		
		txtCorreoMae = new JTextField();
		txtCorreoMae.setBounds(80, 78, 116, 22);
		contentPane.add(txtCorreoMae);
		txtCorreoMae.setColumns(10);
		
		txtClaveMae = new JTextField();
		txtClaveMae.setBounds(80, 113, 116, 22);
		contentPane.add(txtClaveMae);
		txtClaveMae.setColumns(10);
		
		txtGrupoMae = new JTextField();
		txtGrupoMae.setBounds(80, 142, 116, 22);
		contentPane.add(txtGrupoMae);
		txtGrupoMae.setColumns(10);
		
		JButton btnOpcionesProf = new JButton("Opciones");
		btnOpcionesProf.setBounds(12, 174, 97, 66);
		contentPane.add(btnOpcionesProf);
		
		JButton btnVolverProf = new JButton("Volver...");
		btnVolverProf.setBounds(12, 267, 97, 16);
		contentPane.add(btnVolverProf);
		
		JButton btnNuevoProf = new JButton("Nuevo profesor");
		btnNuevoProf.setBounds(121, 177, 110, 25);
		contentPane.add(btnNuevoProf);
		
		JButton btnModificarProf = new JButton("Modificar");
		btnModificarProf.setBounds(119, 215, 112, 25);
		contentPane.add(btnModificarProf);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(121, 253, 110, 25);
		contentPane.add(btnEliminar);
		
		textField = new JTextField();
		textField.setBounds(265, 20, 296, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBusquedaProf = new JLabel("Busqueda");
		lblBusquedaProf.setBounds(376, 0, 56, 16);
		contentPane.add(lblBusquedaProf);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 52, 309, 231);
		contentPane.add(scrollPane);
		
		tblProf = new JTable();
		scrollPane.setViewportView(tblProf);

	}

}
