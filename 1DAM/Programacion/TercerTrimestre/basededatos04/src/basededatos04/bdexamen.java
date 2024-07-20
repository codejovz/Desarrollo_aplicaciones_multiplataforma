package basededatos04;
//menu para cerrar, salir, hacer mas grande la ventana, cambiarla de color.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class bdexamen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf4;
	private JTextField tf3;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bdexamen frame = new bdexamen();
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
	public bdexamen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(176, 372, 673, 119);
		contentPane.add(ta1);
		
		JButton boton1 = new JButton("Buscar > precio");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String preciotf1=tf1.getText();
					int precio= Integer.parseInt(preciotf1);
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bdexamen","root","");
					Statement sentencia= conexion.createStatement();
					ResultSet registro=sentencia.executeQuery("select * from libros where precio > "+precio+" ;");
					
					ta1.setText("");
					ta1.append("ni,titulo,fechaPublicacion,edit,autor,precio"+"\n");
					
					while(registro.next()) {
						
						ta1.append(registro.getString(("nil"))+" , ");
						ta1.append(registro.getString(("Titulo"))+" , ");
						ta1.append(registro.getString(("fechaPublicacion"))+" , ");
						ta1.append(registro.getString(("Edit"))+" , ");
						ta1.append(registro.getString(("Autor"))+" , ");
						ta1.append(registro.getString(("Precio"))+"\n");
					}
					
					conexion.close();
					
					
					
					
					
				}catch(SQLException ex) {
					ta1.setText(ex.getMessage());
				}
				
				
				
			}
		});
		boton1.setBounds(47, 28, 129, 21);
		contentPane.add(boton1);
		
		tf1 = new JTextField();
		tf1.setBounds(210, 29, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton boton2 = new JButton("Buscar año<");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton2.setBounds(47, 83, 129, 21);
		contentPane.add(boton2);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(210, 84, 96, 19);
		contentPane.add(tf2);
		
		JButton boton5 = new JButton("Modificar");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Connection conexion= 
				
			}
		});
		boton5.setBounds(821, 295, 129, 21);
		contentPane.add(boton5);
		
		tf4 = new JTextField();
		tf4.setBounds(777, 70, 213, 19);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(777, 29, 213, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(777, 115, 213, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(777, 159, 213, 19);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NIL");
		lblNewLabel.setBounds(604, 32, 117, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(604, 73, 117, 13);
		contentPane.add(lblTitulo);
		
		JLabel lblFechapublicacion = new JLabel("fechaPublicacion");
		lblFechapublicacion.setBounds(606, 118, 117, 13);
		contentPane.add(lblFechapublicacion);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(604, 162, 117, 13);
		contentPane.add(lblEdit);
		
		JLabel lblNewLabel_3_1 = new JLabel("Autor");
		lblNewLabel_3_1.setBounds(604, 210, 117, 13);
		contentPane.add(lblNewLabel_3_1);
		
		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(777, 207, 213, 19);
		contentPane.add(tf7);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(777, 255, 213, 19);
		contentPane.add(tf8);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Precio");
		lblNewLabel_3_1_1.setBounds(604, 258, 117, 13);
		contentPane.add(lblNewLabel_3_1_1);
		
		JButton boton4 = new JButton("Baja");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/bdexamen","root","");
					Statement sentencia= conexion.createStatement();
					int algo1=sentencia.executeUpdate("DELETE from libros where nil="+Integer.parseInt(tf3.getText())+";");
					
					ta1.setText("El articulo a tomar por el culo");
					
					conexion.close();
					
				}catch(SQLException ex) {
					ta1.setText(ex.getMessage());

				}
				
				
				
			}
		});
		boton4.setBounds(682, 295, 129, 21);
		contentPane.add(boton4);
		
		JButton boton3 = new JButton("Alta");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/bdexamen","root","");
					Statement sentencia=conexion.createStatement();
					int algo = sentencia.executeUpdate("insert into libros(titulo, fechaPublicacion, Edit, Autor, Precio) values ('"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"','"+tf7.getText()+"',"+tf8.getText()+");");
					
					if(algo==1) {
						ta1.setText("Articulo insertado");
					}
					
					conexion.close();
					
					
				}catch(SQLException ex) {
					ta1.setText(ex.getMessage());
				}
				
				
			}
		});
		boton3.setBounds(544, 295, 129, 21);
		contentPane.add(boton3);
		
		JButton boton6 = new JButton("Consultar");
		boton6.setBounds(976, 295, 129, 21);
		contentPane.add(boton6);
		


	}
}
