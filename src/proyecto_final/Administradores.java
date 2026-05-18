package proyecto_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;

public class Administradores extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtxNombreAdmin;
	private JTextField txtxApellidosAdmin;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Administradores dialog = new Administradores();
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
	public Administradores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Administradores");
		setBounds(100, 100, 880, 556);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(880, 720));

		
		JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelContenido = new JPanel(new GridLayout(1, 2, 20, 0)); 
		panel.add(panelContenido, BorderLayout.CENTER);
		
		JPanel panelFormulario = new JPanel(new GridLayout(13, 1, 5, 15));
		panelContenido.add(panelFormulario);
		
		JPanel panelDerecho = new JPanel(new BorderLayout(0, 10));
		panelContenido.add(panelDerecho);


		JPanel panelBusqueda = new JPanel(new BorderLayout(5, 0));
		panelDerecho.add(panelBusqueda, BorderLayout.NORTH);



		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(panel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
				
		JLabel lblNewLabel = new JLabel("Nombre");
		
				panelFormulario.add(lblNewLabel);

		
		{
			txtxNombreAdmin = new JTextField();
	
			panelFormulario.add(txtxNombreAdmin);
			txtxNombreAdmin.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Apellidos");
			
			panelFormulario.add(lblNewLabel_4);
		}
		{
			txtxApellidosAdmin = new JTextField();
			txtxApellidosAdmin.setColumns(10);

			panelFormulario.add(txtxApellidosAdmin);
		}
		{
			lblNewLabel_1 = new JLabel("Correo");
			
			panelFormulario.add(lblNewLabel_1);
		}
		{
			txtCorreoAdmin = new JTextField();
			txtCorreoAdmin.setColumns(10);
			
			panelFormulario.add(txtCorreoAdmin);
		}
		{
			lblNewLabel_2 = new JLabel("Clave");

			panelFormulario.add(lblNewLabel_2);
		}
		{
			txtClaveAdmin = new JTextField();
			txtClaveAdmin.setColumns(10);

			panelFormulario.add(txtClaveAdmin);
		}
		{
			lblNewLabel_3 = new JLabel("Usuario");

			panelFormulario.add(lblNewLabel_3);
		}
		{
			txtUsuarioAdmin = new JTextField();
			txtUsuarioAdmin.setColumns(10);

			panelFormulario.add(txtUsuarioAdmin);
		}
		
		EstiloBoton btnIngresarAdmin = new EstiloBoton("Ingresar");
		btnIngresarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/impoticon.png")));
	
		panelFormulario.add(btnIngresarAdmin);
		
		EstiloBoton btnModificarAdmin = new EstiloBoton("Modificar");
		btnModificarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/modificateicon.png")));
	
		panelFormulario.add(btnModificarAdmin);
		
		EstiloBoton EliminarAdmin = new EstiloBoton("Eliminar");
		EliminarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EliminarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/eliminateicon.png")));

		panelFormulario.add(EliminarAdmin);
		
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
		btnVolver.setPreferredSize(new Dimension(140, 45));
		panelSuperior.add(btnVolver);
		
		txtxBuscarAdmin = new JTextField();
		panelBusqueda.add(txtxBuscarAdmin, BorderLayout.CENTER);
		txtxBuscarAdmin.setColumns(10);
		{
			btnBuscarAdmin = new EstiloBoton("Buscar");
			btnBuscarAdmin.setIcon(new ImageIcon(Administradores.class.getResource("/iconos/searchcaticon.png")));
			btnBuscarAdmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			panelBusqueda.add(btnBuscarAdmin, BorderLayout.WEST);
			
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 127, 608, 347);
		panelDerecho.add(scrollPane, BorderLayout.CENTER);
		{
			tablaAdmin = new JTable();
			scrollPane.setViewportView(tablaAdmin);
		}
	}
}
