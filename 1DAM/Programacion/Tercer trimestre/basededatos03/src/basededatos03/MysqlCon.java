package basededatos03;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlCon {
	
	public static void main(String[]args) {
		
		try {
			Connection conexion= DriverManager.getConnection("jdbc:mysql::/localhost/bd1","root","");
			Statement sentencia= conexion.createStatement();
			ResultSet registro=sentencia.executeQuery("select * from tabla;");
			
			
			while(registro.next()) {
				
				int id= registro.getInt("id");
				String descripcion=registro.getString("descripcion");
				System.out.println(id+" - "+ descripcion);
				
			}
			
			
			//Exception e
		}catch(SQLException ex) {
			System.out.println(ex);  //e.printStackTrace();
		}
		
		
	}
	
	
	
	
	

}
