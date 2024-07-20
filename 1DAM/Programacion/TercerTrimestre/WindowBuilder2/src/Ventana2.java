import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Primer valor:");
		label1.setBounds(57, 45, 124, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Segundo valor:");
		label2.setBounds(57, 91, 124, 13);
		contentPane.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(284, 42, 114, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(284, 88, 114, 19);
		contentPane.add(tf2);
		
		JLabel label3 = new JLabel("Resultado");
		label3.setBounds(380, 164, 45, 13);
		contentPane.add(label3);
		
		JButton boton1 = new JButton("Sumar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				repaint();
				
				String num1t=tf1.getText();
				String num2t= tf2.getText();
				
				int num1=Integer.parseInt(num1t);
				int num2=Integer.parseInt(num2t);
				
				int solucion=num1+num2;
				
				String soluciont=Integer.toString(solucion);
				
				label3.setText(soluciont);
			}
		});
		boton1.setBounds(252, 160, 85, 21);
		contentPane.add(boton1);
		

	}

}
