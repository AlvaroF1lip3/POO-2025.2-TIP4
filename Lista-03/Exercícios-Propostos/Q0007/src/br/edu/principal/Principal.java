package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static double calculaMedia(double n1, double n2, double n3, char l) {
        double media;
        if (l == 'A' || l == 'a') {
            media = (n1 + n2 + n3) / 3.0;
        } else {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / 10.0;
        }
        return media;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        char letra;
        do {
            System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
            letra = sc.next().charAt(0);
        } while (letra != 'A' && letra != 'P' && letra != 'a' && letra != 'p');

        double m = calculaMedia(nota1, nota2, nota3, letra);

        if (letra == 'A' || letra == 'a') {
            System.out.println("A média aritmética: " + m);
        } else {
            System.out.println("A média ponderada: " + m);
        }

        sc.close();
    }
}
