package proyecto_final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalityType;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio_de_sesion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	int BanderaUsuario;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Inicio_de_sesion dialog = new Inicio_de_sesion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void setDato(int BanderaU) {
        
		this.BanderaUsuario = BanderaU;
    }
	
	/**
	 * Create the dialog.
	 */
	public Inicio_de_sesion() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 328);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			EstiloBoton btnNewButton = new EstiloBoton("Ingresar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//de acuerdo al usuario que entre se buscará su usuario y contraseña en la base de datos 
				if(BanderaUsuario == 0)
			    {
					Inicio_de_sesion.this.setVisible(false);
			        Seleccion_modificar inicioAdmin = new Seleccion_modificar();
			        inicioAdmin.setLocationRelativeTo(null);
			        inicioAdmin.setVisible(true);
			    }
			    else
			    {
			       if(BanderaUsuario == 1)
			       {
			    	   	Inicio_de_sesion.this.setVisible(false);
				        Grados_y_materias inicioprofe = new Grados_y_materias();
				        inicioprofe.setLocationRelativeTo(null);
				        inicioprofe.setVisible(true);	
			       }
			       else
			       {
			            if(BanderaUsuario == 2)
			            {
			            	Inicio_de_sesion.this.setVisible(false);
			            	Consulta_Calificaciones inicioAlumnos = new Consulta_Calificaciones();
			            	inicioAlumnos.setLocationRelativeTo(null);
			            	inicioAlumnos.setVisible(true);
			        	}
			            else
			        		{
			        			
			        		}
			        	}
			        }
					
				}
			});
			btnNewButton.setBounds(161, 206, 106, 48);
			contentPanel.add(btnNewButton);
		}
		
		EstiloBoton btnNewButton = new EstiloBoton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion.this.setVisible(false);
				Pagina_inicio paginicio = new Pagina_inicio();
				paginicio.setLocationRelativeTo(null);
				paginicio.setVisible(true);
			}
		});
		btnNewButton.setBounds(161, 148, 106, 48);
		contentPanel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(141, 58, 144, 18);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 105, 144, 18);
		contentPanel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(194, 36, 44, 12);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(194, 86, 44, 12);
		contentPanel.add(lblNewLabel_1);
	}
}

