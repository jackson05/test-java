package invoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
	static Connection con;

	public void connect()
	{
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://10.0.0.5:3306/openclinic","user", "password");
          
            
        } catch (ClassNotFoundException | SQLException ex) {
           
           ex.printStackTrace();
          
        }  
        
    }
}
