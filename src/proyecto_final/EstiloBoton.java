package proyecto_final;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import com.formdev.flatlaf.FlatDarkLaf;

public class EstiloBoton extends JButton {

	public EstiloBoton(String texto) { 
	    super(texto);

	    this.setBackground(new Color(5,25,45));
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setIconTextGap(15);
        
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                setBackground(new Color(26,55,77)); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setBackground(new Color(5,25,45)); // 
            }
        });
    }
}