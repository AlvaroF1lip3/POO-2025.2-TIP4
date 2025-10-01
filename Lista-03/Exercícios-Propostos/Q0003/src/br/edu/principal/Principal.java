package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static int divisores(int a, int b, int c) {
        int s = 0;
        int menor = Math.min(b, c);
        int maior = Math.max(b, c);

        for (int i = menor; i <= maior; i++) {
            if (i % a == 0) {
                s += i;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.print("Digite a (maior que 1): ");
            a = sc.nextInt();
        } while (a <= 1);

        System.out.print("Digite b: ");
        b = sc.nextInt();
        System.out.print("Digite c: ");
        c = sc.nextInt();

        int result = divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);

        sc.close();
    }
}