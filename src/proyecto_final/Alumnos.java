package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
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
	private final JPanel contentPanel = new JPanel(new BorderLayout());
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
			dialog.setLocationRelativeTo(null);
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
		setBounds(100, 100, 1098, 586);
		
		
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));		
		contentPanel.setPreferredSize(new Dimension(1100,1080));

		JPanel pnl_sup = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		contentPanel.add(pnl_sup, BorderLayout.NORTH);

		JPanel pnl_opc = new JPanel(new GridLayout(1, 2, 20, 0));
		contentPanel.add(pnl_opc, BorderLayout.CENTER);

		JPanel pnl_izquierdo = new JPanel(new GridLayout(16, 1, 5, 10));
		pnl_opc.add(pnl_izquierdo);
	
		JPanel panelDerecho = new JPanel(new BorderLayout(0, 10));
		pnl_opc.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new BorderLayout(5, 0));
		panelDerecho.add(panelBusqueda, BorderLayout.NORTH);

		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPanel);
		getContentPane().add(scroll, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			pnl_izquierdo.add(lblNewLabel);
		}

		{
			txtNombreAlumno = new JTextField();
			pnl_izquierdo.add(txtNombreAlumno);
			txtNombreAlumno.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Apellidos");
			pnl_izquierdo.add(lblNewLabel);
		}
		{
			txtApellidoAlumno = new JTextField();
			txtApellidoAlumno.setColumns(10);
			pnl_izquierdo.add(txtApellidoAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("Correo");
			pnl_izquierdo.add(lblNewLabel);
		}
		{
			txtCorreoAlumno = new JTextField();
			txtCorreoAlumno.setColumns(10);
			pnl_izquierdo.add(txtCorreoAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("Clave");
			pnl_izquierdo.add(lblNewLabel);
		}
		{
			txtClaveAlumno = new JTextField();
			txtClaveAlumno.setColumns(10);
			pnl_izquierdo.add(txtClaveAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("Usuario");
			pnl_izquierdo.add(lblNewLabel);
		}
		{
			txtUsuarioAlumno = new JTextField();
			txtUsuarioAlumno.setColumns(10);
			pnl_izquierdo.add(txtUsuarioAlumno);
		}
		{
			JLabel lblNewLabel = new JLabel("Grupo");
			pnl_izquierdo.add(lblNewLabel);
		}
		{
			JComboBox cmbGradoAlumno = new JComboBox();
			pnl_izquierdo.add(cmbGradoAlumno);
		}
		{
			txtBuscarAlumno = new JTextField();
			txtBuscarAlumno.setColumns(10);
			panelBusqueda.add(txtBuscarAlumno, BorderLayout.CENTER);
		}
		{
			EstiloBoton btnIngresarAlumno = new EstiloBoton("Ingresar");
			btnIngresarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/impoticon.png")));
			pnl_izquierdo.add(btnIngresarAlumno);
		}
		{
			EstiloBoton btnModificarAlumno = new EstiloBoton("Modificar");
			btnModificarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/modificateicon.png")));
			btnModificarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			pnl_izquierdo.add(btnModificarAlumno);
		}
		{
			EstiloBoton btnBuscarAlumno = new EstiloBoton("Buscar");
			btnBuscarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/searchcaticon.png")));
			panelBusqueda.add(btnBuscarAlumno, BorderLayout.WEST);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			panelDerecho.add(scrollPane, BorderLayout.CENTER);
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
			btnVolver.setPreferredSize(new Dimension(140,45));
			pnl_sup.add(btnVolver);
		}
		{
			EstiloBoton btnEliminarAlumno = new EstiloBoton("Eliminar");
			btnEliminarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/eliminateicon.png")));
			pnl_izquierdo.add(btnEliminarAlumno);
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
		pnl_izquierdo.add(btnCalificacionesAlumno);
	}
}
