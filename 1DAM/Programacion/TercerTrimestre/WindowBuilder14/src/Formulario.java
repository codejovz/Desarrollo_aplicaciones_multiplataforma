import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int opcion=1;
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
		setBounds(100, 100, 1189, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("velocidad de despazamiento");
		label1.setBounds(65, 37, 179, 24);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Selección del botón");
		label2.setBounds(283, 37, 114, 24);
		contentPane.add(label2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(65, 71, 117, 20);
		contentPane.add(spinner);
		
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.addItem("Izquierdo");
		comboBox.addItem("Derecho");
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(comboBox.getSelectedItem()=="Izquierdo") {
					opcion=1;
					repaint();
				}else {
					
					opcion=2;
					repaint();
				}

				JLabel label3 = new JLabel("Razer");
				label3.setFont(new Font("Stencil", Font.PLAIN, 13));
				label3.setBounds(488, 43, 67, 48);
				contentPane.add(label3);
				
			}
		});
		comboBox.setBounds(283, 71, 114, 21);
		contentPane.add(comboBox);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(290, 160, 130, 200);
		
		g.setColor(Color.white);
		g.fillRect(300, 170, 110, 180);
		
		if(opcion==1) {
			g.setColor(Color.black);
			g.fillRect(290, 160, 65, 65);
			g.setColor(Color.red);
			g.fillOval(290,162,59,59);
			
		}else {
			g.setColor(Color.black);
			g.fillRect(350, 160, 65, 65);
			g.setColor(Color.red);
			g.fillOval(350, 162, 59, 59);
			
		}
		
		
		
	}
	
	
	public void nuevo() {
		JLabel label4=new JLabel("Holaaaaa");
		label4.setBounds(250,200,130,30);
		add(label4);
	}
	
}
