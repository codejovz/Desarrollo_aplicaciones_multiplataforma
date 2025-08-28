package menuHard;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Formulario extends JFrame implements ActionListener{
	
	public JLabel label1,label2, label3, label4, label5, label6;
	public JTextField tf1;
	public JButton boton1;
	
	public Formulario() {
		
		setLayout(null);
		label1= new JLabel("Introduce correo:");
		label1.setBounds(20,20,150,30);
		add(label1);
		
		tf1= new JTextField();
		tf1.setBounds(20,60,150,30);
		add(tf1);
		
		boton1= new JButton("Comprobar");
		boton1.setBounds(20,100,150,30);
		boton1.addActionListener(this);
		add(boton1);
		
		label2= new JLabel();
		label2.setBounds(200,20,200,30);
		add(label2);
		
		label3= new JLabel();
		label3.setBounds(200,60,200,30);
		add(label3);
		
		label4= new JLabel();
		label4.setBounds(200,100,280,30);
		add(label4);
		
		label5= new JLabel();
		label5.setBounds(200,140,280,30);
		add(label5);
		
		label6= new JLabel();
		label6.setBounds(200,180,280,30);
		add(label6);
		
		setTitle("Comprobador correo");
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
		
			String correo=tf1.getText().toString();
			
			label2.setText("Tu correo es: "+correo);
			
			int posArroba=-1;
			
			posArroba=correo.indexOf('@');
			
			int cont=0;
			
			for(int x=0; x<correo.length(); x++) {
				
				if(correo.charAt(x)=='@') {
					cont=cont+1;
				}
				
				
			}
			
			
			if(posArroba != -1 && posArroba!=correo.length()-1 && posArroba!=0 && cont==1) {
				
				label3.setText("El correo es válido.");
				label4.setText("Su dominio es: "+ correo.substring(posArroba));
				
			}else {
				label3.setText("El correo no es válido");
				label4.setText("");
			}
			
			
			
			StringBuilder builder= new StringBuilder(correo);
			String alreves= builder.reverse().toString();
			
			label5.setText("El correo al reves es: "+alreves);
			
			if(correo.equals(alreves)) {
				label6.setText("El correo es un palindromo xd");
			}else {
				label6.setText("");
			}
			
			
			repaint();
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		Formulario fm= new Formulario();
		fm.setBounds(0,0,600,300);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}

