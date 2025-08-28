//Se le pide al usuario su nombre de usuario
//y que seleccione un pais
//Cuando se clicka en el boton, se pone el titulo el usuario y el pais


package ejer16propuesto;

import javax.swing.*;

import java.awt.event.*;



public class Formulario extends JFrame implements ActionListener{
	
	private JLabel label1,label2;
	private JTextField textfield1;
	private JComboBox<String> combobox1;
	private JButton boton1;
	
	public Formulario (){
		setLayout(null);
		label1= new JLabel("Usuario");
		label1.setBounds(10,20,100,30);
		add(label1);
		
		textfield1=new JTextField();
		textfield1.setBounds(80,10,100,30);
		add(textfield1);
		
		label2= new JLabel("Pais");
		label2.setBounds(10,60,100,30);
		add(label2);
		
		
		combobox1=new JComboBox<String>();
		combobox1.setBounds(80,60,100,30);
		add(combobox1);
		combobox1.addItem("España");
		combobox1.addItem("Portugal");
		combobox1.addItem("Francia");
		//combobox1.addItemListener(this);
		
		boton1=new JButton("Confirmar");
		boton1.setBounds(10,120,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		
		
	}
	
	

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			
			String usuario= textfield1.getText();
			String pais=(String)combobox1.getSelectedItem();
			
			setTitle(usuario+" - "+pais);
			
			
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		Formulario fm1= new Formulario();
		fm1.setBounds(0,0,700,400);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
