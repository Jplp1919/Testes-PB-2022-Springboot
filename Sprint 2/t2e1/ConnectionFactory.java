
package t2e1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
   private String url="jdbc:mysql://localhost:3306/produtodb";
   private String user="root";
   private String password="root";
   
   
   
       public Connection establishConnection() throws SQLException  {
        return DriverManager.getConnection(url, user, password);
       
      
      
    }
}
