package proyecto_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		setLocationRelativeTo(null);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(590, 430));
		
		JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelContenido = new JPanel(new GridLayout(1, 2, 20, 0)); 
		panel.add(panelContenido, BorderLayout.CENTER);
		
		JPanel panelFormulario = new JPanel(new GridLayout(7, 1, 5, 15));
		panelContenido.add(panelFormulario);
		
		JPanel panelDerecho = new JPanel(new BorderLayout(0, 10));
		panelContenido.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new BorderLayout(5, 0));
		panelBusqueda.setBorder(new EmptyBorder(15, 0, 15, 0));
		panelDerecho.add(panelBusqueda, BorderLayout.NORTH);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(panel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll, BorderLayout.CENTER);
		{
<<<<<<< HEAD
			table = new JTable();
			JScrollPane scrollPane = new JScrollPane(table);
			panelDerecho.add(scrollPane, BorderLayout.CENTER);
		}
		{
=======
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
			JLabel lblNewLabel = new JLabel("Nombre:");
			panelFormulario.add(lblNewLabel);
		}
		{
			EstiloBoton btnEliminar = new EstiloBoton("Eliminar");
			btnEliminar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/eliminateicon.png")));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					eliminarMateria();
				}
			});
			
			{
				JFormattedTextField txtNombre = new JFormattedTextField();
				panelFormulario.add(txtNombre);
			}
			panelFormulario.add(btnEliminar);
		}
		{
			EstiloBoton btnBuscarMateria = new EstiloBoton("Buscar");
			btnBuscarMateria.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscarMateria.setIcon(new ImageIcon(Materias.class.getResource("/iconos/searchcaticon.png")));
			panelBusqueda.add(btnBuscarMateria, BorderLayout.WEST);
		}
		{
			EstiloBoton btnModificar = new EstiloBoton("Modificar");
			btnModificar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/modificateicon.png")));
			panelFormulario.add(btnModificar);
		}
		{
			EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ingresarMateria();
				}
			});
			btnIngresar.setIcon(new ImageIcon(Materias.class.getResource("/iconos/impoticon.png")));
			panelFormulario.add(btnIngresar);
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
			btnVolver.setPreferredSize(new Dimension(130, 40));
			panelSuperior.add(btnVolver);
		}
		{
			JFormattedTextField txtBuscarMateria = new JFormattedTextField();
			panelBusqueda.add(txtBuscarMateria, BorderLayout.CENTER);
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