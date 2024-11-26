
//Se le pide al usuario nombre de usuario y contraseña
//Si es usuario(juan) y contraseña(abc123):
//Se pone de titulo 'correcto'


package ejer10propuesto;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	private JTextField nombretf, clavetf;
	private JButton confirmar;
	private String nombre,clave;
	private String nombrev,clavev;
	private JLabel label1;
	private JLabel label2;
	
	public Formulario() {
		setLayout(null);
		nombretf=new JTextField();
		nombretf.setBounds(100,10,100,20);
		add(nombretf);
		clavetf=new JTextField();
		clavetf.setBounds(100,40,100,20);
		add(clavetf);
		confirmar=new JButton("Confirmar");
		confirmar.setBounds(120,120,100,20);
		add(confirmar);
		confirmar.addActionListener(this);
		label1=new JLabel("Usuario");
		label1.setBounds(0,10,100,20);
		add(label1);
		label2=new JLabel("Contraseña");
		label2.setBounds(0,30,100,20);
		add(label2);
	}
	
	public void actionPerformed(ActionEvent e) {
		String nombrev="juan";
		String clavev="abc123";
		if(e.getSource()==confirmar) {
			String nombre=nombretf.getText();
			String clave=clavetf.getText();
			
			if(nombre.equals(nombrev)&&clave.equals("abc123")) {
				setTitle("Correcto");
				
			}else {
				setTitle("Contraseña incorrecta");
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		Formulario fm1= new Formulario();
		fm1.setBounds(0,0,400,200);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
