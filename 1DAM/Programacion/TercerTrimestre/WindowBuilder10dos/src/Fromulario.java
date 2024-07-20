import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Fromulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fromulario frame = new Fromulario();
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
	public Fromulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		int fila=8;
		
		for(int r=1;r<=255;r=r++) {
			
		
		for(int rojo=2;rojo<255;rojo++) {
			
			if(fila%8==0) {
				fila=fila+8;
				
			}
			
			Color col=new Color(rojo,0,0);
			g.setColor(col);
			g.drawLine(0, fila, 1000, r);
			
			
		}
		
		}
		
	}
	
	
	

}
