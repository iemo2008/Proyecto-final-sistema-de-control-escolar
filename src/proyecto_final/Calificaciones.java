package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calificaciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tb_calificaciones;
	DefaultTableModel Calificaciones = new DefaultTableModel();
	private JTextField txtProfesor;
	private JTextField txt_materia;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Calificaciones dialog = new Calificaciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Calificaciones() {
		setTitle("Calificaciones");
		setBounds(100, 100, 861, 591);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
		}
		
		{
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Grados_y_materias ventana_profesor = new Grados_y_materias();
					ventana_profesor.setLocationRelativeTo(null);
					ventana_profesor.setVisible(true);
					Calificaciones.this.setVisible(false);
				}
			});
			btnNewButton.setIcon(new ImageIcon(Calificaciones.class.getResource("/iconos/restarticon.png")));
			btnNewButton.setBounds(634, 463, 175, 63);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton("Guardar");
			btnNewButton.setBounds(634, 375, 175, 63);
			contentPanel.add(btnNewButton);
		}
		
		JLabel lblNewLabel = new JLabel("IMAGEN");
		lblNewLabel.setBounds(634, 129, 175, 211);
		contentPanel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 163, 582, 358);
		contentPanel.add(scrollPane);
		
		Calificaciones.addColumn("Grupos");
		Calificaciones.addColumn("Materias Asignadas");
		
		tb_calificaciones = new JTable(Calificaciones);
		scrollPane.setViewportView(tb_calificaciones);
		
		tb_calificaciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tb_calificaciones.setRowSelectionAllowed(true);
		tb_calificaciones.setFillsViewportHeight(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 582, 62);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Materia");
		lblNewLabel_1_1.setBounds(10, 39, 85, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		lblNewLabel_1.setBounds(10, 2, 58, 27);
		panel.add(lblNewLabel_1);
		
		txtProfesor = new JTextField();
		txtProfesor.setBounds(105, 6, 434, 18);
		panel.add(txtProfesor);
		txtProfesor.setColumns(10);
		
		txt_materia = new JTextField();
		txt_materia.setColumns(10);
		txt_materia.setBounds(105, 36, 434, 18);
		panel.add(txt_materia);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(158, 108, 434, 34);
		contentPanel.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Calificaciones.class.getResource("/iconos/searchcaticon.png")));
		btnBuscar.setBounds(10, 103, 125, 50);
		contentPanel.add(btnBuscar);

	}
}
//