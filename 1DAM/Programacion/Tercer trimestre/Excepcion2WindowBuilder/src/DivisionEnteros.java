import java.awt.EventQueue;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisionEnteros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	public Scanner teclado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisionEnteros frame = new DivisionEnteros();
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
	public DivisionEnteros() {
		
		teclado=new Scanner(System.in);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1191, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(117, 44, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(117, 73, 96, 19);
		contentPane.add(tf2);
		
		JButton boton1 = new JButton("Dividir");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String s1=tf1.getText();
					String s2=tf2.getText();
					
					int num1=Integer.parseInt(s1);
					int num2=Integer.parseInt(s2);
					
					int solu=num1/num2;
					
					String solus=Integer.toString(solu);
					setTitle(solus);
				}catch(NumberFormatException ex){
					
					setTitle("Numeros enteros");
				}catch(ArithmeticException ex) {
					setTitle("No dividas por 0");
				}
				
				
				
				
				
				
			}
		});
		boton1.setBounds(42, 117, 111, 41);
		contentPane.add(boton1);
	}
}
