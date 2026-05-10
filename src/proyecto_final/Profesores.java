package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class Profesores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtxNombreProfe;
	private JTextField txtApellidosProfe;
	private JTextField txtCorreoProfe;
	private JTextField txtClaveProfe;
	private JTextField txtBuscarProfe;
	private JTextField txtUsuarioProfe;
	private JTable TablaProfesores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Profesores dialog = new Profesores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Profesores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Profesores");
		setBounds(100, 100, 646, 446);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtxNombreProfe = new JTextField();
			txtxNombreProfe.setBounds(10, 25, 206, 18);
			contentPanel.add(txtxNombreProfe);
			txtxNombreProfe.setColumns(10);
		}
		{
			txtApellidosProfe = new JTextField();
			txtApellidosProfe.setColumns(10);
			txtApellidosProfe.setBounds(10, 65, 206, 18);
			contentPanel.add(txtApellidosProfe);
		}
		{
			txtCorreoProfe = new JTextField();
			txtCorreoProfe.setColumns(10);
			txtCorreoProfe.setBounds(10, 104, 206, 18);
			contentPanel.add(txtCorreoProfe);
		}
		{
			txtClaveProfe = new JTextField();
			txtClaveProfe.setColumns(10);
			txtClaveProfe.setBounds(10, 143, 206, 18);
			contentPanel.add(txtClaveProfe);
		}
		
		JComboBox cmbGrupoProfe = new JComboBox();
		cmbGrupoProfe.setBounds(10, 213, 96, 20);
		contentPanel.add(cmbGrupoProfe);
		
		JButton btnOpccionesMaestro = new JButton("New button");
		btnOpccionesMaestro.setBounds(10, 243, 112, 62);
		contentPanel.add(btnOpccionesMaestro);
		
		JButton btnVolver = new JButton("New button");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion_modificar VentanaSeleccion = new Seleccion_modificar();
				VentanaSeleccion.setLocationRelativeTo(null);
				VentanaSeleccion.setVisible(true);
			}
		});
		btnVolver.setBounds(10, 315, 112, 60);
		contentPanel.add(btnVolver);
		
		JButton btnIngresarProfe = new JButton("New button");
		btnIngresarProfe.setBounds(132, 243, 84, 31);
		contentPanel.add(btnIngresarProfe);
		
		JButton btnModificarProfe = new JButton("New button");
		btnModificarProfe.setBounds(132, 296, 84, 31);
		contentPanel.add(btnModificarProfe);
		
		JButton btnEliminarProfe = new JButton("New button");
		btnEliminarProfe.setBounds(132, 344, 84, 31);
		contentPanel.add(btnEliminarProfe);
		
		txtBuscarProfe = new JTextField();
		txtBuscarProfe.setBounds(374, 25, 230, 18);
		contentPanel.add(txtBuscarProfe);
		txtBuscarProfe.setColumns(10);
		
		JButton btnBuscarProfe = new JButton("New button");
		btnBuscarProfe.setBounds(260, 24, 84, 20);
		contentPanel.add(btnBuscarProfe);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 10, 44, 12);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 53, 44, 12);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 93, 44, 12);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 132, 44, 12);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 202, 44, 12);
		contentPanel.add(lblNewLabel_4);
		
		txtUsuarioProfe = new JTextField();
		txtUsuarioProfe.setColumns(10);
		txtUsuarioProfe.setBounds(10, 185, 206, 18);
		contentPanel.add(txtUsuarioProfe);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(10, 171, 44, 12);
		contentPanel.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 67, 345, 303);
		contentPanel.add(scrollPane);
		
		TablaProfesores = new JTable();
		scrollPane.setColumnHeaderView(TablaProfesores);
	}
}
//