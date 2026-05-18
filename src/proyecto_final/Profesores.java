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
import javax.swing.DefaultComboBoxModel;

public class Profesores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel(new BorderLayout());
	private JTextField txtxNombreProfe;
	private JTextField txtApellidosPProfe;
	private JTextField txtCorreoProfe;
	private JTextField txtClaveProfe;
	private JTextField txtBuscarProfe;
	private JTextField txtUsuarioProfe;
	private JTable TablaProfesores;
	private JComboBox<String> cmbGrupoProfe;
	
	
	DefaultTableModel modelo = new DefaultTableModel();
	private JTextField txtApellidoMProfe;
	
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
		setBounds(100, 100, 1024, 626);
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
<<<<<<< HEAD
			txtApellidosProfe = new JTextField();
			txtApellidosProfe.setColumns(10);
			panelFormulario.add(txtApellidosProfe);
=======
			txtApellidosPProfe = new JTextField();
			txtApellidosPProfe.setColumns(10);
			txtApellidosPProfe.setBounds(10, 65, 232, 18);
			contentPanel.add(txtApellidosPProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		}
		
		JLabel lblNewLabel_2 = new JLabel("Correo :");
		panelFormulario.add(lblNewLabel_2);
		{
			txtCorreoProfe = new JTextField();
			txtCorreoProfe.setColumns(10);
<<<<<<< HEAD
			panelFormulario.add(txtCorreoProfe);
=======
			txtCorreoProfe.setBounds(10, 136, 232, 18);
			contentPanel.add(txtCorreoProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		}
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña :");
		panelFormulario.add(lblNewLabel_3);
		{
			txtClaveProfe = new JTextField();
			txtClaveProfe.setColumns(10);
<<<<<<< HEAD
			panelFormulario.add(txtClaveProfe);
=======
			txtClaveProfe.setBounds(10, 171, 232, 18);
			contentPanel.add(txtClaveProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		}
		
<<<<<<< HEAD
		JLabel lblNewLabel_3_1 = new JLabel("Usuario :");
		panelFormulario.add(lblNewLabel_3_1);
		
		txtUsuarioProfe = new JTextField();
		txtUsuarioProfe.setColumns(10);
		panelFormulario.add(txtUsuarioProfe);
		
		JLabel lblNewLabel_4 = new JLabel("Grados");
		panelFormulario.add(lblNewLabel_4);
		
		JComboBox cmbGrupoProfe = new JComboBox();
		panelFormulario.add(cmbGrupoProfe);
=======
		cmbGrupoProfe = new JComboBox<String>(); 
		cmbGrupoProfe.setBounds(10, 256, 232, 20); 
		contentPanel.add(cmbGrupoProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
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
<<<<<<< HEAD
		btnOpccionesMaestro.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnOpccionesMaestro);
=======
		btnOpccionesMaestro.setBounds(10, 287, 232, 57);
		contentPanel.add(btnOpccionesMaestro);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
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
		btnIngresarProfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtxNombreProfe.getText();
		        String apeP = txtApellidosPProfe.getText();
		        String apeM = txtApellidoMProfe.getText();
		        String correo = txtCorreoProfe.getText();
		        String user = txtUsuarioProfe.getText();
		        String pass = txtClaveProfe.getText();

		        if(nom.isEmpty() || user.isEmpty() || pass.isEmpty()) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Llena los campos obligatorios, bro.");
		            return;
		        }

		        try {
		        	
		        	String item = cmbGrupoProfe.getSelectedItem().toString();
		            int idGrado = Integer.parseInt(item.split(" - ")[0]);
		        	
		            java.sql.Connection con = Conexion.conectar();
		            // El 1 al principio es el id_administrador (quien lo registra)
		            String sql = "INSERT INTO profesor (id_administrador, nombre, apellido_paterno, apellido_materno, usuario, contrasena, correo, activo) VALUES (1,?,?,?,?,?,?,1)";
		            java.sql.PreparedStatement pst = con.prepareStatement(sql);
		            pst.setString(1, nom);
		            pst.setString(2, apeP);
		            pst.setString(3, apeM);
		            pst.setString(4, user);
		            pst.setString(5, pass);
		            pst.setString(6, correo);
		            pst.setInt(7, idGrado); // <--- Mandamos el ID seleccionado

		            pst.executeUpdate();
		            javax.swing.JOptionPane.showMessageDialog(null, "¡Profe registrado con éxito!");
		            
		            limpiarCampos();
		            mostrarDatos();
		            con.close();
		        } catch (Exception ex) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Error al insertar: " + ex.getMessage());
		        }
			}
		});
		btnIngresarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/impoticon.png")));
<<<<<<< HEAD
		btnIngresarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnIngresarProfe);
=======
		btnIngresarProfe.setBounds(10, 355, 232, 61);
		contentPanel.add(btnIngresarProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		EstiloBoton btnModificarProfe = new EstiloBoton("Modificar");
		btnModificarProfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/modificateicon.png")));
<<<<<<< HEAD
		btnModificarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnModificarProfe);
