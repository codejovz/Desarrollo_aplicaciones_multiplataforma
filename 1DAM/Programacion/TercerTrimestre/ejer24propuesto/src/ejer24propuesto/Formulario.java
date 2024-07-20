package ejer24propuesto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener, ActionListener{
	
	public JTextField tf1,tf2;
	public JButton boton1;
	public ButtonGroup bg;
	public JRadioButton rb1,rb2;
	public int estado;
	
	public Formulario() {
		
		setLayout(null);
		
		tf1= new JTextField();
		tf1.setBounds(20,20,50,50);
		add(tf1);
		
		bg=new ButtonGroup();
		rb1= new JRadioButton("Sumar");
		rb1.setBounds(20,90,150,30);
		rb1.addChangeListener(this);
		bg.add(rb1);
		add(rb1);
		
		
		rb2= new JRadioButton("Restar");
		rb2.setBounds(20,130,150,30);
		bg.add(rb2);
		rb2.addChangeListener(this);
		add(rb2);
		
		tf2= new JTextField();
		tf2.setBounds(90,20,50,50);
		add(tf2);
		
		boton1= new JButton("=");
		boton1.setBounds(140,20,50,50);
		add(boton1);
		boton1.addActionListener(this);
		
		
		
	}
	
	
	public void stateChanged(ChangeEvent e) {
		
		if(rb1.isSelected()) {
			estado=1;
		}
		
		if(rb2.isSelected()) {
			estado=2;
		}
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(estado);
		
		if(e.getSource()==boton1) {
			
			String num1t= tf1.getText();
			String num2t= tf2.getText();
			
			int num1=Integer.parseInt(num1t);
			int num2=Integer.parseInt(num2t);
			
			int solucion=0;
			
			if(estado==1) {
				
				solucion=num1+num2;
				
			}
			
			if(estado==2) {
				
				solucion=num1-num2;
				
			}
			
			String soluciont=Integer.toString(solucion);
			setTitle(soluciont);
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		Formulario fm= new Formulario();
		fm.setBounds(0,0,700,400);
		fm.setVisible(true);
		
		
	}
	
	
	

}
