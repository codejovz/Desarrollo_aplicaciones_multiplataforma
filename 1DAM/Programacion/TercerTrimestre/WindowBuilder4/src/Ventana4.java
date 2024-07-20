import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Ventana4 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
	private JButton botonDiv,botonSum,botonResta,botonDivi, botonMulti, botonc, botonComa, botonSuma, botonPorc, botonBorr, botonIgual;
	private String num1t,num2t,resultadot,todot,operaciont;
	private int num1,num2,resultado,cont,posOp,operacion;
	private JLabel resultadol;
	private JLabel num1l;
	private JLabel num2l;
	private JLabel labelOperaciont;
	private JLabel labelResultadot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
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
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JLabel*/ resultadol = new JLabel("10000");
 resultadol.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		resultadol.setHorizontalAlignment(SwingConstants.RIGHT);
		resultadol.setForeground(new Color(255, 0, 0));
		resultadol.setBounds(233, 64, 65, 31);
		contentPane.add(resultadol);
		
		/*JButton*/ boton7 = new JButton("7");
		boton7.addActionListener(this);
		boton7.setBounds(31, 142, 65, 21);
		contentPane.add(boton7);
		
		/*JButton*/boton8 = new JButton("8");
		boton8.addActionListener(this);
		boton8.setBounds(106, 142, 65, 21);
		contentPane.add(boton8);
		
		/*JButton*/ boton9 = new JButton("9");
		boton9.addActionListener(this);
		boton9.setBounds(181, 142, 65, 21);
		contentPane.add(boton9);
		
		/*JButton*/ boton4 = new JButton("4");
		boton4.addActionListener(this);
		boton4.setBounds(31, 183, 65, 21);
		contentPane.add(boton4);
		
		/*JButton*/ boton5 = new JButton("5");
		boton5.addActionListener(this);
		boton5.setBounds(106, 183, 65, 21);
		contentPane.add(boton5);
		
		/*JButton*/ boton6 = new JButton("6");
		boton6.addActionListener(this);
		boton6.setBounds(181, 183, 65, 21);
		contentPane.add(boton6);
		
		/*JButton*/ boton1 = new JButton("1");
		boton1.addActionListener(this);
		boton1.setBounds(31, 226, 65, 21);
		contentPane.add(boton1);
		
		/*JButton*/ boton2 = new JButton("2");
		boton2.addActionListener(this);
		boton2.setBounds(106, 226, 65, 21);
		contentPane.add(boton2);
		
		/*JButton*/ boton3 = new JButton("3");
		boton3.addActionListener(this);
		boton3.setBounds(181, 226, 65, 21);
		contentPane.add(boton3);
		
		/*JButton*/ boton0 = new JButton("0");
		boton0.addActionListener(this);
		boton0.setBounds(31, 267, 140, 21);
		contentPane.add(boton0);
		
		/*JButton*/ botonComa = new JButton(",");
		botonComa.addActionListener(this);
		botonComa.setBounds(181, 267, 65, 21);
		contentPane.add(botonComa);
		
		/*JButton*/ botonMulti = new JButton("x");
		botonMulti.addActionListener(this);
		botonMulti.setBounds(256, 142, 45, 21);
		contentPane.add(botonMulti);
		
		/*JButton*/ botonResta = new JButton("-");
		botonResta.addActionListener(this);
		botonResta.setBounds(256, 183, 45, 21);
		contentPane.add(botonResta);
		
		/*Button*/ botonSuma = new JButton("+");
		botonSuma.addActionListener(this);
		botonSuma.setBounds(256, 226, 45, 21);
		contentPane.add(botonSuma);
		
		/*JButton*/ botonIgual = new JButton("=");
		botonIgual.addActionListener(this);
		botonIgual.setBounds(256, 267, 45, 21);
		contentPane.add(botonIgual);
		
		/*JButton*/ botonc = new JButton("C");
		botonc.addActionListener(this);
		botonc.setBounds(31, 102, 65, 21);
		contentPane.add(botonc);
		
		
		/*JButton*/ botonDivi = new JButton("/");
		botonDivi.addActionListener(this);
		botonDivi.setBounds(256, 102, 45, 21);
		contentPane.add(botonDivi);
		
		/*JButton*/ botonPorc = new JButton("%");
		botonPorc.addActionListener(this);
		botonPorc.setBounds(181, 102, 65, 21);
		contentPane.add(botonPorc);
		
		/*JButton*/ botonBorr = new JButton("<-");
		botonBorr.addActionListener(this);
		botonBorr.setBounds(106, 102, 65, 21);
		contentPane.add(botonBorr);
		
		num1l = new JLabel("num1l");
		num1l.setHorizontalAlignment(SwingConstants.RIGHT);
		num1l.setForeground(Color.RED);
		num1l.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		num1l.setBounds(10, 10, 45, 31);
		contentPane.add(num1l);
		
		num2l = new JLabel("num2l");
		num2l.setHorizontalAlignment(SwingConstants.RIGHT);
		num2l.setForeground(Color.RED);
		num2l.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		num2l.setBounds(106, 10, 65, 31);
		contentPane.add(num2l);
		
		labelOperaciont = new JLabel("operaciont");
		labelOperaciont.setHorizontalAlignment(SwingConstants.RIGHT);
		labelOperaciont.setForeground(Color.RED);
		labelOperaciont.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		labelOperaciont.setBounds(10, 64, 86, 31);
		contentPane.add(labelOperaciont);
		
		labelResultadot = new JLabel("resultadot");
		labelResultadot.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResultadot.setForeground(Color.RED);
		labelResultadot.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		labelResultadot.setBounds(126, 64, 76, 31);
		contentPane.add(labelResultadot);
		
		todot="";
		cont=0;
		posOp=0;
		operacion=0;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton0) {
			todot=todot+"0";
			resultadol.setText(todot);
			cont=cont+1;
		}
		
		if(e.getSource()==boton1) {
			todot=todot+"1";
			resultadol.setText(todot);
			cont=cont+1;
		}
		
		if(e.getSource()==boton2) {
			todot=todot+"2";
			resultadol.setText(todot);
			cont=cont+1;
		}
		
		if(e.getSource()==boton3) {
			todot=todot+"3";
			resultadol.setText(todot);
			cont=cont+1;
		}
		
		if(e.getSource()==boton4) {
			todot=todot+"4";
			resultadol.setText(todot);
			cont=cont+1;
		}
		
		if(e.getSource()==boton5) {
			todot=todot+"5";
			resultadol.setText(todot);
			cont=cont+1;
			
		}
		
		if(e.getSource()==boton6) {
			todot=todot+"6";
			resultadol.setText(todot);
			cont=cont+1;
			
		}
		
		if(e.getSource()==boton7) {
			todot=todot+"7";
			resultadol.setText(todot);
			cont=cont+1;
			
		}
		
		if(e.getSource()==boton8) {
			todot=todot+"8";
			resultadol.setText(todot);
			cont=cont+1;
			
		}
		
		if(e.getSource()==boton9) {
			todot=todot+"9";
			resultadol.setText(todot);
			cont=cont+1;
			
		}
		
		if(e.getSource()==botonc) {
			todot="";
			resultadol.setText(todot);
			cont=0;
			
		}
		
		if(e.getSource()==botonSuma) {
			todot=todot+"+";
			resultadol.setText(todot);
			posOp=cont;
			operacion=1;
			operaciont="+";
			

		}
		
		if(e.getSource()==botonResta) {
			todot=todot+"-";
			resultadol.setText(todot);
			posOp=cont;
			operacion=2;
			operaciont="-";
		}
		
		if(e.getSource()==botonMulti) {
			todot=todot+"x";
			resultadol.setText(todot);
			posOp=cont;
			operacion=3;
			operaciont="x";
		}
		
		if(e.getSource()==botonDivi) {
			System.out.println("/");
			todot=todot+"/";
			resultadol.setText(todot);
			posOp=cont;
			operacion=4;
			operaciont="/";
		}
		
		if(e.getSource()==botonBorr) {
			
		}
		
		if(e.getSource()==botonIgual) {
			
			
			num1t=todot.substring(0,posOp);
			num1l.setText(num1t);
			
			num2t=todot.substring(posOp+1);
			num2l.setText(num2t);
			
			labelOperaciont.setText(operaciont);
			
			num1= Integer.parseInt(num1t);
			num2= Integer.parseInt(num2t);
			
			
			if(operacion==1) {
				resultado=num1+num2;
				resultadot=Integer.toString(resultado);
				labelResultadot.setText(resultadot);
			}
			
			if(operacion==2) {
				resultado=num1-num2;
				resultadot=Integer.toString(resultado);
				labelResultadot.setText(resultadot);
			}
			
			if(operacion==3) {
				resultado=num1*num2;
				resultadot=Integer.toString(resultado);
				labelResultadot.setText(resultadot);
			}
			
			if(operacion==4) {
				resultado=num1/num2;
				resultadot=Integer.toString(resultado);
				labelResultadot.setText(resultadot);
			}
			
			
			
		}
		
		
	}
	
	

}
