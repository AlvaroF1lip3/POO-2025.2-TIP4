package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int numTerm = sc.nextInt();
        System.out.print("Digite um valor positivo para X: ");
        double x = sc.nextDouble();

        double s = 0.0;
        int denom = 1;
        int den = 1;

        for (int i = 1; i <= numTerm; i++) {
            int fim = denom;
            long fat = 1;
            for (int j = 1; j <= fim; j++) {
                fat *= j;
            }

            int exp = i + 1;
            double term = Math.pow(x, exp) / fat;

            if (exp % 2 == 0) {
                s -= term;
            } else {
                s += term;
            }

            if (denom == 4) {
                den = -1;
            } else if (denom == 1) {
                den = 1;
            }

            if (den == 1) {
                denom++;
            } else {
                denom--;
            }
        }

        System.out.println("Valor da série S: " + s);

        sc.close();
    }
}
