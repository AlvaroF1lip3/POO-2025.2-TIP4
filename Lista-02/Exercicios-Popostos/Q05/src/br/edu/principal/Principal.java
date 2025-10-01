package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números em ordem crescente: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        System.out.print("Digite um número (fora de ordem): ");
        double n4 = sc.nextDouble();

        if (n4 > n3) {
            System.out.println("A ordem decrescente é: " + n4 + "-" + n3 + "-" + n2 + "-" + n1);
        } else if (n4 > n2 && n4 < n3) {
            System.out.println("A ordem decrescente é: " + n3 + "-" + n4 + "-" + n2 + "-" + n1);
        } else if (n4 > n1 && n4 < n2) {
            System.out.println("A ordem decrescente é: " + n3 + "-" + n2 + "-" + n4 + "-" + n1);
        } else if (n4 < n1) {
            System.out.println("A ordem decrescente é: " + n3 + "-" + n2 + "-" + n1 + "-" + n4);
        }

        sc.close();
    }

}
