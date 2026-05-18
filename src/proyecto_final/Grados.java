package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import javax.swing.JScrollPane;

public class Grados extends JDialog {

	private static final long serialVersionUID = 1L;
	private JFormattedTextField txtGrado;
	private JFormattedTextField txtGrupo;
	private DefaultTableModel modeloGrados;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Grados dialog = new Grados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Grados() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 636, 377);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 136, 385, 191);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		txtGrado.setBounds(10, 35, 180, 20);
		getContentPane().add(txtGrado);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		txtGrupo.setBounds(10, 76, 180, 20);
		getContentPane().add(txtGrupo);
		
		EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grado = txtGrado.getText();
		        String grupo = txtGrupo.getText();

		        if(grado.isEmpty() || grupo.isEmpty()) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Completa el grado y grupo.");
		            return;
		        }

		        try {
		            java.sql.Connection con = Conexion.conectar();
		            String sql = "INSERT INTO grado (grado, grupo, activo) VALUES (?, ?, 1)";
		            java.sql.PreparedStatement pst = con.prepareStatement(sql);
		            pst.setInt(1, Integer.parseInt(grado));
		            pst.setString(2, grupo);

		            pst.executeUpdate();
		            javax.swing.JOptionPane.showMessageDialog(null, "¡Grado/Grupo registrado!");
		            
		            txtGrado.setText("");
		            txtGrupo.setText("");
		            mostrarGrados(); // Refresca la tabla local
		            con.close();
		        } catch (Exception ex) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		        }
			}
		});
		btnIngresar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/impoticon.png")));
		btnIngresar.setBounds(10, 116, 180, 54);
		getContentPane().add(btnIngresar);
		
		EstiloBoton btnModificar = new EstiloBoton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/modificateicon.png")));
		btnModificar.setBounds(10, 192, 180, 54);
		getContentPane().add(btnModificar);
		
		EstiloBoton btnBuscar = new EstiloBoton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/searchcaticon.png")));
		btnBuscar.setBounds(216, 72, 134, 54);
		getContentPane().add(btnBuscar);
		
		EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = table.getSelectedRow();
		        if (fila == -1) {
		            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona una fila.");
		            return;
		        }

		        String id = table.getValueAt(fila, 0).toString();

		        try {
		            java.sql.Connection con = Conexion.conectar();
		            java.sql.PreparedStatement pst = con.prepareStatement("UPDATE grado SET activo = 0 WHERE id = ?");
		            pst.setString(1, id);
		            pst.executeUpdate();
		            
		            javax.swing.JOptionPane.showMessageDialog(null, "Grado eliminado.");
		            mostrarGrados();
		            con.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});
		btnEliminar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/eliminateicon.png")));
		btnEliminar.setBounds(10, 268, 180, 56);
		getContentPane().add(btnEliminar);
		
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.setIcon(new ImageIcon(Grados.class.getResource("/iconos/restarticon.png")));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Grados.this.setVisible(false);
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
			}
		});
		btnVolver.setBounds(450, 14, 151, 54);
		getContentPane().add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Grado:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField txtBuscarGrupo = new JFormattedTextField();
		txtBuscarGrupo.setBounds(360, 85, 238, 29);
		getContentPane().add(txtBuscarGrupo);
		
		modeloGrados = new DefaultTableModel();
		modeloGrados.addColumn("ID");    
		modeloGrados.addColumn("Grado"); 
		modeloGrados.addColumn("Grupo");
		
		table.setModel(modeloGrados);
		
		mostrarGrados();
	}
	public void mostrarGrados() {
		modeloGrados.setRowCount(0); 
	    
	    try {
	        java.sql.Connection con = Conexion.conectar();
	        String sql = "SELECT id, grado, grupo FROM grado WHERE activo = 1";
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery(sql);

	        Object[] fila = new Object[3];
	        while (rs.next()) {
	            fila[0] = rs.getInt("id");
	            fila[1] = rs.getInt("grado");
	            fila[2] = rs.getString("grupo");
	            modeloGrados.addRow(fila);
	        }
	        con.close();
	    } catch (Exception e) {
	        javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar grados: " + e.getMessage());
	    }
	}
}
//