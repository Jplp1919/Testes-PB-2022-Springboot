package t2e1;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().establishConnection();
        Loop loop = new Loop(con);
        loop.doLoop();
    }
    
}
