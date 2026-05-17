package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Asistencias extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtProfesor;
	private JTextField txtMateria;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Asistencias dialog = new Asistencias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Asistencias() {
		setTitle("Asistencias");
		setBounds(100, 100, 726, 583);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 143, 496, 376);
		contentPanel.add(scrollPane);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setIcon(new ImageIcon(Asistencias.class.getResource("/iconos/restarticon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Grados_y_materias ventana_profesor = new Grados_y_materias();
				ventana_profesor.setLocationRelativeTo(null);
				ventana_profesor.setVisible(true);
				Asistencias.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(543, 460, 159, 59);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(543, 379, 159, 59);
		contentPanel.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 496, 59);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		lblNewLabel_1.setBounds(10, 5, 62, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Materia");
		lblNewLabel_1_1.setBounds(10, 36, 62, 13);
		panel.add(lblNewLabel_1_1);
		
		txtProfesor = new JTextField();
		txtProfesor.setBounds(80, 2, 345, 18);
		panel.add(txtProfesor);
		txtProfesor.setColumns(10);
		
		txtMateria = new JTextField();
		txtMateria.setColumns(10);
		txtMateria.setBounds(80, 33, 345, 18);
		panel.add(txtMateria);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(526, 148, 182, 100);
		contentPanel.add(panel_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(145, 94, 371, 29);
		contentPanel.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Asistencias.class.getResource("/iconos/searchcaticon.png")));
		btnBuscar.setBounds(10, 83, 125, 50);
		contentPanel.add(btnBuscar);
	}
}
//