import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private boolean bandera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 545, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Partido 1");
		label1.setBounds(10, 28, 71, 22);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Partido 2");
		label2.setBounds(10, 69, 71, 22);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Partido 3");
		label3.setBounds(10, 109, 71, 22);
		contentPane.add(label3);
		
		tf1 = new JTextField();
		tf1.setBounds(127, 30, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(127, 71, 96, 19);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(127, 111, 96, 19);
		contentPane.add(tf3);
		
		JButton boton1 = new JButton("Graficar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera=true;
				repaint();
			}
		});
		boton1.setBounds(301, 70, 85, 21);
		contentPane.add(boton1);
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		if(bandera==true) {
			
			String s1=tf1.getText();
			String s2=tf2.getText();
			String s3=tf3.getText();
			
			int v1=Integer.parseInt(s1);
			int v2=Integer.parseInt(s2);
			int v3=Integer.parseInt(s3);
			int mayor=retornarMayor(v1,v2,v3);
			
			int largo1=v1*400/mayor;
			int largo2=v2*400/mayor;
			int largo3=v3*400/mayor;
			
			g.setColor(new Color(255,0,0));
			g.fillRect(100,250,largo1,40);
			g.drawString("Partido 1", 20, 270);
			
			g.setColor(new Color(0,128,0));
			g.fillRect(100,300,largo2,40);
			g.drawString("Partido 2", 20, 320);
			
			g.setColor(new Color(0,0,255));
			g.fillRect(100,350,largo3,40);
			g.drawString("Partido 3", 20, 370);
			
			
		}
		
	}
	
	private int retornarMayor(int v1,int v2, int v3) {
		
		if(v1>v2 && v1>v3) {
			return v1;
		}else {
			if(v2>v3) {
				return v2;
			}else {
				return v3;
			}
		}
		
	}
	
	
	
	
	
}
