package ejer13propuesto;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	private JTextArea textarea1,textarea2;
	private JScrollPane scrollpane1,scrollpane2;
	private JButton boton1;
	private String texto1,texto2;
	
	
	public Formulario() {
		setLayout(null);
		textarea1= new JTextArea();
		scrollpane1=new JScrollPane(textarea1);
		scrollpane1.setBounds(300,10,250,70);
		add(scrollpane1);
		textarea2= new JTextArea();
		scrollpane2= new JScrollPane(textarea2);
		scrollpane2.setBounds(10,10,250,70);
		add(scrollpane2);
		boton1= new JButton("Verificar contenidos");
		boton1.setBounds(40,120,200,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			String texto1=textarea1.getText();
			String texto2=textarea2.getText();
			
			if(texto1.equals(texto2)) {
				setTitle("Los dos controles tienen el mismo texto");
			}else {
				setTitle("no tienen el mismo texto");
			}
			
		}
	}
	
	
	public static void main(String[]args) {
		
		Formulario fm1= new Formulario();
		fm1.setBounds(0,0,600,300);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
