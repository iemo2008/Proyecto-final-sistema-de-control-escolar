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
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Historial_de_cambios extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String [] columnas = {"Accion","Profesor","Alumno","Administrador","Materia"};
		DefaultTableModel modelo = new DefaultTableModel(columnas,0);
		
		try {
			Metodos.Personalizar_frame();
			Historial_de_cambios dialog = new Historial_de_cambios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Historial_de_cambios() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(490, 300));
		
		JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelContenido = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
		panel.add(panelContenido, BorderLayout.CENTER);

		JPanel pnl_abajo = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
		panel.add(pnl_abajo, BorderLayout.SOUTH);
		
		pnl_abajo.setBorder(new EmptyBorder(15, 0, 0, 0));

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(panel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		{
			JLabel lblNewLabel = new JLabel("Administrador:");
			panelSuperior.add(lblNewLabel);
		}
		{
			EstiloBoton btnVolver = new EstiloBoton("Volver");
			pnl_abajo.add(btnVolver);
		}
		
		JTable table = new JTable();
		JScrollPane scrollPane = new JScrollPane(table);
		panelContenido.add(scrollPane, BorderLayout.CENTER);

	}
}
//