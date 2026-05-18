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
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class Grados extends JDialog {

	private static final long serialVersionUID = 1L;
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
		
		JLabel lblNewLabel = new JLabel("Grado:");
		panelFormulario.add(lblNewLabel);
		
		JFormattedTextField txtGrado = new JFormattedTextField();
		panelFormulario.add(txtGrado);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		panelFormulario.add(lblNewLabel_1);
		
		JFormattedTextField txtGrupo = new JFormattedTextField();
		panelFormulario.add(txtGrupo);
		
		EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
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
		panelBusqueda.add(txtBuscarGrupo, BorderLayout.CENTER);
	}
}
//