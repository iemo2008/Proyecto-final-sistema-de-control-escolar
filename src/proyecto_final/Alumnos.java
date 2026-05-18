package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
	private JTextField txtApellidoPAlumno;
	private JTextField txtCorreoAlumno;
	private JTextField txtClaveAlumno;
	private JTextField txtUsuarioAlumno;
	private JTextField txtBuscarAlumno;
	private JTable tablaAlumnos;
	private JTextField txtApellidoMAlumno;
	private JComboBox<String> cmbGradoAlumno; 
	private DefaultTableModel modeloAlumnos;
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
			txtApellidoPAlumno = new JTextField();
			txtApellidoPAlumno.setColumns(10);
			txtApellidoPAlumno.setBounds(10, 73, 220, 19);
			contentPanel.add(txtApellidoPAlumno);
		}
		{
			txtCorreoAlumno = new JTextField();
			txtCorreoAlumno.setColumns(10);
			txtCorreoAlumno.setBounds(10, 153, 220, 19);
			contentPanel.add(txtCorreoAlumno);
		}
		{
			txtClaveAlumno = new JTextField();
			txtClaveAlumno.setColumns(10);
			txtClaveAlumno.setBounds(10, 238, 220, 19);
			contentPanel.add(txtClaveAlumno);
		}
		{
			txtUsuarioAlumno = new JTextField();
			txtUsuarioAlumno.setColumns(10);
			txtUsuarioAlumno.setBounds(10, 196, 220, 19);
			contentPanel.add(txtUsuarioAlumno);
		}
		{
			cmbGradoAlumno = new JComboBox<String>();
			cmbGradoAlumno.setBounds(10, 272, 220, 20);
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
			btnIngresarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (cmbGradoAlumno.getSelectedItem() == null) return;

				    String item = cmbGradoAlumno.getSelectedItem().toString();
				    int idGrado = Integer.parseInt(item.split(" - ")[0]);

				    try {
				        java.sql.Connection con = Conexion.conectar();
				        String sql = "INSERT INTO alumno (id_grado, nombre, apellido_paterno, apellido_materno, correo, usuario, contrasena, activo) VALUES (?,?,?,?,?,?,?,1)";
				        java.sql.PreparedStatement pst = con.prepareStatement(sql);
				        pst.setInt(1, idGrado);
				        pst.setString(2, txtNombreAlumno.getText());
				        pst.setString(3, txtApellidoPAlumno.getText());
				        pst.setString(4, txtApellidoMAlumno.getText());
				        pst.setString(5, txtCorreoAlumno.getText());
				        pst.setString(6, txtUsuarioAlumno.getText());
				        pst.setString(7, txtClaveAlumno.getText());

				        pst.executeUpdate();
				        javax.swing.JOptionPane.showMessageDialog(null, "¡Alumno registrado!");
				        
				        mostrarDatos(); 
				        
				        txtNombreAlumno.setText("");
				        txtApellidoPAlumno.setText("");
				        txtApellidoMAlumno.setText("");
				        txtCorreoAlumno.setText("");
				        txtUsuarioAlumno.setText("");
				        txtClaveAlumno.setText("");
				        con.close();
				    } catch (Exception ex) { 
				        ex.printStackTrace();
				        javax.swing.JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
				    }
				}
			});
			btnIngresarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/impoticon.png")));
			btnIngresarAlumno.setBounds(10, 366, 220, 52);
			contentPanel.add(btnIngresarAlumno);
		}
		{
			EstiloBoton btnModificarAlumno = new EstiloBoton("Modificar");
			btnModificarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/modificateicon.png")));
			btnModificarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnModificarAlumno.setBounds(10, 429, 220, 52);
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
			scrollPane.setBounds(240, 122, 817, 421);
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
			btnEliminarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int fila = tablaAlumnos.getSelectedRow();
			        if (fila == -1) {
			            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona a un alumno de la tabla primero, broski.");
			            return;
			        }

			        String id = tablaAlumnos.getValueAt(fila, 0).toString();

			        int confirmar = javax.swing.JOptionPane.showConfirmDialog(null, "¿Seguro que quieres dar de baja a este alumno?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
			        
			        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
			            try {
			                java.sql.Connection con = Conexion.conectar();
			                String sql = "UPDATE alumno SET activo = 0 WHERE id = ?";
			                java.sql.PreparedStatement pst = con.prepareStatement(sql);
			                pst.setString(1, id);

			                pst.executeUpdate();
			                javax.swing.JOptionPane.showMessageDialog(null, "Alumno dado de baja correctamente.");
			                
			                mostrarDatos();
			                con.close();
			            } catch (Exception ex) {
			                javax.swing.JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
			            }
			        }
				}
			});
			btnEliminarAlumno.setIcon(new ImageIcon(Alumnos.class.getResource("/iconos/eliminateicon.png")));
			btnEliminarAlumno.setBounds(10, 492, 220, 51);
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
			lblNewLabel.setBounds(10, 140, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Usuario");
			lblNewLabel.setBounds(10, 183, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Clave");
			lblNewLabel.setBounds(10, 226, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Grupo");
			lblNewLabel.setBounds(10, 258, 44, 12);
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
		btnCalificacionesAlumno.setBounds(10, 303, 220, 52);
		contentPanel.add(btnCalificacionesAlumno);
		{
			txtApellidoMAlumno = new JTextField();
			txtApellidoMAlumno.setColumns(10);
			txtApellidoMAlumno.setBounds(10, 103, 220, 19);
			contentPanel.add(txtApellidoMAlumno);
		}
		
		modeloAlumnos = new DefaultTableModel();
		modeloAlumnos.addColumn("ID");
		modeloAlumnos.addColumn("Nombre");
		modeloAlumnos.addColumn("Ap. Paterno");
		modeloAlumnos.addColumn("Ap. Materno");
		modeloAlumnos.addColumn("Correo");
		modeloAlumnos.addColumn("Usuario");
		modeloAlumnos.addColumn("Grado");

		tablaAlumnos.setModel(modeloAlumnos);
		
		llenarComboGrados();
		mostrarDatos();
	}
	
	public void llenarComboGrados() {
		cmbGradoAlumno.removeAllItems(); 
	    try {
	        java.sql.Connection con = Conexion.conectar();
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery("SELECT id, grado, grupo FROM grado WHERE activo = 1");
	        
	        while (rs.next()) {
	            cmbGradoAlumno.addItem(rs.getInt("id") + " - " + rs.getInt("grado") + "º" + rs.getString("grupo"));
	        }
	        con.close();
	    } catch (Exception e) {
	        System.out.println("Error al llenar combo grados: " + e.getMessage());
	    }
	}
	
	public void mostrarDatos() {
		modeloAlumnos.setRowCount(0);
	    try {
	        java.sql.Connection con = Conexion.conectar();
	        String sql = "SELECT a.id, a.nombre, a.apellido_paterno, a.apellido_materno, a.correo, a.usuario, g.grado, g.grupo " +
	                     "FROM alumno a " +
	                     "INNER JOIN grado g ON a.id_grado = g.id " +
	                     "WHERE a.activo = 1";
	        
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery(sql);

	        Object[] fila = new Object[7]; 
	        while (rs.next()) {
	            fila[0] = rs.getInt("id");
	            fila[1] = rs.getString("nombre");
	            fila[2] = rs.getString("apellido_paterno");
	            fila[3] = rs.getString("apellido_materno");
	            fila[4] = rs.getString("correo");
	            fila[5] = rs.getString("usuario");
	            fila[6] = rs.getString("grado") + "º" + rs.getString("grupo");
	            modeloAlumnos.addRow(fila);
	        }
	        con.close();
	    } catch (Exception e) {
	        System.out.println("Error al mostrar alumnos: " + e.getMessage());
	    }
	}
	
}
//