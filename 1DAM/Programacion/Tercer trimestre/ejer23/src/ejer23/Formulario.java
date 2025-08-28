package ejer23;

import javax.swing.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener{
	
	private JRadioButton radio1,radio2,radio3,radio4;
	private ButtonGroup bg;
	public Formulario() {
		setLayout(null);
		bg= new ButtonGroup();
		radio1= new JRadioButton("640*480");
		radio1.setBounds(10,20,100,30);
		bg.add(radio1);
		radio1.addChangeListener(this);
		add(radio1);
		
		radio2= new JRadioButton("800*600");
		radio2.setBounds(10,70,100,30);
		bg.add(radio2);
		radio2.addChangeListener(this);
		add(radio2);
		
		radio3= new JRadioButton("1024*768");
		radio3.setBounds(10,120,100,30);
		radio3.addChangeListener(this);
		bg.add(radio3);
		add(radio3);
		
		radio4= new JRadioButton("Max");
		radio4.setBounds(10,170,100,30);
		radio4.addChangeListener(this);
		bg.add(radio4);
		add(radio4);
	}
	
	
	public void stateChanged(ChangeEvent e) {
		
		if(radio1.isSelected()) {
			setSize(640,480);
		}
		
		if(radio2.isSelected()) {
			setSize(800,600);
		}
		
		if(radio3.isSelected()) {
			setSize(1024,768);
		}
		
		if(radio4.isSelected()) {
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		}
		
	}
	
	public static void main(String[]args) {
		
		Formulario fm= new Formulario();
		fm.setBounds(0,0,700,400);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
