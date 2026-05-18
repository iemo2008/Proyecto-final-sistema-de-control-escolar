package proyecto_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
	private final JPanel contentPanel = new JPanel(new BorderLayout());
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
		setLocationRelativeTo(null);

		contentPanel.setPreferredSize(new Dimension(490, 330));
		
		JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		contentPanel.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelContenido = new JPanel(new GridLayout(1, 2, 20, 0)); 
		contentPanel.add(panelContenido, BorderLayout.CENTER);
		
		JPanel panelFormulario = new JPanel(new GridLayout(10, 4, 5, 15));
		panelContenido.add(panelFormulario);
		
		JPanel panelDerecho = new JPanel(new BorderLayout(0, 10));
		panelContenido.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new BorderLayout(5, 0));
		panelBusqueda.setBorder(new EmptyBorder(15, 0, 15, 0));
		panelDerecho.add(panelBusqueda, BorderLayout.NORTH);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPanel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Nombre :");
		panelFormulario.add(lblNewLabel);
		
		
		
		{
			txtxNombreProfe = new JTextField();
			panelFormulario.add(txtxNombreProfe);
			txtxNombreProfe.setColumns(10);
		}
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos : ");
		panelFormulario.add(lblNewLabel_1);
		{
			txtApellidosProfe = new JTextField();
			txtApellidosProfe.setColumns(10);
			panelFormulario.add(txtApellidosProfe);
		}
		
		JLabel lblNewLabel_2 = new JLabel("Correo :");
		panelFormulario.add(lblNewLabel_2);
		{
			txtCorreoProfe = new JTextField();
			txtCorreoProfe.setColumns(10);
			panelFormulario.add(txtCorreoProfe);
		}
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña :");
		panelFormulario.add(lblNewLabel_3);
		{
			txtClaveProfe = new JTextField();
			txtClaveProfe.setColumns(10);
			panelFormulario.add(txtClaveProfe);
		}
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuario :");
		panelFormulario.add(lblNewLabel_3_1);
		
		txtUsuarioProfe = new JTextField();
		txtUsuarioProfe.setColumns(10);
		panelFormulario.add(txtUsuarioProfe);
		
		JLabel lblNewLabel_4 = new JLabel("Grados");
		panelFormulario.add(lblNewLabel_4);
		
		JComboBox cmbGrupoProfe = new JComboBox();
		panelFormulario.add(cmbGrupoProfe);
		
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
		btnOpccionesMaestro.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnOpccionesMaestro);
		
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
		btnVolver.setPreferredSize(new Dimension(120, 40));
		panelSuperior.add(btnVolver);
		
		EstiloBoton btnIngresarProfe = new EstiloBoton("Ingresar");
		btnIngresarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/impoticon.png")));
		btnIngresarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnIngresarProfe);
		
		EstiloBoton btnModificarProfe = new EstiloBoton("Modificar");
		btnModificarProfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/modificateicon.png")));
		btnModificarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnModificarProfe);
		
		EstiloBoton btnEliminarProfe = new EstiloBoton("Eliminar");
		btnEliminarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/eliminateicon.png")));
		btnEliminarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnEliminarProfe);
		
		txtBuscarProfe = new JTextField();
		panelBusqueda.add(txtBuscarProfe, BorderLayout.CENTER);
		txtBuscarProfe.setColumns(10);
		
		EstiloBoton btnBuscarProfe = new EstiloBoton("Buscar");
		btnBuscarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/searchcaticon.png")));
		panelBusqueda.add(btnBuscarProfe, BorderLayout.WEST);
		
		JScrollPane scrollPane = new JScrollPane();
		panelDerecho.add(scrollPane);
		
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