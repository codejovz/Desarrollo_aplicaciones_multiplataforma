package ejer11;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {
	
	private JTextField textfield1;
	private JTextArea textarea1;
	private JTextPane textpane1;    //Olvidar el textpane, sirve para dar formato a texto e imagenes.
	
	public Formulario() {
		
		setLayout(null);
		textfield1= new JTextField();
		textfield1.setBounds(10,10,200,30);
		add (textfield1);
		textarea1= new JTextArea();
		textarea1.setBounds(10,50,400,200);
		add (textarea1);
		textpane1= new JTextPane();
		textpane1.setBounds(10,300,400,300);
		add (textpane1);
		
	}
	
	
	public static void main(String[]args) {
		
		Formulario fm1= new Formulario();
		
		fm1.setBounds(0,0,800,800);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
