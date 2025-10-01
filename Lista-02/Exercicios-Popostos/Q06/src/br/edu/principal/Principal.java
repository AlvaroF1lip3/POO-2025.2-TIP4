package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int r = n % 2;

        if (r == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

        sc.close();
    }
}
