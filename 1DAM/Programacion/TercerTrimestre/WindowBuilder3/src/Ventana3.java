import java.awt.Color;
import java.awt.EventQueue;
import java.util.Random;
import java.util.Random.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 482);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("Cambiar color");
		menuBar.add(menu1);
		
		JMenuItem mi1 = new JMenuItem("Rojo");
		mi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(new Color(255,0,0));
			}
		});
		menu1.add(mi1);

		
		JMenuItem mi2 = new JMenuItem("Verde");
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(new Color(0,255,0));
			}
		});
		menu1.add(mi2);

		
		JMenuItem mi3 = new JMenuItem("Azul");
		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(new Color(0,0,255));
			}
		});
		menu1.add(mi3);
		
		JMenuItem mi4 = new JMenuItem("Epiléptico");
		mi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random rand = new Random();
		        int a = rand.nextInt(254);
		        int b = rand.nextInt(254);
		        int c = rand.nextInt(254);
		        
		        for(int x=0;x<10000;x++) {
		        	getContentPane().setBackground(new Color(a,b,c));
		        	contentPane.repaint();
		        }
				
				
				
			}
		});
		menu1.add(mi4);

		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("New menu");
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("New menu");
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("New menu");
		menuBar.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("New menu");
		menuBar.add(mnNewMenu_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	

	
	
}
