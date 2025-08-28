package ejer4propuesto;

import javax.swing.*;

public class Formulario4 extends JFrame{
	
	private JLabel label1,label2, label3;
	
	public Formulario4() {
		
		setLayout(null);
		label1=new JLabel("Primero que");
		label1.setBounds(20,20,100,100);
		add(label1);
		label2=new JLabel("nada:");
		label2.setBounds(20,20,200,200);
		add(label2);
		label3= new JLabel("Buenas tardes");
		label3.setBounds(20,20,300,300);
		add(label3);
		
	}
	
	public static void main(String[]args) {
		
		Formulario4 fm4=new Formulario4();
		fm4.setBounds(20,20,500,500);
		fm4.setVisible(true);
		fm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
		
	
		
		
		
}
