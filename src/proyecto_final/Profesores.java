package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import javax.swing.ImageIcon;

public class Profesores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtxNombreProfe;
	private JTextField txtApellidosProfe;
	private JTextField txtCorreoProfe;
	private JTextField txtClaveProfe;
	private JTextField txtBuscarProfe;
	private JTextField txtUsuarioProfe;
	private JTable TablaProfesores;

	
	
	DefaultTableModel modelo = new DefaultTableModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Profesores dialog = new Profesores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Profesores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Profesores");
		setBounds(100, 100, 1024, 576);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtxNombreProfe = new JTextField();
			txtxNombreProfe.setBounds(10, 25, 232, 18);
			contentPanel.add(txtxNombreProfe);
			txtxNombreProfe.setColumns(10);
		}
		{
			txtApellidosProfe = new JTextField();
			txtApellidosProfe.setColumns(10);
			txtApellidosProfe.setBounds(10, 65, 232, 18);
			contentPanel.add(txtApellidosProfe);
		}
		{
			txtCorreoProfe = new JTextField();
			txtCorreoProfe.setColumns(10);
			txtCorreoProfe.setBounds(10, 104, 232, 18);
			contentPanel.add(txtCorreoProfe);
		}
		{
			txtClaveProfe = new JTextField();
			txtClaveProfe.setColumns(10);
			txtClaveProfe.setBounds(10, 143, 232, 18);
			contentPanel.add(txtClaveProfe);
		}
		
		JComboBox cmbGrupoProfe = new JComboBox();
		cmbGrupoProfe.setBounds(10, 213, 96, 20);
		contentPanel.add(cmbGrupoProfe);
		
		EstiloBoton btnOpccionesMaestro = new EstiloBoton("Opcciones del Profesor");
		btnOpccionesMaestro.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/iconteacher.png")));
		btnOpccionesMaestro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Grados_y_materias pagina_profesor = new Grados_y_materias();
				pagina_profesor.setLocationRelativeTo(null);
				pagina_profesor.setVisible(true);
				Profesores.this.setVisible(false);
			}
		});
		btnOpccionesMaestro.setBounds(10, 243, 232, 57);
		contentPanel.add(btnOpccionesMaestro);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/restarticon.png")));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profesores.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
			}
		});
		btnVolver.setBounds(833, 4, 135, 47);
		contentPanel.add(btnVolver);
		
		EstiloBoton btnIngresarProfe = new EstiloBoton("Ingresar");
		btnIngresarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/impoticon.png")));
		btnIngresarProfe.setBounds(10, 310, 232, 61);
		contentPanel.add(btnIngresarProfe);
		
		EstiloBoton btnModificarProfe = new EstiloBoton("Modificar");
		btnModificarProfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/modificateicon.png")));
		btnModificarProfe.setBounds(10, 381, 232, 61);
		contentPanel.add(btnModificarProfe);
		
		EstiloBoton btnEliminarProfe = new EstiloBoton("Eliminar");
		btnEliminarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/eliminateicon.png")));
		btnEliminarProfe.setBounds(10, 456, 232, 61);
		contentPanel.add(btnEliminarProfe);
		
		txtBuscarProfe = new JTextField();
		txtBuscarProfe.setBounds(417, 62, 554, 36);
		contentPanel.add(txtBuscarProfe);
		txtBuscarProfe.setColumns(10);
		
		EstiloBoton btnBuscarProfe = new EstiloBoton("Buscar");
		btnBuscarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/searchcaticon.png")));
		btnBuscarProfe.setBounds(268, 51, 125, 47);
		contentPanel.add(btnBuscarProfe);
		
		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setBounds(10, 10, 44, 12);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos : ");
		lblNewLabel_1.setBounds(10, 53, 77, 12);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo :");
		lblNewLabel_2.setBounds(10, 93, 44, 12);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña :");
		lblNewLabel_3.setBounds(10, 132, 77, 12);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Grados");
		lblNewLabel_4.setBounds(10, 202, 44, 12);
		contentPanel.add(lblNewLabel_4);
		
		txtUsuarioProfe = new JTextField();
		txtUsuarioProfe.setColumns(10);
		txtUsuarioProfe.setBounds(10, 185, 232, 18);
		contentPanel.add(txtUsuarioProfe);
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuario :");
		lblNewLabel_3_1.setBounds(10, 171, 77, 12);
		contentPanel.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(268, 119, 700, 373);
		contentPanel.add(scrollPane);
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Correo");
		modelo.addColumn("Usuario");
		modelo.addColumn("contraaseña");
		modelo.addColumn("Materia");
		
		TablaProfesores = new JTable(modelo);

		
		scrollPane.setViewportView(TablaProfesores);
	}
}
//