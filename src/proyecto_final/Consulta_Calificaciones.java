package proyecto_final;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Consulta_Calificaciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel(new BorderLayout());
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Consulta_Calificaciones dialog = new Consulta_Calificaciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consulta_Calificaciones() {
		setBounds(100, 100, 931, 489);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setPreferredSize(new Dimension(1100,1280));
		

		JPanel pnl_sup = new JPanel(new BorderLayout());
		contentPanel.add(pnl_sup, BorderLayout.NORTH);
		JPanel pnl_ft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnl_sup.add(pnl_ft, BorderLayout.WEST);
		JPanel pnl_btn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pnl_sup.add(pnl_btn, BorderLayout.EAST);
		

		JPanel pnl_opc = new JPanel(new GridLayout(1, 2, 20, 0));
		contentPanel.add(pnl_opc, BorderLayout.CENTER);

		JPanel pnl_izquierdo = new JPanel(new GridLayout(11, 1, 5, 10));
		pnl_opc.add(pnl_izquierdo);
	
		JPanel panelDerecho = new JPanel(new BorderLayout(0, 10));
		pnl_opc.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new BorderLayout(5, 0));
		panelDerecho.add(panelBusqueda, BorderLayout.NORTH);
		panelBusqueda.setBorder(new EmptyBorder(20, 0, 20, 0));

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPanel);		
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		
		
		EstiloBoton btnVolver = new EstiloBoton("New button");
		btnVolver.setIcon(new ImageIcon(Consulta_Calificaciones.class.getResource("/iconos/restarticon.png")));
		btnVolver.setText("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta_Calificaciones.this.setVisible(false);
				Pagina_inicio paginicio = new Pagina_inicio();
				paginicio.setLocationRelativeTo(null);
				paginicio.setVisible(true);
			}
		});
		
		btnVolver.setPreferredSize(new Dimension(140,45));
		
		JLabel lblFotoAlumno = new JLabel("foto de aluno");
		lblFotoAlumno.setBackground(new Color(72, 75, 75));
		pnl_ft.add(lblFotoAlumno);
		pnl_btn.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Datos del alumno", SwingConstants.CENTER);
		pnl_izquierdo.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		pnl_izquierdo.add(lblNewLabel_1);
		
		textField = new JTextField();
		pnl_izquierdo.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		pnl_izquierdo.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		pnl_izquierdo.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("correo");
		pnl_izquierdo.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		pnl_izquierdo.add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Usuario");
		pnl_izquierdo.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		pnl_izquierdo.add(textField_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Grado y grupo");
		pnl_izquierdo.add(lblNewLabel_1_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		pnl_izquierdo.add(textField_4);
		
		EstiloBoton btnBuscar_ccalificacion_alumno = new EstiloBoton("New button");
		btnBuscar_ccalificacion_alumno.setText("Buscar");
		btnBuscar_ccalificacion_alumno.setIcon(new ImageIcon(Consulta_Calificaciones.class.getResource("/iconos/searchcaticon.png")));
		panelBusqueda.add(btnBuscar_ccalificacion_alumno, BorderLayout.WEST);
		
		textField_5 = new JTextField();
		panelBusqueda.add(textField_5, BorderLayout.CENTER);
		textField_5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelDerecho.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
//