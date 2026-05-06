package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Historial_de_cambios extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
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
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Administrador:");
			lblNewLabel.setBounds(10, 11, 414, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JButton btnVolver = new JButton("Volver");
			btnVolver.setBounds(186, 227, 89, 23);
			getContentPane().add(btnVolver);
		}
		
		table = new JTable();
		table.setBounds(10, 36, 414, 180);
		getContentPane().add(table);
	}
}
//