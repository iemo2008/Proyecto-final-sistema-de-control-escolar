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
<<<<<<< HEAD
		setLocationRelativeTo(null);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(490, 330));
		
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
			JScrollPane scrollPane = new JScrollPane(table);
			JTable table = new JTable();
			panelDerecho.add(scrollPane, BorderLayout.CENTER);
		}
=======
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 136, 385, 191);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
		JLabel lblNewLabel = new JLabel("Grado:");
		panelFormulario.add(lblNewLabel);
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		panelFormulario.add(txtGrado);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		panelFormulario.add(lblNewLabel_1);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		panelFormulario.add(txtGrupo);
		
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
		panelFormulario.add(btnIngresar);
		
		EstiloBoton btnModificar = new EstiloBoton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/modificateicon.png")));
		panelFormulario.add(btnModificar);
		
		EstiloBoton btnBuscar = new EstiloBoton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Grados.class.getResource("/iconos/searchcaticon.png")));
		panelBusqueda.add(btnBuscar, BorderLayout.WEST);
		
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
		panelFormulario.add(btnEliminar);
		
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
		btnVolver.setPreferredSize(new Dimension(120, 40));
		panelSuperior.add(btnVolver);
		
		JFormattedTextField txtBuscarGrupo = new JFormattedTextField();
<<<<<<< HEAD
		panelBusqueda.add(txtBuscarGrupo, BorderLayout.CENTER);
=======
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
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
	}
}
//