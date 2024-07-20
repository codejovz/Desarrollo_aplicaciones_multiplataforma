import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner sp1,sp2;
	private JComboBox<String> comboBox;

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
		setBounds(100, 100, 1095, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setBounds(44, 32, 61, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMargenSuperior = new JLabel("Margen superior");
		lblMargenSuperior.setBounds(154, 36, 118, 20);
		contentPane.add(lblMargenSuperior);
		
		JLabel lblOrientacinDeLa = new JLabel("Orientación de la pagina");
		lblOrientacinDeLa.setBounds(321, 36, 162, 20);
		contentPane.add(lblOrientacinDeLa);
		
		JLabel lblMargenInferior = new JLabel("Margen inferior");
		lblMargenInferior.setBounds(154, 123, 118, 20);
		contentPane.add(lblMargenInferior);
		
		JButton btnNewButton = new JButton("Inicializar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setValue(0);
				sp2.setValue(0);
				comboBox.setSelectedIndex(0);
				repaint();
			}
		});
		btnNewButton.setBounds(22, 241, 166, 33);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
		comboBox.setToolTipText("");
		comboBox.setBounds(321, 60, 162, 21);
		contentPane.add(comboBox);
		comboBox.addItem("Horizontal");
		comboBox.addItem("Vertical");
		sp1 = new JSpinner();
		sp1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		sp1.setBounds(164, 66, 65, 20);
		contentPane.add(sp1);
		
		sp2 = new JSpinner();
		sp2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		sp2.setBounds(174, 148, 65, 20);
		contentPane.add(sp2);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(30, 80, 100, 140);
		
		int ms= Integer.parseInt(sp1.getValue().toString());
		int mi= Integer.parseInt(sp2.getValue().toString());
		
		g.setColor(Color.red);
		g.drawLine(30, 80+ms,130 , 80+ms);
		g.drawLine(30, 220-mi,130 , 220-mi);
		
		String direccion=(String)comboBox.getSelectedItem();
		if(direccion.equals("Horizontal")) {
			g.drawRect(320, 120, 200, 100);
		}else {
			g.drawRect(320, 120, 100, 200);
		}
		
	}
	

	
}
