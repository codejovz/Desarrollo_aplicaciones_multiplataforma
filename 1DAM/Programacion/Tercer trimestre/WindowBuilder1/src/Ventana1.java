import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JLabel;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 453);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce nombre usuario:");
		lblNewLabel.setBounds(50, 43, 148, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce clave");
		lblNewLabel_1.setBounds(50, 81, 123, 13);
		getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(217, 40, 166, 19);
		getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(217, 78, 166, 19);
		getContentPane().add(tf2);
		
		JButton boton1 = new JButton("Aceptar");
		JButton boton2 = new JButton("Cancelar");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==boton2) {
					
					
					
				}
				
			}
		});
		boton2.setBounds(311, 121, 73, 21);
		getContentPane().add(boton2);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==boton1) {
					
					String usuario=tf1.getText();
					String contra=tf2.getText();
					
				}
				
				
				
			}
		});
		boton1.setBounds(217, 121, 85, 21);
		getContentPane().add(boton1);
		
		
	}
}
