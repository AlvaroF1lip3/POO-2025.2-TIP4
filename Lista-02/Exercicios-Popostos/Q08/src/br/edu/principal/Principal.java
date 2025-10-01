package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1- Somar");
        System.out.println("2- Raiz quadrada");
        System.out.print("1 ou 2? ");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.print("Primeiro número: ");
            double num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            double num2 = sc.nextDouble();
            double soma = num1 + num2;
            System.out.println("Somados: " + num1 + " e " + num2 + " é " + soma);
        } else if (op == 2) {
            System.out.print("Digite um valor: ");
            double num1 = sc.nextDouble();
            double raiz = Math.sqrt(num1);
            System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
