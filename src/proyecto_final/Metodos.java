package proyecto_final;

import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;


public class Metodos {

	public Metodos() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void Personalizar_frame () {
		FlatDarkLaf.setup();
        UIManager.put( "Button.arc", 30);
	}
	
	public static void Personalizar_tablas (JTable tabla) {
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabla.setRowSelectionAllowed(true);
		tabla.setFillsViewportHeight(true);
	}

	
	
}
