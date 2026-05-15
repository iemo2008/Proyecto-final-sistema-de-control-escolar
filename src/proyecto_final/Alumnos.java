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
		setBounds(100, 100, 598, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNombreAlumno = new JTextField();
			txtNombreAlumno.setBounds(10, 10, 191, 19);
			contentPanel.add(txtNombreAlumno);
			txtNombreAlumno.setColumns(10);
		}
		{
			txtApellidoAlumno = new JTextField();
			txtApellidoAlumno.setColumns(10);
			txtApellidoAlumno.setBounds(10, 48, 191, 19);
			contentPanel.add(txtApellidoAlumno);
		}
		{
			txtCorreoAlumno = new JTextField();
			txtCorreoAlumno.setColumns(10);
			txtCorreoAlumno.setBounds(10, 77, 191, 19);
			contentPanel.add(txtCorreoAlumno);
		}
		{
			txtClaveAlumno = new JTextField();
			txtClaveAlumno.setColumns(10);
			txtClaveAlumno.setBounds(10, 117, 191, 19);
			contentPanel.add(txtClaveAlumno);
		}
		{
			txtUsuarioAlumno = new JTextField();
			txtUsuarioAlumno.setColumns(10);
			txtUsuarioAlumno.setBounds(10, 160, 191, 19);
			contentPanel.add(txtUsuarioAlumno);
		}
		{
			JComboBox cmbGradoAlumno = new JComboBox();
			cmbGradoAlumno.setBounds(10, 218, 191, 20);
			contentPanel.add(cmbGradoAlumno);
		}
		{
			txtBuscarAlumno = new JTextField();
			txtBuscarAlumno.setColumns(10);
			txtBuscarAlumno.setBounds(327, 10, 191, 19);
			contentPanel.add(txtBuscarAlumno);
		}
		{
			JButton btnIngresarAlumno = new JButton("New button");
			btnIngresarAlumno.setBounds(23, 260, 84, 63);
			contentPanel.add(btnIngresarAlumno);
		}
		{
			JButton btnModificarAlumno = new JButton("New button");
			btnModificarAlumno.setBounds(117, 260, 84, 63);
			contentPanel.add(btnModificarAlumno);
		}
		{
			JButton btnBuscarAlumno = new JButton("New button");
			btnBuscarAlumno.setBounds(233, 9, 84, 20);
			contentPanel.add(btnBuscarAlumno);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(233, 49, 324, 326);
			contentPanel.add(scrollPane);
			{
				tablaAlumnos = new JTable();
				scrollPane.setViewportView(tablaAlumnos);
			}
		}
		{
			JButton btnVolver = new JButton("New button");
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Alumnos.this.setVisible(false);
					Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
					VentanaSeleccion.setLocationRelativeTo(null);
					VentanaSeleccion.setVisible(true);
				}
			});
			btnVolver.setBounds(23, 333, 84, 63);
			contentPanel.add(btnVolver);
		}
		{
			JButton btnEliminarAlumno = new JButton("New button");
			btnEliminarAlumno.setBounds(117, 333, 84, 63);
			contentPanel.add(btnEliminarAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 0, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 36, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 67, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 106, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 138, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 189, 44, 12);
			contentPanel.add(lblNewLabel);
		}
	}

}
//