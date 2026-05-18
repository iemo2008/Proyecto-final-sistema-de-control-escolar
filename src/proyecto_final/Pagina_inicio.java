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
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Pagina_inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		contentPane = new JPanel();
		contentPane.setForeground(new Color(194, 216, 237));
		contentPane.setBackground(new Color(72, 72, 72));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		btnIngresarAdministrador.setIcon(new ImageIcon(Pagina_inicio.class.getResource("/iconos/iconadmin.png")));
		btnIngresarAdministrador.setBackground(new Color(5, 25, 45));
		btnIngresarAdministrador.setMnemonic('a');
		btnIngresarAdministrador.setForeground(new Color(202, 220, 247));
		btnIngresarAdministrador.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnIngresarAdministrador.setBounds(10, 110, 212, 162);
		contentPane.add(btnIngresarAdministrador);
		
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
		btnIngresarProfesor.setBounds(245, 110, 204, 162);
		contentPane.add(btnIngresarProfesor);
		
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
		btnIngresarAlumno.setBounds(473, 110, 204, 162);
		contentPane.add(btnIngresarAlumno);
		
		JLabel lblNewLabel = new JLabel("SELECCIONE SU PERFIL");
		lblNewLabel.setBackground(new Color(202, 220, 247));
		lblNewLabel.setForeground(new Color(202, 220, 247));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel.setBounds(220, 54, 263, 28);
		contentPane.add(lblNewLabel);
		
	}
	
}
