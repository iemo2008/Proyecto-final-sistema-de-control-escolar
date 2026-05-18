package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Materias extends JDialog {

	private static final long serialVersionUID = 1L;
	private JFormattedTextField txtNombre; 
    private DefaultTableModel modeloMaterias;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Materias dialog = new Materias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Materias() {
		setModal(true);
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setBounds(100, 100, 652, 371);
		getContentPane().setLayout(null);
		{
			JFormattedTextField txtNombre = new JFormattedTextField();
			txtNombre.setBounds(10, 61, 161, 20);
			getContentPane().add(txtNombre);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 37, 49, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
			btnEliminar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/eliminateicon.png")));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					eliminarMateria();
				}
			});
			btnEliminar.setBounds(10, 248, 161, 61);
			getContentPane().add(btnEliminar);
		}
		{
			EstiloBoton btnBuscarMateria = new EstiloBoton("Buscar");
			btnBuscarMateria.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscarMateria.setIcon(new ImageIcon(Materias.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarMateria.setBounds(200, 61, 125, 53);
			getContentPane().add(btnBuscarMateria);
		}
		{
			EstiloBoton btnModificar = new EstiloBoton("Modificar");
			btnModificar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/modificateicon.png")));
			btnModificar.setBounds(10, 174, 161, 64);
			getContentPane().add(btnModificar);
		}
		{
			EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ingresarMateria();
				}
			});
			btnIngresar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/impoticon.png")));
			btnIngresar.setBounds(10, 107, 161, 61);
			getContentPane().add(btnIngresar);
		}
		{
			EstiloBoton btnVolver = new EstiloBoton("Volver");
			btnVolver.setIcon(new ImageIcon(Materias.class.getResource("/iconos/restarticon.png")));
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Materias.this.setVisible(false);
					Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
					VentanaSeleccion.setLocationRelativeTo(null);
					VentanaSeleccion.setVisible(true);
				}
			});
			btnVolver.setBounds(502, 5, 113, 46);
			getContentPane().add(btnVolver);
		}
		{
			JFormattedTextField txtBuscarMateria = new JFormattedTextField();
			txtBuscarMateria.setBounds(347, 73, 268, 34);
			getContentPane().add(txtBuscarMateria);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(199, 130, 416, 179);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
			}
		}
		
		modeloMaterias = new DefaultTableModel();
		modeloMaterias.addColumn("ID");
		modeloMaterias.addColumn("Nombre Materia");
		table.setModel(modeloMaterias);

		mostrarMaterias();
	}
	
	public void mostrarMaterias() {
	    modeloMaterias.setRowCount(0);
	    try (java.sql.Connection con = Conexion.conectar()) {
	        String sql = "SELECT id, nombre FROM materia WHERE activo = 1";
	        java.sql.Statement st = con.createStatement();
	        java.sql.ResultSet rs = st.executeQuery(sql);
	        while (rs.next()) {
	            modeloMaterias.addRow(new Object[]{rs.getInt("id"), rs.getString("nombre")});
	        }
	    } catch (Exception e) { e.printStackTrace(); }
	}

	private void ingresarMateria() {
	    String nombre = txtNombre.getText();
	    if (nombre.isEmpty()) return;
	    try (java.sql.Connection con = Conexion.conectar()) {
	        java.sql.PreparedStatement pst = con.prepareStatement("INSERT INTO materia (nombre, activo) VALUES (?, 1)");
	        pst.setString(1, nombre);
	        pst.executeUpdate();
	        txtNombre.setText("");
	        mostrarMaterias();
	        javax.swing.JOptionPane.showMessageDialog(null, "Materia agregada");
	    } catch (Exception e) { e.printStackTrace(); }
	}

	private void eliminarMateria() {
	    int fila = table.getSelectedRow();
	    if (fila == -1) return;
	    String id = table.getValueAt(fila, 0).toString();
	    try (java.sql.Connection con = Conexion.conectar()) {
	        java.sql.PreparedStatement pst = con.prepareStatement("UPDATE materia SET activo = 0 WHERE id = ?");
	        pst.setString(1, id);
	        pst.executeUpdate();
	        mostrarMaterias();
	    } catch (Exception e) { e.printStackTrace(); }
	}

}
//