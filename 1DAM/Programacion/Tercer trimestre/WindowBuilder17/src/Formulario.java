import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private boolean bandera;
	public String largo1s,largo2s,largo3s;
	public int largo1,largo2,largo3;

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
		setBounds(100, 100, 674, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Graficar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String s1=tf1.getText();
				String s2=tf2.getText();
				String s3=tf3.getText();
				
				int v1=Integer.parseInt(s1);
				int v2=Integer.parseInt(s2);
				int v3=Integer.parseInt(s3);
				
				int max=400;
				int total=v1+v2+v3;
			
				largo1=max/total*v1;
				largo2=max/total*v2;
				largo3=max/total*v3;;
				
				
				
				largo1s=Integer.toString(largo1/4)+"%";
				largo2s=Integer.toString(largo2/4)+"%";
				largo3s=Integer.toString(largo3/4)+"%";
				
				
				
				bandera=true;
				repaint();
				
			}
		});
		boton1.setBounds(47, 127, 104, 33);
		contentPane.add(boton1);
		
		tf1 = new JTextField();
		tf1.setBounds(150, 21, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel label1 = new JLabel("Partido 1:");
		label1.setBounds(30, 24, 77, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Partido 2:");
		label2.setBounds(30, 58, 77, 13);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Partido 3:");
		label3.setBounds(30, 93, 77, 13);
		contentPane.add(label3);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(150, 55, 96, 19);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(150, 90, 96, 19);
		contentPane.add(tf3);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		
		if(bandera==true) {
			
			
			
			g.setColor(new Color(180,0,0));
			g.fillRect(20, 250, largo1, 40);
			
			g.setColor(new Color(0,180,0));
			g.fillRect(largo1, 250, largo2, 40);
			
			g.setColor(Color.blue);
			g.fillRect(largo1+largo2, 250, largo3, 40);
			
			
			g.setColor(Color.white);
			g.drawString(largo1s, 24, 270);
			
			g.drawString(largo2s, largo1+4, 270);
			
			g.drawString(largo3s, largo1+largo2+4, 270);
			
			
		}
		
		

		
	}
	
	
	
	

}
