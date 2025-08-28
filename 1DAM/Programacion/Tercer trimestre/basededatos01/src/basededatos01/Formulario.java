package basededatos01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
//////////////////////////////////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//////////////////////////////////////////////////

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;    

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

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
		setBounds(100, 100, 555, 445);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Descripcion del articulo:");
		label1.setBounds(55, 37, 190, 33);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Precio:");
		label2.setBounds(55, 80, 132, 33);
		contentPane.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(255, 44, 180, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(255, 87, 180, 19);
		contentPane.add(tf2);
		
		JLabel label4 = new JLabel("Introduce codigo de articulo a consultar:");
		label4.setBounds(55, 271, 238, 13);
		contentPane.add(label4);
		
		tf3 = new JTextField();
		tf3.setBounds(313, 268, 96, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JLabel labelResultado = new JLabel("Resultado");
		labelResultado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelResultado.setBounds(345, 151, 186, 13);
		contentPane.add(labelResultado);
		
		JButton boton1 = new JButton("Alta");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				labelResultado.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("insert into articulos(descripcion,precio)values('"+tf1.getText()+"',"+tf2.getText()+")");
							//EXECUTE UPDATE
					conexion.close();
					labelResultado.setText("Se registraron todos los datos.");
					tf1.setText("");
					tf2.setText("");	
						
				}catch(SQLException se){
					setTitle(se.getMessage());
					
				}
				
			}
		});
		boton1.setBounds(250, 147, 85, 21);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Consultar codigo");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");
				tf1.setText("");
				tf2.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					ResultSet registro = comando.executeQuery("select descripcion,precio from articulos where codigo="+tf3.getText());
												//EXECUTE QUERY
					if(registro.next()==true) {
						tf1.setText(registro.getString("descripcion"));
						tf2.setText(registro.getString("precio"));
					}else {
						labelResultado.setText("No existe un articulo con dicho código.");
					}
					
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
				
			}
		});
		boton2.setBounds(55, 309, 132, 21);
		contentPane.add(boton2);
		
	}
}
