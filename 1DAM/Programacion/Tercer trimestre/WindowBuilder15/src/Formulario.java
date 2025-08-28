import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private boolean bandera = false;

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
		setBounds(100, 100, 1210, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(94, 28, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(94, 57, 96, 19);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(94, 86, 96, 19);
		contentPane.add(tf3);
		
		JButton boton1 = new JButton("Graficar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera= true;
				repaint();
			}
		});
		boton1.setBounds(29, 127, 96, 38);
		contentPane.add(boton1);
		
		JLabel label1 = new JLabel("Partido 1: ");
		label1.setBounds(10, 31, 74, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Partido 2: ");
		label2.setBounds(10, 60, 74, 13);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Partido 3: ");
		label3.setBounds(10, 89, 74, 13);
		contentPane.add(label3);
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
			
			int suma=v1+v2+v3;
			
			int grados1=v1*360/suma;
			int grados2=v2*360/suma;
			int grados3= v3*360/suma;
			
			g.setColor(new Color(255,0,0));
			g.fillArc(50, 250, 200, 200, 0, grados1);
			g.fillRect(370, 250, 20,20);
			g.drawString("Partido 1", 400, 270);
			
			g.setColor(new Color(0,128,0));
			g.fillArc(50, 250, 200, 200, grados1, grados2);
			g.fillRect(370, 280, 20,20);
			g.drawString("Partido 2", 400, 300);
			
			g.setColor(new Color(0,0,255));
			g.fillArc(50, 250, 200, 200, grados1+grados2, grados3);
			g.fillRect(370, 310, 20,20);
			g.drawString("Partido 3", 400, 330);
			
		}
		
		
	}
	
	
	
	
}
