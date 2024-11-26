package ejer1;

import javax.swing.*;

public class Formulario extends JFrame{
	
	private JLabel label1;
	public Formulario() {
		setLayout(null);
		label1=new JLabel("Hola mundo");
		label1.setBounds(160,100,200,20);
		add(label1);
		
	}
	
	
	
	public static void main(String[]args) {
		Formulario formulario1= new Formulario();
		formulario1.setBounds(160,300,400,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
