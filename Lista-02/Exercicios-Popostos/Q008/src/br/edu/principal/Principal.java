package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int nTerm = sc.nextInt();

        int n1 = 2;
        int n2 = 7;
        int n3 = 3;

        System.out.print(n1 + " ");
        if (nTerm > 1) System.out.print(n2 + " ");
        if (nTerm > 2) System.out.print(n3 + " ");

        int i = 4;
        while (i <= nTerm) {
            n1 *= 2;
            System.out.print(n1 + " ");
            i++;
            if (i > nTerm) break;

            n2 *= 3;
            System.out.print(n2 + " ");
            i++;
            if (i > nTerm) break;

            n3 *= 4;
            System.out.print(n3 + " ");
            i++;
        }

        sc.close();
    }
}