import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ventana5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int comparar;
	private int num1;
	private JPanel contentPane;
	private JLabel labelDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 frame = new Ventana5();
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
	public Ventana5() {
		comparar=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label1 = new JLabel("piso");
		label1.setBounds(167, 66, 45, 13);
		contentPane.add(label1);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(167, 107, 66, 13);
		contentPane.add(lblDireccion);
		
		JLabel labelPiso = new JLabel("1");
		labelPiso.setBounds(263, 66, 45, 13);
		contentPane.add(labelPiso);
		
		labelDireccion = new JLabel("baja");
		labelDireccion.setBounds(263, 107, 45, 13);
		contentPane.add(labelDireccion);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelPiso.setText("4");
				if(4>comparar) {
					labelDireccion.setText("Subir");
				}
				
				if(4<comparar) {
					labelDireccion.setText("Bajar");
				}
				
				comparar=4;
				
				
			}
		});
		boton4.setBounds(66, 47, 50, 50);
		contentPane.add(boton4);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelPiso.setText("3");
				if(3>comparar) {
					labelDireccion.setText("Subir");
				}
				
				if(3<comparar) {
					labelDireccion.setText("Bajar");
				}
				
				comparar=3;
			}
		});
		boton3.setBounds(66, 107, 50, 50);
		contentPane.add(boton3);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelPiso.setText("2");
				if(2>comparar) {
					labelDireccion.setText("Subir");
				}
				
				if(2<comparar) {
					labelDireccion.setText("Bajar");
				}
				
				comparar=2;
			}
		});
		boton2.setBounds(66, 171, 50, 50);
		contentPane.add(boton2);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelPiso.setText("1");
				if(1>comparar) {
					labelDireccion.setText("Subir");
				}
				
				if(1<comparar) {
					labelDireccion.setText("Bajar");
				}
				
				comparar=1;
			}
		});
		boton1.setBounds(66, 242, 50, 50);
		contentPane.add(boton1);
		

	}

}
