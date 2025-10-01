package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tr = 0, te = 0, ta = 0;
        double totalClass = 0;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.print("Primeira nota do aluno " + cont + ": ");
            double n1 = sc.nextDouble();
            System.out.print("Segunda nota do aluno " + cont + ": ");
            double n2 = sc.nextDouble();

            double med = (n1 + n2) / 2;
            System.out.println("Média do aluno " + cont + ": " + med);

            if (med <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (med < 7) {
                te++;
                System.out.println("Exame");
            } else {
                ta++;
                System.out.println("Aprovado");
            }

            totalClass += med;
        }

        System.out.println("Nº de reprovados: " + tr);
        System.out.println("Nº de exame: " + te);
        System.out.println("Nº de aprovados: " + ta);

        double mediaClass = totalClass / 6;
        System.out.println("Média da classe: " + mediaClass);

        sc.close();
    }
}
