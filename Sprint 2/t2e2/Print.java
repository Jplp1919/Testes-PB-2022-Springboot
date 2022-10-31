package t2e2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Print {

    Connection con;

    public Print(Connection con) {
        this.con = con;
    }

    public void printFilmes(Connection con) throws SQLException {
        int index;
        int pg;
        int quantidade;
        int qualpagina;
        List<Filme> filmes;
        Scanner sc = new Scanner(System.in);
        SelectDAO sd = new SelectDAO(con);
        System.out.println("Quantidade de filmes por página? ");

        quantidade = sc.nextInt();

        System.out.println("Qual página deseja ver? " );
        //sc.next();
        qualpagina = sc.nextInt();
        while (qualpagina <= 0 || quantidade <= 0) {
            System.out.println("Favor Selecione outro valor");

            System.out.println("Quantidade de filmes por página? ");
            sc.next();
            quantidade = sc.nextInt();

            System.out.println("Qual página deseja ver? ");
            sc.next();
            qualpagina = sc.nextInt();
            quantidade = sc.nextInt();

        }
        index = (quantidade * (qualpagina -1));
        filmes = sd.selectFilme(index, quantidade);
        filmes.stream().forEach(fm -> System.out.println(fm));
    }
}
