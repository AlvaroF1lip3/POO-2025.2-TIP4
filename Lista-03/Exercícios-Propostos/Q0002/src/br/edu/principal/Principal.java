package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static int somar(int n1, int n2) {
        int s = 0;
        for (int i = n1 + 1; i < n2; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

        int s = somar(n1, n2);
        System.out.println("Soma = " + s);

        sc.close();
    }
}
