package ejer17;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2,mi3;
	
	public Formulario() {
		
		setLayout(null);

		mb= new JMenuBar();
		setJMenuBar(mb);
		menu1= new JMenu("Opciones");
		mb.add(menu1);
		mi1=new JMenuItem("Rojo");
		mi1.addActionListener(this);
		menu1.add(mi1);
		mi2=new JMenuItem("Verde");
		mi2.addActionListener(this);
		menu1.add(mi2);
		mi3=new JMenuItem("Azul");
		mi3.addActionListener(this);
		menu1.add(mi3);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		Container f= this.getContentPane();
		if(e.getSource()==mi1) {
			f.setBackground(new Color(255,0,0));
		}
		if(e.getSource()==mi2) {
			f.setBackground(new Color(0,255,0));
		}
		if(e.getSource()==mi3) {
			f.setBackground(new Color(0,0,255));
		}
		
	}
	
	public static void main(String[]args) {
		Formulario fm1= new Formulario();
		fm1.setBounds(10,20,300,200);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
