//Usuario selecciona entre tres checkbox
//Se pone de titulo los que esten seleccionados


package ejer22propuesto;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ChangeListener{
	
	private JCheckBox checkbox1,checkbox2,checkbox3;
	
	
	
	public Formulario() {
		setLayout(null);
		
		checkbox1=new JCheckBox("Google");
		checkbox1.setBounds(20,20,200,30);
		checkbox1.addChangeListener(this);
		add(checkbox1);
		
		checkbox2= new JCheckBox("Mozilla");
		checkbox2.setBounds(20,50,200,30);
		checkbox2.addChangeListener(this);
		add(checkbox2);
		
		checkbox3= new JCheckBox("Internet Explorer");
		checkbox3.setBounds(20,80,200,30);
		checkbox3.addChangeListener(this);
		add(checkbox3);
		
		
	}
	
	
	public void stateChanged(ChangeEvent e) {
		
		String cad="";
		
		if(checkbox1.isSelected()==true) {
			cad=cad+"Google ";
		}
		
		if(checkbox2.isSelected()==true) {
			cad=cad+"Mozilla ";
		}
		
		if(checkbox3.isSelected()==true) {
			cad=cad+"Internet Explorer";
		}
		
		
		setTitle(cad);
		
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		Formulario fm1= new Formulario();
		fm1.setBounds(0,0,400,300);
		fm1.setVisible(true);
	}
	
	

}
