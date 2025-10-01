package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média aritmética: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            double nota_exame = 12 - media;
            System.out.println("Ainda deve: " + nota_exame);
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}