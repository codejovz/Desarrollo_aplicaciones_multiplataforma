package basededatos02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

//Execute query y execute update

//////////////////////////////////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//////////////////////////////////////////////////

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
		setBounds(100, 100, 845, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Descripción del artículo:");
		label1.setBounds(10, 26, 177, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Precio:");
		label2.setBounds(10, 64, 177, 13);
		contentPane.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(215, 23, 188, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(215, 61, 102, 19);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(215, 133, 102, 19);
		contentPane.add(tf3);
		
		JLabel label3 = new JLabel("resultado");
		label3.setBounds(334, 136, 438, 13);
		contentPane.add(label3);
		
		JButton boton1 = new JButton("Consultar por código");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf1.setText("");
				tf2.setText("");
				
				try {
					
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					
					ResultSet registro = comando.executeQuery("select descripcion,precio from articulos where codigo="+tf3.getText());
					
					if(registro.next()==true) {
						tf1.setText(registro.getString("descripcion"));
						tf2.setText(registro.getString("precio"));
						
					}else {
						label3.setText("No existe un artículo con dicho código");
					}
					
					conexion.close();
					
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
				
				
			}
		});
		boton1.setBounds(10, 132, 160, 21);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Borrar");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label3.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					
					int cantidad=comando.executeUpdate("delete from articulos where codigo="+tf3.getText());
					
					if(cantidad==1) {
						tf1.setText("");
						tf2.setText("");
						label3.setText("Se borró el artículo con dicho código");
					}else {
						label3.setText("No existe un articulo con ese codigo");
					}
					conexion.close();
					
					
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
				
			}
		});
		boton2.setBounds(10, 176, 160, 21);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Modificar");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label3.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					
					int cantidad=comando.executeUpdate("update articulos set descripcion='"+tf1.getText()+"',"+"precio="+tf2.getText()+"where codigo="+tf3.getText());
					
					if(cantidad==1) {
						label3.setText("Se modifico la desc y precio.");
					}else {
						label3.setText("No existe un articulo con ese codigo");
					}
					
					
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}

			}
		});
		boton3.setBounds(10, 219, 160, 21);
		contentPane.add(boton3);
	}
}
