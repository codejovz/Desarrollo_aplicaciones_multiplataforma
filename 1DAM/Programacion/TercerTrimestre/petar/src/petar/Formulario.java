package petar;
import java.util.Random;
import javax.swing.*;

public class Formulario extends JFrame{
	
	private JLabel label1,label2;
	public Formulario() {
		setLayout(null);
		label1=new JLabel("Si cierras uno cierras todos");
		label1.setBounds(10,100,200,20);
		add(label1);

		
	}
	
	
	
	public static void main(String[]args) {
		for(int x=0;x<400;x++) {
		Formulario formulario1= new Formulario();
		Random rand = new Random();
        int a = rand.nextInt(1500);
        int b = rand.nextInt(900);
		
		formulario1.setBounds(a,b,400,200);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		
		
	}
	
}