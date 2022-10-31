package t2e2;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {

 
    public static void main(String[] args) throws SQLException {
       Connection con = new ConnectionFactory().establishConnection();
       Print print = new Print(con);
       print.printFilmes(con);
    }
    
}
