import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Alumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreAlu;
	private JTextField txtApellidoAlu;
	private JTextField txtCorreoAlu;
	private JTextField txtClaveAlu;
	private JTextField txtGrupoAlu;
	private JTextField textField;
	private JTable tblAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumno frame = new Alumno();
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
	public Alumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_NombreAlu = new JLabel("Nombre");
		lbl_NombreAlu.setBounds(12, 35, 69, 16);
		contentPane.add(lbl_NombreAlu);
		
		JLabel lbl_ApellidosAlu = new JLabel("Apellidos");
		lbl_ApellidosAlu.setBounds(12, 64, 51, 16);
		contentPane.add(lbl_ApellidosAlu);
		
		JLabel lblCorreoAlu = new JLabel("Correo");
		lblCorreoAlu.setBounds(12, 93, 39, 16);
		contentPane.add(lblCorreoAlu);
		
		JLabel lblClaveAlu = new JLabel("Clave");
		lblClaveAlu.setBounds(12, 122, 56, 16);
		contentPane.add(lblClaveAlu);
		
		JLabel lblGrupoAlu = new JLabel("Grupo");
		lblGrupoAlu.setBounds(12, 154, 56, 16);
		contentPane.add(lblGrupoAlu);
		
		txtNombreAlu = new JTextField();
		txtNombreAlu.setBounds(87, 32, 116, 22);
		contentPane.add(txtNombreAlu);
		txtNombreAlu.setColumns(10);
		
		txtApellidoAlu = new JTextField();
		txtApellidoAlu.setBounds(87, 61, 116, 22);
		contentPane.add(txtApellidoAlu);
		txtApellidoAlu.setColumns(10);
		
		txtCorreoAlu = new JTextField();
		txtCorreoAlu.setBounds(87, 90, 116, 22);
		contentPane.add(txtCorreoAlu);
		txtCorreoAlu.setColumns(10);
		
		txtClaveAlu = new JTextField();
		txtClaveAlu.setBounds(87, 122, 116, 22);
		contentPane.add(txtClaveAlu);
		txtClaveAlu.setColumns(10);
		
		txtGrupoAlu = new JTextField();
		txtGrupoAlu.setBounds(87, 151, 116, 22);
		contentPane.add(txtGrupoAlu);
		txtGrupoAlu.setColumns(10);
		
		JButton btnNuevoAlu = new JButton("Nuevo alumno");
		btnNuevoAlu.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNuevoAlu.setBounds(12, 183, 82, 75);
		contentPane.add(btnNuevoAlu);
		
		JButton btnModificarAlu = new JButton("Modificar");
		btnModificarAlu.setBounds(106, 195, 97, 25);
		contentPane.add(btnModificarAlu);
		
		JButton btnEliminarAlu = new JButton("Eliminar");
		btnEliminarAlu.setBounds(106, 233, 97, 25);
		contentPane.add(btnEliminarAlu);
		
		JButton btnVolver = new JButton("Volver...");
		btnVolver.setBounds(0, 271, 97, 16);
		contentPane.add(btnVolver);
		
		textField = new JTextField();
		textField.setBounds(281, 32, 290, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBusquedaAlu = new JLabel("Busqueda");
		lblBusquedaAlu.setBounds(394, 0, 69, 16);
		contentPane.add(lblBusquedaAlu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 64, 290, 224);
		contentPane.add(scrollPane);
		
		tblAlumnos = new JTable();
		scrollPane.setColumnHeaderView(tblAlumnos);

	}
}
