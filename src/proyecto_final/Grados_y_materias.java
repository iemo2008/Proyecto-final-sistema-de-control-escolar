package proyecto_final;

import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grados_y_materias extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tb_grupo_materias;
	DefaultTableModel Escolar = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame();
			Grados_y_materias dialog = new Grados_y_materias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Grados_y_materias() {
		setTitle("Grados y Materias");
		setBounds(100, 100, 700, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(89, 95, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			EstiloBoton btnNewButton = new EstiloBoton("VOLVER");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Grados_y_materias.this.setVisible(false);
					Pagina_inicio paginicio = new Pagina_inicio();
					paginicio.setLocationRelativeTo(null);
					paginicio.setVisible(true);
				}
			});
			btnNewButton.setBounds(488, 11, 170, 50);
			contentPanel.add(btnNewButton);
		}
		
		EstiloBoton btnAsistencias = new EstiloBoton("ASISTENCIAS");
		btnAsistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Asistencias Asistencias_profesor = new Asistencias();
				Asistencias_profesor.setLocationRelativeTo(null);
				Asistencias_profesor.setVisible(true);
				Grados_y_materias.this.setVisible(false);
			}
		});
		btnAsistencias.setBackground(new Color(36, 62, 83));
		btnAsistencias.setBounds(10, 11, 170, 50);
		contentPanel.add(btnAsistencias);
		
		EstiloBoton btnCalificaciones = new EstiloBoton("CALIFICACIONES");
		btnCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calificaciones calificaciones_profesor = new Calificaciones();
				calificaciones_profesor.setLocationRelativeTo(null);
				calificaciones_profesor.setVisible(true);
				Grados_y_materias.this.setVisible(false);
			}
		});
		btnCalificaciones.setBounds(190, 11, 170, 50);
		contentPanel.add(btnCalificaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 125, 443, 290);
		contentPanel.add(scrollPane);
		
		tb_grupo_materias = new JTable();
		scrollPane.setViewportView(tb_grupo_materias);
		
		JLabel lblNewLabel = new JLabel("IMAGEN");
		lblNewLabel.setBounds(488, 168, 175, 207);
		contentPanel.add(lblNewLabel);
		
		Escolar.addColumn("Grupos");
		Escolar.addColumn("Materias Asignadas");
		
		tb_grupo_materias = new JTable(Escolar);
		scrollPane.setViewportView(tb_grupo_materias);
		
		tb_grupo_materias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tb_grupo_materias.setRowSelectionAllowed(true);
		tb_grupo_materias.setFillsViewportHeight(true);
					
	}
}
//