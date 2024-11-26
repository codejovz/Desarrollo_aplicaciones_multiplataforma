package ejer14;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{
	
	private JComboBox<String> combo1;
	
	public Formulario() {
		
		setLayout(null);
		combo1= new JComboBox<String>();
		combo1.setBounds(10,10,80,20);
		add(combo1);
		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItemListener(this);
		
	}
	
	
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource()==combo1) {
			
			String seleccionado= (String)combo1.getSelectedItem();
			setTitle(seleccionado);
			
		}
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		Formulario fm1=new Formulario();
		
		fm1.setBounds(0,0,300,150);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
