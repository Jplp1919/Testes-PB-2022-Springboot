package t2e1;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Loop {

    Connection con;
    
    public Loop(Connection con) {
        this.con = con;
    }
    
    public void doLoop() throws SQLException {
        Scanner sc = new Scanner(System.in);
        DAO dao = new DAO(con);
        Produto p1 = new Produto(1, "Caderno", "Caderno escolar", 5, 7);
        Produto p2 = new Produto(2, "Caneta", "Caneta esferográfica azul", 3, 1);
        Produto p3 = new Produto(3, "Lápis", "Lápis número 2", 8, 1);
        OUTER:
        while (true) {
            
            System.out.println("Escolha a operação:\n"
                    + "\n"
                    + "0- Sair\n"
                    + "1- Cadastrar Produtos\n"
                    + "2- Atualizar Produto\n"
                    + "3- Deletar Produto ");
            
            int i = sc.nextInt();
            switch (i) {
                case 0:
                    break OUTER;
                case 1:
                    try {
                    
                    dao.insertProduto(p1);

                } catch (SQLException e) {
                    dao.alterProduto(1, 7);
                    System.out.println("Caderno já em estoque");
                }
                try {
                    dao.insertProduto(p2);
                } catch (SQLException e) {
                    System.out.println("Caneta já em estoque");
                }
                try {
                    dao.insertProduto(p3);
                } catch (SQLException e) {
                    System.out.println("Lápis já em estoque");
                }                
                printProdutos(dao);
                break;
                case 2:
                    try {
                    dao.alterProduto(1, 11);
                } catch (SQLException e) {
                    System.out.println("Caderno fora de estoque");
                }
                printProdutos(dao);
                break;
                case 3:
                    try {
                    dao.deleteProduto(2);
                } catch (SQLException e) {
                    System.out.println("Caneta fora de estoque");
                }
                printProdutos(dao);
                break;
                default:
                    break;
            }
        }
    }
    
    private void printProdutos(DAO dao) throws SQLException {
        List<Produto> listaprodutos = dao.selectProduto();
        listaprodutos.stream().forEach(lp -> System.out.println(lp));
    }
}
