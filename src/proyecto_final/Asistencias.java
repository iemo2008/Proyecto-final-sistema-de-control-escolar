package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
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
	private final JPanel contentPanel = new JPanel(new BorderLayout());
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
		setLocationRelativeTo(null);
			

		contentPanel.setPreferredSize(new Dimension(926, 880));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel pnl_sup = new JPanel(new GridLayout(2, 4, -50, 15));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(pnl_sup);
		contentPanel.add(panel, BorderLayout.NORTH);
		
		
		JPanel pnl_opc = new JPanel(new GridLayout(1, 2, 20, 0));
		contentPanel.add(pnl_opc, BorderLayout.CENTER);

		JPanel pnl_izquierdo = new JPanel(new BorderLayout(15,10));
		pnl_opc.add(pnl_izquierdo);
	
		JPanel panelDerecho = new JPanel(new GridLayout(4, 1, 0, 25));
		pnl_opc.add(panelDerecho);

		JPanel panelBusqueda = new JPanel(new GridLayout(1, 2, -30, 15));
		pnl_izquierdo.add(panelBusqueda, BorderLayout.NORTH);

		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPanel);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		
		JScrollPane scrollPane = new JScrollPane();
		pnl_izquierdo.add(scrollPane);
		
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
		
		JPanel panel_1 = new JPanel();
		panelDerecho.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelDerecho.add(btnNewButton_1);
		panelDerecho.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		pnl_sup.add(lblNewLabel_1);
		
		txtProfesor = new JTextField();
		pnl_sup.add(txtProfesor);
		txtProfesor.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Materia");
		pnl_sup.add(lblNewLabel_1_1);
		
		txtMateria = new JTextField();
		txtMateria.setColumns(10);
		pnl_sup.add(txtMateria);
		
		txtBuscar = new JTextField();
		panelBusqueda.add(txtBuscar, BorderLayout.NORTH);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setIcon(new ImageIcon(Asistencias.class.getResource("/iconos/searchcaticon.png")));
		panelBusqueda.add(btnBuscar);
	}
}
//