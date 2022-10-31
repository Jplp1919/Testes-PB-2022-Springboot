package t2e2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SelectDAO {
    
    
        private Connection con;

    public  SelectDAO(Connection con) {
        this.con = con;
    }
        public List<Filme> selectFilme(int index, int quantidade) throws SQLException {
        
        String sql = "SELECT * FROM FILME LIMIT ?, ?";
        List<Filme> filmes = new ArrayList();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, index);
            ps.setInt(2, quantidade);
            ps.execute();
            try (ResultSet rs = ps.getResultSet()) {
                while (rs.next()) {
                    Filme filme
                            = new Filme(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4) );
                    filmes.add(filme);
                }
            }
        }
        return filmes;
    }
}
