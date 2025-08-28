//Menu que permite redimensionar ventana
//o salir

package ejer19propuesto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Formulario extends JFrame implements ActionListener{
	
	private JTextField textfield1, textfield2;
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2;
	private JButton boton1,boton2;
	
	public Formulario() {
		setLayout(null);
		
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1= new JMenu("Opciones");
		mb.add(menu1);
		mi1= new JMenuItem("Redimensionar ventana");
		mi1.addActionListener(this);
		menu1.add(mi1);
		mi2=new JMenuItem("Salir");
		mi2.addActionListener(this);
		menu1.add(mi2);
		
		textfield1= new JTextField();
		textfield1.setBounds(20,100,100,30);
		add(textfield1);
		textfield2= new JTextField();
		textfield2.setBounds(20,140,100,30);
		add(textfield2);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mi1) {
			String dim1= textfield1.getText();
			String dim2= textfield2.getText();
			int dim1int= Integer.parseInt(dim1);
			int dim2int= Integer.parseInt(dim2);
			setSize(dim1int,dim2int);
		}
		
		if(e.getSource()==mi2) {
			System:System.exit(0);
		}
		
	}
	
	
	public static void main(String[]args) {
		Formulario fm1=new Formulario();
		fm1.setBounds(0,0,400,300);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
