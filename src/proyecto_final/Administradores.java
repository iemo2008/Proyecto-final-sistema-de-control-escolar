package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;

public class Administradores extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtxNombreAdmin;
	private JTextField txtApellidoPAdmin;
	private JTextField txtCorreoAdmin;
	private JTextField txtClaveAdmin;
	private JTextField txtUsuarioAdmin;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtxBuscarAdmin;
	private JButton btnBuscarAdmin;
	private JTable tablaAdmin;
	private DefaultTableModel modelo;
	private JTextField txtApellidoMAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Administradores dialog = new Administradores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Administradores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Administradores");
		setBounds(100, 100, 880, 556);
		getContentPane().setLayout(null);
		{
			txtxNombreAdmin = new JTextField();
			txtxNombreAdmin.setBounds(10, 32, 228, 18);
			getContentPane().add(txtxNombreAdmin);
			txtxNombreAdmin.setColumns(10);
		}
		{
			txtApellidoPAdmin = new JTextField();
			txtApellidoPAdmin.setColumns(10);
			txtApellidoPAdmin.setBounds(10, 77, 228, 18);
			getContentPane().add(txtApellidoPAdmin);
		}
		{
			txtApellidoMAdmin = new JTextField();
			txtApellidoMAdmin.setColumns(10);
			txtApellidoMAdmin.setBounds(10, 106, 228, 18);
			getContentPane().add(txtApellidoMAdmin);
		}
		{
			txtCorreoAdmin = new JTextField();
			txtCorreoAdmin.setColumns(10);
			txtCorreoAdmin.setBounds(10, 147, 228, 18);
			getContentPane().add(txtCorreoAdmin);
		}
		{
			txtClaveAdmin = new JTextField();
			txtClaveAdmin.setColumns(10);
			txtClaveAdmin.setBounds(10, 192, 228, 18);
			getContentPane().add(txtClaveAdmin);
		}
		{
			txtUsuarioAdmin = new JTextField();
			txtUsuarioAdmin.setColumns(10);
			txtUsuarioAdmin.setBounds(10, 235, 228, 18);
			getContentPane().add(txtUsuarioAdmin);
		}
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 10, 44, 12);
		getContentPane().add(lblNewLabel);
		{
			lblNewLabel_1 = new JLabel("Correo");
			lblNewLabel_1.setBounds(10, 129, 44, 12);
			getContentPane().add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Clave");
			lblNewLabel_2.setBounds(10, 176, 44, 12);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Usuario");
			lblNewLabel_3.setBounds(10, 221, 44, 12);
			getContentPane().add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Apellidos");
			lblNewLabel_4.setBounds(10, 55, 59, 12);
			getContentPane().add(lblNewLabel_4);
		}
		
		EstiloBoton btnIngresarAdmin = new EstiloBoton("Ingresar");
		btnIngresarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtxNombreAdmin.getText();
		        String apeP = txtApellidoPAdmin.getText();
		        String apeM = txtApellidoMAdmin.getText();
		        String correo = txtCorreoAdmin.getText();
		        String clave = txtClaveAdmin.getText();
		        String user = txtUsuarioAdmin.getText();

		        if (nom.isEmpty() || user.isEmpty() || clave.isEmpty()) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Nombre, Usuario y Clave son obligatorios.");
		            return;
		        }

		        try {
		            java.sql.Connection con = Conexion.conectar();
		            String sql = "INSERT INTO administrador (nombre, apellido_paterno, apellido_materno, usuario, contrasena, correo, activo) VALUES (?,?,?,?,?,?,1)";
		            java.sql.PreparedStatement pst = con.prepareStatement(sql);
		            
		            pst.setString(1, nom);
		            pst.setString(2, apeP);
		            pst.setString(3, apeM);
		            pst.setString(4, user);
		            pst.setString(5, clave);
		            pst.setString(6, correo);

		            pst.executeUpdate();
		            javax.swing.JOptionPane.showMessageDialog(null, "Administrador registrado con éxito");
		            limpiarCampos();
		            mostrarDatos();
		            con.close();
		        } catch (Exception ex) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage());
		        }
			}
		});
		btnIngresarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/impoticon.png")));
		btnIngresarAdmin.setBounds(10, 274, 228, 54);
		getContentPane().add(btnIngresarAdmin);
		
		EstiloBoton btnModificarAdmin = new EstiloBoton("Modificar");
		btnModificarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/modificateicon.png")));
		btnModificarAdmin.setBounds(10, 420, 228, 54);
		getContentPane().add(btnModificarAdmin);
		
		EstiloBoton btnEliminarAdmin = new EstiloBoton("Eliminar");
		btnEliminarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = tablaAdmin.getSelectedRow();
		        if (fila == -1) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona un administrador de la tabla");
		            return;
		        }

		        String id = tablaAdmin.getValueAt(fila, 0).toString();

		        try {
		            java.sql.Connection con = Conexion.conectar();
		            String sql = "UPDATE administrador SET activo = 0 WHERE id = ?";
		            java.sql.PreparedStatement pst = con.prepareStatement(sql);
		            pst.setString(1, id);

		            pst.executeUpdate();
		            javax.swing.JOptionPane.showMessageDialog(null, "Usuario desactivado correctamente");
		            mostrarDatos();
		            con.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});
		btnEliminarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/eliminateicon.png")));
		btnEliminarAdmin.setBounds(10, 349, 228, 54);
		getContentPane().add(btnEliminarAdmin);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/restarticon.png")));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administradores.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
				
			}
		});
		btnVolver.setBounds(718, 14, 138, 42);
		getContentPane().add(btnVolver);
		
		txtxBuscarAdmin = new JTextField();
		txtxBuscarAdmin.setBounds(426, 71, 430, 32);
		getContentPane().add(txtxBuscarAdmin);
		txtxBuscarAdmin.setColumns(10);
		{
			btnBuscarAdmin = new EstiloBoton("Buscar");
			btnBuscarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarAdmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscarAdmin.setBounds(261, 58, 147, 57);
			getContentPane().add(btnBuscarAdmin);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 127, 608, 347);
		getContentPane().add(scrollPane);
		{
			tablaAdmin = new JTable();
			scrollPane.setViewportView(tablaAdmin);
		}
		
		mostrarDatos();
	}
	private void limpiarCampos() {
        txtxNombreAdmin.setText("");
        txtApellidoPAdmin.setText("");
        txtApellidoMAdmin.setText("");
        txtCorreoAdmin.setText("");
        txtClaveAdmin.setText("");
        txtUsuarioAdmin.setText("");
    }
	public void mostrarDatos() {
	    // Definimos las columnas
	    String[] titulos = {"ID", "Nombre", "Ap. Paterno", "Ap. Materno", "Usuario", "Correo"};
	    modelo = new DefaultTableModel(null, titulos);
	    
	    try {
	        Connection con = Conexion.conectar();
	        // Solo traemos a los que tengan activo = 1
	        String sql = "SELECT id, nombre, apellido_paterno, apellido_materno, usuario, correo FROM administrador WHERE activo = 1";
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(sql);

	        String[] fila = new String[6];
	        while (rs.next()) {
	            fila[0] = rs.getString("id");
	            fila[1] = rs.getString("nombre");
	            fila[2] = rs.getString("apellido_paterno");
	            fila[3] = rs.getString("apellido_materno");
	            fila[4] = rs.getString("usuario");
	            fila[5] = rs.getString("correo");
	            modelo.addRow(fila);
	        }
	        
	        tablaAdmin.setModel(modelo);
	        con.close();
	        
	    } catch (SQLException e) {
	        javax.swing.JOptionPane.showMessageDialog(null, "Error al llenar la tabla: " + e.getMessage());
	    }
	}
}
