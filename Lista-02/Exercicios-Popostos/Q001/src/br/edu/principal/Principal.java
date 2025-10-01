package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt(); 

        double sal = 1000.0;
        double percent = 1.5 / 100;

        double novoSal = sal + percent * sal;

        for (int i = 2007; i <= anoAtual; i++) {
            percent = 2 * percent;
            novoSal = novoSal + percent * novoSal;
        }

        System.out.printf("Salário atual: R$ %.2f%n", novoSal);

        sc.close();
    }
}
