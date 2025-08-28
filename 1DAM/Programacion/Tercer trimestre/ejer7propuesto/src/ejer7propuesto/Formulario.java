//Con un boton cada uno, poner de título varón/mujer.



package ejer7propuesto;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	private JButton varon,mujer;
	
	public Formulario() {
		setLayout(null);
		varon=new JButton("varon");
		varon.setBounds(10,100,100,20);
		add(varon);
		varon.addActionListener(this);
		mujer=new JButton("mujer");
		mujer.setBounds(140,100,100,20);
		add(mujer);
		mujer.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==varon) {
			setTitle("Varón");
		}
		if(e.getSource()==mujer) {
			setTitle("Mujer");
		}
		
	}
	
	public static void main(String[]args) {
		Formulario fm1= new Formulario();
		fm1.setBounds(0,0,400,400);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
