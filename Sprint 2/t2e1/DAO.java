package t2e1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private Connection con;

    public DAO(Connection con) {
        this.con = con;
    }

    public void insertProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (ID, NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, produto.getId());
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getDescricao());
            ps.setInt(4, produto.getQuantidade());
            ps.setDouble(5, produto.getPreco());
            ps.execute();
            /*try (ResultSet rs = ps.getGeneratedKeys()) {
                while (rs.next()) {
                    produto.setId(rs.getInt(1));
                } 
            }*/
        }
    }

    public void deleteProduto(int id) throws SQLException {
        String sql = "DELETE FROM PRODUTO WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, id);
            ps.execute();
        }
    }

    public void alterProduto(int id, double preco) throws SQLException {
        String sql = "UPDATE PRODUTO SET PRECO = ? WHERE ID = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, preco);
            ps.setInt(2, id);
            ps.execute();
        }
    }

    public List<Produto> selectProduto() throws SQLException {
        String sql = "SELECT * FROM PRODUTO";
        List<Produto> produtos = new ArrayList();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.execute();
            try (ResultSet rs = ps.getResultSet()) {
                while (rs.next()) {
                    Produto produto
                            = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }
}