=======
		btnModificarProfe.setBounds(10, 427, 232, 61);
		contentPanel.add(btnModificarProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		EstiloBoton btnEliminarProfe = new EstiloBoton("Eliminar");
		btnEliminarProfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = TablaProfesores.getSelectedRow();
		        if (fila == -1) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona a un profesor de la tabla primero.");
		            return;
		        }

		        // Obtenemos el ID (asumiendo que está en la columna 0, aunque no sea visible)
		        String id = TablaProfesores.getValueAt(fila, 0).toString();

		        try {
		            java.sql.Connection con = Conexion.conectar();
		            java.sql.PreparedStatement pst = con.prepareStatement("UPDATE profesor SET activo = 0 WHERE id = ?");
		            pst.setString(1, id);
		            pst.executeUpdate();
		            
		            javax.swing.JOptionPane.showMessageDialog(null, "Profesor dado de baja del sistema.");
		            mostrarDatos();
		            con.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});
		btnEliminarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/eliminateicon.png")));
<<<<<<< HEAD
		btnEliminarProfe.setPreferredSize(new Dimension(120, 65));
		panelFormulario.add(btnEliminarProfe);
=======
		btnEliminarProfe.setBounds(10, 499, 232, 61);
		contentPanel.add(btnEliminarProfe);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		txtBuscarProfe = new JTextField();
		panelBusqueda.add(txtBuscarProfe, BorderLayout.CENTER);
		txtBuscarProfe.setColumns(10);
		
		EstiloBoton btnBuscarProfe = new EstiloBoton("Buscar");
		btnBuscarProfe.setIcon(new ImageIcon(Profesores.class.getResource("/iconos/searchcaticon.png")));
<<<<<<< HEAD
		panelBusqueda.add(btnBuscarProfe, BorderLayout.WEST);
=======
		btnBuscarProfe.setBounds(268, 51, 125, 47);
		contentPanel.add(btnBuscarProfe);
		
		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setBounds(10, 10, 44, 12);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos : ");
		lblNewLabel_1.setBounds(10, 53, 77, 12);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo :");
		lblNewLabel_2.setBounds(10, 121, 44, 12);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña :");
		lblNewLabel_3.setBounds(10, 155, 77, 12);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Grados");
		lblNewLabel_4.setBounds(10, 243, 44, 12);
		contentPanel.add(lblNewLabel_4);
		
		txtUsuarioProfe = new JTextField();
		txtUsuarioProfe.setColumns(10);
		txtUsuarioProfe.setBounds(10, 214, 232, 18);
		contentPanel.add(txtUsuarioProfe);
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuario :");
		lblNewLabel_3_1.setBounds(10, 200, 77, 12);
		contentPanel.add(lblNewLabel_3_1);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		JScrollPane scrollPane = new JScrollPane();
<<<<<<< HEAD
		panelDerecho.add(scrollPane);
=======
		scrollPane.setBounds(268, 119, 700, 441);
		contentPanel.add(scrollPane);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		modelo.addColumn("ID");          
		modelo.addColumn("Nombre");      
		modelo.addColumn("Ap. Paterno"); 
		modelo.addColumn("Ap. Materno"); 
		modelo.addColumn("Correo");      
		modelo.addColumn("Usuario");
		
		mostrarDatos();
		llenarComboGrados();
		
		TablaProfesores = new JTable(modelo);
		
		
		scrollPane.setViewportView(TablaProfesores);
		
		txtApellidoMProfe = new JTextField();
		txtApellidoMProfe.setColumns(10);
		txtApellidoMProfe.setBounds(10, 94, 232, 18);
		contentPanel.add(txtApellidoMProfe);
	}
	
	public void mostrarDatos() {
		modelo.setRowCount(0); // Limpia la tabla
	    try {
	        java.sql.Connection con = Conexion.conectar();
	        // Traemos las columnas exactas
	        String sql = "SELECT id, nombre, apellido_paterno, apellido_materno, correo, usuario FROM profesor WHERE activo = 1";
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery(sql);

	        Object[] fila = new Object[6]; // 6 columnas ahora
	        while (rs.next()) {
	            fila[0] = rs.getInt("id");
	            fila[1] = rs.getString("nombre");
	            fila[2] = rs.getString("apellido_paterno");
	            fila[3] = rs.getString("apellido_materno");
	            fila[4] = rs.getString("correo");
	            fila[5] = rs.getString("usuario");
	            modelo.addRow(fila);
	        }
	        con.close();
	    } catch (Exception e) {
	        javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar tabla: " + e.getMessage());
	    }
	}
	private void limpiarCampos() {
	    txtxNombreProfe.setText("");
	    txtApellidosPProfe.setText("");
	    txtApellidoMProfe.setText("");
	    txtCorreoProfe.setText("");
	    txtUsuarioProfe.setText("");
	    txtClaveProfe.setText("");
	}
	public void llenarComboGrados() {
	    cmbGrupoProfe.removeAllItems();
	    try {
	        java.sql.Connection con = Conexion.conectar();
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery("SELECT grado, grupo FROM grado WHERE activo = 1");
	        
	        while (rs.next()) {
	            cmbGrupoProfe.addItem(rs.getInt("grado") + "º" + rs.getString("grupo"));
	        }
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
//