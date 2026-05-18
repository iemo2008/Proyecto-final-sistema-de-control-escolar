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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
<<<<<<< HEAD
		contentPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
		setLocationRelativeTo(null);
=======
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			EstiloBoton btnIngresar = new EstiloBoton("Ingresar");
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String user = txtUsuario.getText();
				    String pass = txtContrasena.getText();

				    // Validamos que no dejen campos vacíos
				    if (user.isEmpty() || pass.isEmpty()) {
				        javax.swing.JOptionPane.showMessageDialog(null, "Escribe tu usuario y contraseña.");
				        return;
				    }

				    // Identificamos en qué tabla buscar según la BanderaUsuario
				    String tabla = "";
				    if (BanderaUsuario == 0) tabla = "administrador";
				    else if (BanderaUsuario == 1) tabla = "profesor";
				    else if (BanderaUsuario == 2) tabla = "alumno";

				    try {
				        // Usamos la conexión
				        java.sql.Connection con = Conexion.conectar();
				        String sql = "SELECT * FROM " + tabla + " WHERE usuario=? AND contrasena=? AND activo=1";
				        
				        java.sql.PreparedStatement pst = con.prepareStatement(sql);
				        pst.setString(1, user);
				        pst.setString(2, pass);
				        
				        java.sql.ResultSet rs = pst.executeQuery();

				        if (rs.next()) {
				            // si se logra el login
				            Inicio_de_sesion.this.dispose(); 
				            
				            if (BanderaUsuario == 0) {
				                Seleccion_modificar view = new Seleccion_modificar();
				                view.setLocationRelativeTo(null);
				                view.setVisible(true);
				            } else if (BanderaUsuario == 1) {
				                Grados_y_materias view = new Grados_y_materias();
				                view.setLocationRelativeTo(null);
				                view.setVisible(true);
				            } else if (BanderaUsuario == 2) {
				                Consulta_Calificaciones view = new Consulta_Calificaciones();
				                view.setLocationRelativeTo(null);
				                view.setVisible(true);
				            }
				        } else {
				            // si falla el login
				            javax.swing.JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos (o cuenta inactiva)");
				        }
				        con.close();
				    } catch (Exception ex) {
				        javax.swing.JOptionPane.showMessageDialog(null, "Error: Revisa que XAMPP esté encendido");
				        ex.printStackTrace();
				    }
					
				}
			});
			btnIngresar.setBounds(161, 206, 106, 48);
			contentPanel.add(btnIngresar);
		}
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
<<<<<<< HEAD
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
=======
		EstiloBoton btnVolver = new EstiloBoton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion.this.setVisible(false);
				Pagina_inicio paginicio = new Pagina_inicio();
				paginicio.setLocationRelativeTo(null);
				paginicio.setVisible(true);
			}
		});
		btnVolver.setBounds(161, 148, 106, 48);
		contentPanel.add(btnVolver);
>>>>>>> branch 'master' of https://github.com/iemo2008/Proyecto-final-sistema-de-control-escolar.git
		
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

