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
		JButton btnIngresarAdministrador = new JButton("Administrador");
		btnIngresarAdministrador.setMnemonic('a');
		btnIngresarAdministrador.setBackground(new Color(190, 213, 235));
		btnIngresarAdministrador.setForeground(new Color(22, 49, 88));
		btnIngresarAdministrador.setFont(new Font("Sitka Text", Font.BOLD, 22));
		btnIngresarAdministrador.setBounds(10, 38, 211, 272);
		contentPane.add(btnIngresarAdministrador);
		
		JButton btnIngresarProfesor = new JButton("Profesor");
		btnIngresarProfesor.setMnemonic('p');
		btnIngresarProfesor.setBackground(new Color(190, 213, 235));
		btnIngresarProfesor.setForeground(new Color(22, 49, 88));
		btnIngresarProfesor.setFont(new Font("Sitka Text", Font.BOLD, 22));
		btnIngresarProfesor.setBounds(244, 44, 195, 266);
		contentPane.add(btnIngresarProfesor);
		
		JButton btnIngresarAlumno = new JButton("Alumno");
		btnIngresarAlumno.setMnemonic('l');
		btnIngresarAlumno.setBackground(new Color(190, 213, 235));
		btnIngresarAlumno.setForeground(new Color(22, 49, 88));
		btnIngresarAlumno.setFont(new Font("Sitka Text", Font.BOLD, 22));
		btnIngresarAlumno.setBounds(463, 38, 204, 272);
		contentPane.add(btnIngresarAlumno);
		
	}
}
