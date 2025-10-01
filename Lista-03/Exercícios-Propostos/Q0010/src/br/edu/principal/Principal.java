package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static double sequencia(int n) {
        double seq = 1.0;

        for (int a = 1; a <= n; a++) {
            double f = 1.0;
            for (int b = 1; b <= a; b++) {
                f *= b;
            }
            seq += 1.0 / f;
        }

        return seq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        double s = sequencia(num);
        System.out.println("S = " + s);

        sc.close();
    }
}
