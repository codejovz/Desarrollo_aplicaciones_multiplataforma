import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int columna;
	private int fila=200;

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
		setBounds(100, 100, 1086, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Izquierda = new JButton("A");
		Izquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(columna>40) {
					
					columna = columna - 10;
					repaint();
					
				}
				

			}
		});
		Izquierda.setBounds(49, 142, 58, 59);
		contentPane.add(Izquierda);
		
		JButton Derecha = new JButton("D");
		Derecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(columna<640) {
					columna=columna+10;
					repaint(10);
				}
				
				
			}
		});
		Derecha.setBounds(158, 142, 58, 59);
		contentPane.add(Derecha);
		
		JButton Arriba = new JButton("W");
		Arriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fila>40) {
					fila=fila-10;
					repaint();	
				}
				
						}
		});
		Arriba.setBounds(104, 84, 58, 59);
		contentPane.add(Arriba);
		
		JButton Abajo = new JButton("S");
		Abajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fila<340) {
					fila=fila+10;
					repaint();
				}
				

			}
		});
		Abajo.setBounds(104, 142, 58, 59);
		contentPane.add(Abajo);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(columna, fila, 100, 100);
	}
	
	
	

}
