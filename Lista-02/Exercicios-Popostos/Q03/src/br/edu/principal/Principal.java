package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Maior número: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior número: " + n2);
        } else if (n1 == n2) {
            System.out.println("Números iguais");
        }

        sc.close();
    }
}
