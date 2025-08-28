package ejer2;

import javax.swing.*;

public class Formulario2 extends JFrame{
	
	public Formulario2() {
		setLayout(null);
	}
	
	public static void main(String[]args) {
		Formulario2 fm2= new Formulario2();
		fm2.setBounds(10,20,400,300);
		fm2.setVisible(true);
		fm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm2.setResizable(false);
		
	}

}
