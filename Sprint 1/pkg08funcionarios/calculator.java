package pkg08funcionarios;

import java.util.Scanner;

public class calculator {

    Scanner sc = new Scanner(System.in);
    String sal = "Salário: ";
    String bon = "Bônus: ";
    String des = "Desconto: ";
    String liq = "Salário Líquido: ";
    String askUser = "Nome do funcionário: ";
    String askSal = "Salário  do funcionário: ";
    String iterNum = "Quantidade de iterações:  ";
    String div = "---------";
    public double calculatePercentage(double numero, double porcento) {
        porcento /= 100;
        double percentagem = numero * porcento;
        return percentagem;
    }

    public void fillInfo(int iter) {
        String[] nomes = new String[iter];
        double[] salarios = new double[iter];

        for (int i = 0; i < iter; i++) {

            System.out.println(askUser);
            nomes[i] = sc.nextLine();
            
            System.out.println(askSal);
            String temp = sc.nextLine();
            System.out.println(div);
            salarios[i] = Integer.parseInt(temp);

        }

        for (int i = 0; i < iter; i++) {
            System.out.println("Funcionário " + nomes[i]);
            this.calculation(salarios[i]);
            System.out.println(div);
        }
    }

    public void calculation(double salario) {
        double temp;
        if (salario < 1000) {
            System.out.println(sal + salario);
            temp = this.calculatePercentage(salario, 20);
            System.out.println(bon + temp);
            salario += temp;
            System.out.println(liq + salario);
        } else if (salario < 2000) {
            System.out.println(sal + salario);
            temp = this.calculatePercentage(salario, 10);
            System.out.println(bon + temp);
            salario += temp;
            System.out.println(liq + salario);
        } else if (salario >= 2000) {
            System.out.println(sal + salario);
            temp = this.calculatePercentage(salario, 10);
            System.out.println(des + temp);
            salario -= temp;
            System.out.println(liq + salario);
        }
    }

    public void calculationLoop() {
       
        int temp = 0;
        System.out.println(iterNum);
        temp = Integer.parseInt( sc.nextLine());
        this.fillInfo(temp);
    }

}
