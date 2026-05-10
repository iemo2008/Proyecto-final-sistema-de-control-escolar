package proyecto_final;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;

public class EstiloBoton extends JButton {

	public EstiloBoton(String texto) { 
	    super(texto);

	    this.setBackground(new Color(26, 55, 77));
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                setBackground(new Color(10,55,77)); // Cambia al color claro al entrar
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setBackground(new Color(26,55,77)); // Regresa al original al salir
            }
        });
    }
}