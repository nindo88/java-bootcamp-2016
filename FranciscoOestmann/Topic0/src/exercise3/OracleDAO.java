package exercise3;

import java.sql.*;

public class OracleDAO implements SelectorDAOImpl{

	Connection conn = null;
	private int id;
	
	//Constructor
	public OracleDAO(int id) {
		super();
		this.id = id;
	}
	
	//Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void connect() {
		try{
			/*Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("url", "User", "Pass");
			*/
			//Print on console to verify the connection
			System.out.println("Connectec");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void close() {
		try{
			//conn.close();
			//Print on console to verify the connection
			System.out.println("Disconnected");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
