package pkg06quiz;

import java.util.Scanner;


public class pergunta {
    static String[] perguntas = new String[5];
    static String[] respostas = new String[5];
    Scanner scan = new Scanner(System.in);
    String segway = "Qual a sua resposta? (Apenas a letra da opção escolhida)";
    String user = "Quem está jogando?";

    public void formularPerguntas() {
        perguntas[0] = "1.Qual o nome científico da baleia assassina?\n"
                + "a - Sicarius orca\n"
                + "b - Delphinapterus leucas\n"
                + "c - Orcinus orca\n"
                + "d -  Felis catus";
        respostas[0] = "c";
        perguntas[1] = "2.  Em qual ano o Big Ben foi construído?\n"
                + "a - 1843\n"
                + "b - 1900\n"
                + "c - 1789\n"
                + "d - 2000";
        respostas[1] = "a";
        perguntas[2] = "3. Qual foi o monarca com o reinado mais longo da história?\n"
                + "a - Alexandre da Macedônia  \n"
                + "b - Elizabeth II\n"
                + "c - Catarina II\n"
                + "d - Luís XIV ";
        respostas[2] = "d";
        perguntas[3] = "4. Qual desses animais não pertence a família dos canídeos?\n"
                + "a - Lobo-Guará\n"
                + "b - Cão-guaxinim\n"
                + "c - Hiena\n"
                + "d - Raposa-Vermelha";
        respostas[3] = "c";
        perguntas[4] = "5. Qual foi a altura do homem mais alto da história?\n"
                + "a - 3.2 m\n"
                + "b - 2.74 m\n"
                + "c - 2.9m\n"
                + "d - 5 m";
        respostas[4] = "b";

    }

    public boolean testarRepostas(String userres, String res) {
        return userres.equalsIgnoreCase(res);

    }

    public void quiz() {
        System.out.println(user);
        String tempuser = scan.nextLine();
        int acertos = 0;
        int erros = 0;
        String temp;

        this.formularPerguntas();
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println(segway);
            temp = scan.nextLine();
            temp = temp.replaceAll("\\s+","");

            if (testarRepostas(temp, respostas[i])) {
                acertos++;
                System.out.println(tempuser);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + erros);
            } else {
                erros++;
            }

        }
        System.out.println(tempuser);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
    }

    public static void main(String[] args) {
        pergunta per = new pergunta();
        per.quiz();

    }
}
