package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import javax.swing.ImageIcon;

public class Alumnos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreAlumno;
	private JTextField txtApellidoAlumno;
	private JTextField txtCorreoAlumno;
	private JTextField txtClaveAlumno;
	private JTextField txtUsuarioAlumno;
	private JTextField txtBuscarAlumno;
	private JTable tablaAlumnos;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Alumnos dialog = new Alumnos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alumnos() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Alumnos");
		setBounds(100, 100, 1098, 611);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNombreAlumno = new JTextField();
			txtNombreAlumno.setBounds(10, 30, 220, 19);
			contentPanel.add(txtNombreAlumno);
			txtNombreAlumno.setColumns(10);
		}
		{
			txtApellidoAlumno = new JTextField();
			txtApellidoAlumno.setColumns(10);
			txtApellidoAlumno.setBounds(10, 73, 220, 19);
			contentPanel.add(txtApellidoAlumno);
		}
		{
			txtCorreoAlumno = new JTextField();
			txtCorreoAlumno.setColumns(10);
			txtCorreoAlumno.setBounds(10, 114, 220, 19);
			contentPanel.add(txtCorreoAlumno);
		}
		{
			txtClaveAlumno = new JTextField();
			txtClaveAlumno.setColumns(10);
			txtClaveAlumno.setBounds(10, 197, 220, 19);
			contentPanel.add(txtClaveAlumno);
		}
		{
			txtUsuarioAlumno = new JTextField();
			txtUsuarioAlumno.setColumns(10);
			txtUsuarioAlumno.setBounds(10, 156, 220, 19);
			contentPanel.add(txtUsuarioAlumno);
		}
		{
			JComboBox cmbGradoAlumno = new JComboBox();
			cmbGradoAlumno.setBounds(10, 241, 220, 20);
			contentPanel.add(cmbGradoAlumno);
		}
		{
			txtBuscarAlumno = new JTextField();
			txtBuscarAlumno.setColumns(10);
			txtBuscarAlumno.setBounds(384, 72, 673, 37);
			contentPanel.add(txtBuscarAlumno);
		}
		{
			EstiloBoton btnIngresarAlumno = new EstiloBoton("Ingresar");
			btnIngresarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/impoticon.png")));
			btnIngresarAlumno.setBounds(10, 389, 220, 52);
			contentPanel.add(btnIngresarAlumno);
		}
		{
			EstiloBoton btnModificarAlumno = new EstiloBoton("Modificar");
			btnModificarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/modificateicon.png")));
			btnModificarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnModificarAlumno.setBounds(10, 451, 220, 52);
			contentPanel.add(btnModificarAlumno);
		}
		{
			EstiloBoton btnBuscarAlumno = new EstiloBoton("Buscar");
			btnBuscarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarAlumno.setBounds(240, 64, 133, 52);
			contentPanel.add(btnBuscarAlumno);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(240, 122, 817, 390);
			contentPanel.add(scrollPane);
			{
				tablaAlumnos = new JTable();
				scrollPane.setViewportView(tablaAlumnos);
			}
		}
		{
			EstiloBoton btnVolver = new EstiloBoton("Volver");
			btnVolver.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/restarticon.png")));
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Alumnos.this.setVisible(false);
					Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
					VentanaSeleccion.setLocationRelativeTo(null);
					VentanaSeleccion.setVisible(true);
				}
			});
			btnVolver.setBounds(922, 8, 135, 52);
			contentPanel.add(btnVolver);
		}
		{
			EstiloBoton btnEliminarAlumno = new EstiloBoton("Eliminar");
			btnEliminarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/eliminateicon.png")));
			btnEliminarAlumno.setBounds(10, 513, 220, 51);
			contentPanel.add(btnEliminarAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(10, 13, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Apellidos");
			lblNewLabel.setBounds(10, 61, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Correo");
			lblNewLabel.setBounds(10, 100, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Usuario");
			lblNewLabel.setBounds(10, 143, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Clave");
			lblNewLabel.setBounds(10, 185, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Grupo");
			lblNewLabel.setBounds(10, 226, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		
		EstiloBoton btnCalificacionesAlumno = new EstiloBoton("Revisar Calificaciones");
		btnCalificacionesAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumnos.this.setVisible(false);
				Consulta_Calificaciones calificaciones = new Consulta_Calificaciones();
				calificaciones.setLocationRelativeTo(null);
				calificaciones.setVisible(true);
			}
		});
		btnCalificacionesAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/iconstudent.png")));
		btnCalificacionesAlumno.setBounds(10, 327, 220, 52);
		contentPanel.add(btnCalificacionesAlumno);
		{
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(10, 283, 220, 19);
			contentPanel.add(textField);
		}
		
	}
}
//