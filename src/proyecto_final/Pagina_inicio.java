package proyecto_final;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.formdev.flatlaf.FlatDarkLaf;

public class Pagina_inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane = new JPanel(new BorderLayout());
	int BanderaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metodos.Personalizar_frame(); 
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
		setBounds(100, 100, 701, 465);

		contentPane.setForeground(new Color(194, 216, 237));
		contentPane.setBackground(new Color(72, 72, 72));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(410, 320));
		
		JPanel panelContenido = new JPanel(new GridLayout(1, 4, 15, 0)); 
		panelContenido.setOpaque(false);
		contentPane.add(panelContenido, BorderLayout.CENTER);
		
		JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
		contentPane.add(panelSuperior, BorderLayout.NORTH);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(contentPane);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		setContentPane(scroll);

		
		
		//se crean los botones 
		EstiloBoton btnIngresarAdministrador = new EstiloBoton("Administrador");
		btnIngresarAdministrador.setSelectedIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconadmin.png")));
		btnIngresarAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				BanderaUsuario = 0;
				inicio.setDato(BanderaUsuario);
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
				Pagina_inicio.this.setVisible(false);
			}
		});
		
		JLabel lblNewLabel = new JLabel("SELECCIONE SU PERFIL", SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(202, 220, 247));
		lblNewLabel.setForeground(new Color(202, 220, 247));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		panelSuperior.add(lblNewLabel);
		btnIngresarAdministrador.setIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconadmin.png")));
		btnIngresarAdministrador.setBackground(new Color(5, 25, 45));
		btnIngresarAdministrador.setMnemonic('a');
		btnIngresarAdministrador.setForeground(new Color(202, 220, 247));
		btnIngresarAdministrador.setFont(new Font("Sitka Text", Font.BOLD, 17));
		panelContenido.add(btnIngresarAdministrador);
		
		EstiloBoton btnIngresarProfesor = new EstiloBoton("Administrador");
		btnIngresarProfesor.setSelectedIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconteacher.png")));
		btnIngresarProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				BanderaUsuario = 1;
				inicio.setDato(BanderaUsuario);
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
				Pagina_inicio.this.setVisible(false);
			}
		});
		btnIngresarProfesor.setBackground(new Color(5, 25, 45));
		btnIngresarProfesor.setIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconteacher.png")));
		btnIngresarProfesor.setText("Profesor");
		btnIngresarProfesor.setMnemonic('a');
		btnIngresarProfesor.setForeground(new Color(202, 220, 247));
		btnIngresarProfesor.setFont(new Font("Sitka Text", Font.BOLD, 17));
		panelContenido.add(btnIngresarProfesor);
		
		EstiloBoton btnIngresarAlumno = new EstiloBoton("Administrador");
		btnIngresarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio_de_sesion inicio = new Inicio_de_sesion();
				BanderaUsuario = 2;
				inicio.setDato(BanderaUsuario);
				inicio.setLocationRelativeTo(null);
				inicio.setVisible(true);
				Pagina_inicio.this.setVisible(false);
			}
		});
		btnIngresarAlumno.setBackground(new Color(5, 25, 45));
		btnIngresarAlumno.setIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconstudent.png")));
		btnIngresarAlumno.setText("Alumno");
		btnIngresarAlumno.setMnemonic('a');
		btnIngresarAlumno.setForeground(new Color(202, 220, 247));
		btnIngresarAlumno.setFont(new Font("Sitka Text", Font.BOLD, 17));
		panelContenido.add(btnIngresarAlumno);
		
	}
	
}
