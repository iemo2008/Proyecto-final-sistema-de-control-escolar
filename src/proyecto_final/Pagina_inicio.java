package proyecto_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pagina_inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				    } catch (Exception e) {
				    e.printStackTrace();
				}
				
				
				try {
					Pagina_inicio frame = new Pagina_inicio();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pagina_inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\icono_sce.png"));
		setTitle("Página inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 435);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(194, 216, 237));
		contentPane.setBackground(new Color(190, 213, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//se crean los botones 
		EstiloBoton btnIngresarAdministrador = new EstiloBoton("Administrador");
		btnIngresarAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
				
			}
		});
		btnIngresarAdministrador.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconadmin.png"));
		btnIngresarAdministrador.setBackground(new Color(26, 55, 77));
		btnIngresarAdministrador.setMnemonic('a');
		btnIngresarAdministrador.setForeground(new Color(194, 216, 237));
		btnIngresarAdministrador.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnIngresarAdministrador.setBounds(10, 110, 212, 162);
		contentPane.add(btnIngresarAdministrador);
		
		EstiloBoton btnIngresarProfesor = new EstiloBoton("Administrador");
		btnIngresarProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
			}
		});
		btnIngresarProfesor.setBackground(new Color(26, 55, 77));
		btnIngresarProfesor.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconteacher.png"));
		btnIngresarProfesor.setText("Profesor");
		btnIngresarProfesor.setMnemonic('a');
		btnIngresarProfesor.setForeground(new Color(194, 216, 237));
		btnIngresarProfesor.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnIngresarProfesor.setBounds(232, 109, 204, 162);
		contentPane.add(btnIngresarProfesor);
		
		EstiloBoton btnIngresarAlumno = new EstiloBoton("Administrador");
		btnIngresarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
			}
		});
		btnIngresarAlumno.setBackground(new Color(26, 55, 77));
		btnIngresarAlumno.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\proyecto_final\\iconos\\iconstudent.png"));
		btnIngresarAlumno.setText("Alumno");
		btnIngresarAlumno.setMnemonic('a');
		btnIngresarAlumno.setForeground(new Color(194, 216, 237));
		btnIngresarAlumno.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnIngresarAlumno.setBounds(445, 109, 204, 162);
		contentPane.add(btnIngresarAlumno);
		
		JLabel lblNewLabel = new JLabel("SELECCIONE SU PERFIL");
		lblNewLabel.setForeground(new Color(36, 62, 83));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel.setBounds(220, 54, 263, 28);
		contentPane.add(lblNewLabel);
		
	}
}
