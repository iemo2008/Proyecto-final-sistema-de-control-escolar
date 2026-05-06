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

public class Calificaciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable tb_calificaciones;
	DefaultTableModel Calificaciones = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
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
		setBounds(100, 100, 715, 587);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
		}
		
			textField = new JTextField();
			textField.setBounds(10, 11, 374, 47);
			contentPanel.add(textField);
			textField.setColumns(10);
		
		{
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.setBounds(478, 474, 175, 63);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton("Guardar");
			btnNewButton.setBounds(478, 400, 175, 63);
			contentPanel.add(btnNewButton);
		}
		
		JLabel lblNewLabel = new JLabel("IMAGEN");
		lblNewLabel.setBounds(478, 144, 175, 207);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		lblNewLabel_1.setBounds(409, 11, 206, 27);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Materia");
		lblNewLabel_1_1.setBounds(409, 42, 206, 27);
		contentPanel.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 409, 468);
		contentPanel.add(scrollPane);
		
		tb_calificaciones = new JTable();
		scrollPane.setViewportView(tb_calificaciones);
		
		Calificaciones.addColumn("Grupos");
		Calificaciones.addColumn("Materias Asignadas");
		
		tb_calificaciones = new JTable(Calificaciones);
		scrollPane.setViewportView(tb_calificaciones);
		
		tb_calificaciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tb_calificaciones.setRowSelectionAllowed(true);
		tb_calificaciones.setFillsViewportHeight(true);

	}
}
//