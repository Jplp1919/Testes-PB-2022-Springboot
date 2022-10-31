
package t2e2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
   private String url="jdbc:mysql://localhost:3306/filmedb";
   private String user="root";
   private String password="root";
   
   
   
       public Connection establishConnection() throws SQLException  {
        return DriverManager.getConnection(url, user, password);
       
      
      
    }
}
