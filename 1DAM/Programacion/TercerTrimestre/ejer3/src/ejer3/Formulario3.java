package ejer3;

import javax.swing.*;

public class Formulario3 extends JFrame{
	
	private JLabel label1,label2;
	
	public Formulario3() {
		setLayout(null);
		label1=new JLabel("Sistema de facturación ");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2=new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}
	
	public static void main(String[]args) {
		Formulario3 fm3=new Formulario3();
		fm3.setBounds(0,0,300,200);
		fm3.setResizable(false);
		fm3.setVisible(true);
		fm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
}
