package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota do trabalho de laboratório: ");
        double nota_trab = sc.nextDouble();

        System.out.print("Nota da avaliação semestral: ");
        double aval_sem = sc.nextDouble();

        System.out.print("Nota do exame final: ");
        double exame = sc.nextDouble();

        double media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
        System.out.println("Média ponderada: " + media);

        if (media >= 8 && media <= 10) {
            System.out.println("A");
        } else if (media >= 7 && media < 8) {
            System.out.println("B");
        } else if (media >= 6 && media < 7) {
            System.out.println("C");
        } else if (media >= 5 && media < 6) {
            System.out.println("D");
        } else if (media >= 0 && media < 5) {
            System.out.println("E");
        }

        sc.close();
    }
}
