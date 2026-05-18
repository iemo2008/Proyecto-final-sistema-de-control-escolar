package proyecto_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalityType;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio_de_sesion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	int BanderaUsuario;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Metodos.Personalizar_frame(); 
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
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 328);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(410, 320));
		
		JPanel panelContenido = new JPanel(new GridLayout(6, 1, 0, 15)); 
		panel.add(panelContenido, BorderLayout.CENTER);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(panel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		JLabel usuario = new JLabel("Usuario", SwingConstants.CENTER);
		panelContenido.add(usuario);
		
		txtUsuario = new JTextField();
		panelContenido.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("contraseña", SwingConstants.CENTER);
		panelContenido.add(lblNewLabel_1);
		
		
				{
					EstiloBoton btnNewButton_1 = new EstiloBoton("Ingresar");
					btnNewButton_1.addActionListener(new ActionListener() {
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
					
					txtContrasena = new JTextField();
					txtContrasena.setColumns(10);
					panelContenido.add(txtContrasena);
					
					EstiloBoton btnNewButton = new EstiloBoton("Volver");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Inicio_de_sesion.this.setVisible(false);
							Pagina_inicio paginicio = new Pagina_inicio();
							paginicio.setLocationRelativeTo(null);
							paginicio.setVisible(true);
						}
					});
					panelContenido.add(btnNewButton);
					panelContenido.add(btnNewButton_1);
				}
	}
}

