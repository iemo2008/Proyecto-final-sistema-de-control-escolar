package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
	private final JPanel contentPanel = new JPanel(new BorderLayout());
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
		setLocationRelativeTo(null);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setPreferredSize(new java.awt.Dimension(856, 580));
		
		JPanel pnl_sup = new JPanel(new GridLayout(2, 4, -50, 15));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(pnl_sup);
		contentPanel.add(panel, BorderLayout.NORTH);
		
		JPanel pnl_opc = new JPanel(new GridLayout(1, 2, 20, 0));
		contentPanel.add(pnl_opc, BorderLayout.CENTER);

		JPanel pnl_izquierdo = new JPanel(new BorderLayout(15,10));
		pnl_opc.add(pnl_izquierdo);
	
		JPanel panelDerecho = new JPanel(new GridLayout(3, 1, 0, 25));
		pnl_opc.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new GridLayout(1, 2, 20, 0));
		pnl_izquierdo.add(panelBusqueda, BorderLayout.NORTH);
		panelBusqueda.setBorder(new EmptyBorder(20, 0, 20, 0));
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPanel);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
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
			
			JLabel lblNewLabel = new JLabel("IMAGEN");
			panelDerecho.add(lblNewLabel);
			btnNewButton.setIcon(new ImageIcon(Calificaciones.class.getResource("/iconos/restarticon.png")));
			panelDerecho.add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton("Guardar");
			panelDerecho.add(btnNewButton);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 163, 582, 358);
		pnl_izquierdo.add(scrollPane);
		
		Calificaciones.addColumn("Grupos");
		Calificaciones.addColumn("Materias Asignadas");
		
		tb_calificaciones = new JTable(Calificaciones);
		scrollPane.setViewportView(tb_calificaciones);
		
		tb_calificaciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tb_calificaciones.setRowSelectionAllowed(true);
		tb_calificaciones.setFillsViewportHeight(true);
		
		JLabel lblNewLabel_1_1 = new JLabel("Materia");
		pnl_sup.add(lblNewLabel_1_1);
		
		txt_materia = new JTextField();
		txt_materia.setColumns(10);
		pnl_sup.add(txt_materia);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		pnl_sup.add(lblNewLabel_1);
		
		txtProfesor = new JTextField();
		pnl_sup.add(txtProfesor);
		txtProfesor.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Calificaciones.class.getResource("/iconos/searchcaticon.png")));
		panelBusqueda.add(btnBuscar);
		
		
		txtBuscar = new JTextField();
		panelBusqueda.add(txtBuscar);
		txtBuscar.setColumns(10);

	}
}
//