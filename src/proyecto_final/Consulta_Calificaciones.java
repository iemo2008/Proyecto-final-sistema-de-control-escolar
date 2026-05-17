package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Consulta_Calificaciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
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
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		EstiloBoton btnVolver = new EstiloBoton("New button");
		btnVolver.setIcon(new ImageIcon(Consulta_Calificaciones.class.getResource("/iconos/restarticon.png")));
		btnVolver.setText("Volver");
		btnVolver.setBounds(767, 10, 129, 64);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta_Calificaciones.this.setVisible(false);
				Pagina_inicio paginicio = new Pagina_inicio();
				paginicio.setLocationRelativeTo(null);
				paginicio.setVisible(true);
			}
		});
		contentPanel.setLayout(null);
		
		JLabel lblFotoAlumno = new JLabel("foto de aluno");
		lblFotoAlumno.setBackground(new Color(72, 75, 75));
		lblFotoAlumno.setBounds(42, 10, 122, 123);
		contentPanel.add(lblFotoAlumno);
		contentPanel.add(btnVolver);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 151, 250, 291);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos del alumno");
		lblNewLabel.setBounds(80, 10, 110, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(109, 61, 44, 12);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setBounds(109, 110, 66, 12);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("correo");
		lblNewLabel_1_1_1.setBounds(109, 159, 44, 12);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Usuario");
		lblNewLabel_1_1_2.setBounds(109, 199, 44, 12);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Grado y grupo");
		lblNewLabel_1_1_2_1.setBounds(94, 241, 81, 12);
		panel.add(lblNewLabel_1_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(34, 82, 189, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 131, 189, 18);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(34, 171, 189, 18);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(34, 221, 189, 18);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(34, 263, 189, 18);
		panel.add(textField_4);
		
		EstiloBoton btnBuscar_ccalificacion_alumno = new EstiloBoton("New button");
		btnBuscar_ccalificacion_alumno.setText("Buscar");
		btnBuscar_ccalificacion_alumno.setIcon(new ImageIcon(Consulta_Calificaciones.class.getResource("/iconos/searchcaticon.png")));
		btnBuscar_ccalificacion_alumno.setBounds(285, 69, 129, 64);
		contentPanel.add(btnBuscar_ccalificacion_alumno);
		
		textField_5 = new JTextField();
		textField_5.setBounds(424, 87, 472, 31);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(285, 146, 611, 296);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
//