package ejer6;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JButton boton1,boton2,boton3;
	public Formulario() {
		setLayout(null);
		boton1= new JButton("1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		boton2= new JButton("2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		boton3= new JButton("3");
		boton3.setBounds(210,100,90,30);
		add(boton3);
		boton3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			setTitle("Boton 1");
		}
		if(e.getSource()==boton2) {
			setTitle("Boton 2");
		}
		if(e.getSource()==boton3) {
			setTitle("Boton 3");
		}
	}
	
	public static void main(String[]args) {
		
		Formulario fm1=new Formulario();
		fm1.setBounds(0,0,350,200);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
