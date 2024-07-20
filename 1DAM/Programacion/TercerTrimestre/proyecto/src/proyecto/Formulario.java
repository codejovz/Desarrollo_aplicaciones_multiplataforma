package proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	//Menú main
	JMenuBar mb;
	JMenu menu1,menu2;
	JMenuItem mi1,mi2,mi3,mi4;
	
	
	//correo
	JLabel label1,label2,label3,label4,label5,label6,tapar;
	JButton boton1,comprobar;
	JTextField tf1;
	
	//Calculadora:
	JTextPane tp1,tp2;
	JComboBox<String> cb1;
	
	public Formulario() {
		setLayout(null);
		setSize(300,200);
		mb= new JMenuBar();
		setJMenuBar(mb);
		menu1=new JMenu("Proyectos");
		mb.add(menu1);
		mi1=new JMenuItem("Calculadora");
		mi1.addActionListener(this);
		mi2=new JMenuItem("Comprobar correo");
		mi2.addActionListener(this);
		menu1.add(mi1);
		menu1.add(mi2);
		
		menu2= new JMenu("Incomming...");
		mb.add(menu2);
		mi3=new JMenuItem("...");
		menu2.add(mi3);
		
		tf1=new JTextField();
		
		tp1= new JTextPane();
		tp2= new JTextPane();
		cb1= new JComboBox<String>();
		boton1=new JButton("=");
		label1= new JLabel("");
		label2= new JLabel();
		label3= new JLabel();
		label4= new JLabel();
		label5= new JLabel();
		label6= new JLabel();
		comprobar= new JButton("Comprobar");
		
	}


	void calculadora() {
		repaint();
		label1.setText("");
		tf1.setBounds(-50,50,1,1);
		comprobar.setBounds(-50,50,1,1);
		label2.setBounds(-50,50,1,1);
		label3.setBounds(-50,50,1,1);
		label4.setBounds(-50,50,1,1);
		label5.setBounds(-50,50,1,1);
		label6.setBounds(-50,50,1,1);
		setTitle("Calculadora");
		setSize(400,200);
		System.out.println("calculadora running...");
		
		
		tp1.setBounds(10,10,50,50);
		add(tp1);
		
		tp2.setBounds(150,10,50,50);
		add(tp2);
		
		cb1.setBounds(80,10,50,50);
		cb1.addItem("+");
		cb1.addItem("-");
		cb1.addItem("*");
		cb1.addItem("/");
		add(cb1);
		
		
		boton1.setBounds(210,10,50,50);
		add(boton1);
		boton1.addActionListener(this);
		
		
		label1.setBounds(290,10,50,50);
		add(label1);
		
	}
	
	void comprobar_correo() {
		System.out.println("comprobador_correo running...");
		
		tp1.setBounds(-50,50,1,1);
		tp2.setBounds(-50,-50,1,1);
		cb1.setBounds(-50,50,1,1);
		boton1.setBounds(-50,50,1,1);
		
		
		setSize(700,400);
		repaint();
		setLayout(null);
		label1.setText("Introduce correo:");
		label1.setBounds(20,20,150,30);
		add(label1);
		
		
		tf1.setBounds(20,60,150,30);
		add(tf1);
		
		comprobar.setBounds(20,100,150,30);
		comprobar.addActionListener(this);
		add(comprobar);
		
		
		label2.setBounds(200,20,200,30);
		add(label2);
		
		
		label3.setBounds(200,60,200,30);
		add(label3);
		
		
		label4.setBounds(200,100,280,30);
		add(label4);
		
		
		label5.setBounds(200,140,280,30);
		add(label5);
		
		
		label6.setBounds(200,180,280,30);
		add(label6);
		
		setTitle("Comprobador correo");
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mi1) {
			calculadora();
		}
		
		if(e.getSource()==mi2) {
			comprobar_correo();
		}
		
		if(e.getSource()==boton1) {
			repaint();
			
			String num1t=tp1.getText();
			String num2t=tp2.getText();
		
			int num1=0, num2=0;
			
			if(num1t!="") {
				 num1= Integer.parseInt(num1t);
			}else {
				num1=0;
			}
			
			if(num2t!="") {
				 num2= Integer.parseInt(num2t);
			}else {
				num2=0;
			}
			
			int solucion=0;
			
			if(cb1.getSelectedItem()=="+") {
				label1.setText("");
			    solucion=num1+num2;
				String soluciont= Integer.toString(solucion);
				setTitle(soluciont);
				tp1.setText(soluciont);
				tp2.setText("");
			}
			
			
			if(cb1.getSelectedItem()=="-") {
				label1.setText("");
				solucion=num1-num2;
				String soluciont= Integer.toString(solucion);
				setTitle(soluciont);
				tp1.setText(soluciont);
				tp2.setText("");
			}
			
			if(cb1.getSelectedItem()=="*") {
				label1.setText("");
			    solucion=num1*num2;
				String soluciont= Integer.toString(solucion);
				setTitle(soluciont);
				tp1.setText(soluciont);
				tp2.setText("");
			}
			
			if(cb1.getSelectedItem()=="/" &&num2!=0) {
				label1.setText("");
			    solucion=num1/num2;
				String soluciont= Integer.toString(solucion);
				setTitle(soluciont);
				tp1.setText(soluciont);
				tp2.setText("");
				label1.setText("");
			}else {
				if(cb1.getSelectedItem()=="/" &&num2==0) {
					label1.setText("Error");
				}
				
			}
			
		}
		
		
		
		if(e.getSource()==comprobar) {
			setSize(700,400);
			setLayout(null);
			
			repaint();
			
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
		fm.setBounds(0,0,700,400);
		fm.setVisible(true);
		
	}

}
