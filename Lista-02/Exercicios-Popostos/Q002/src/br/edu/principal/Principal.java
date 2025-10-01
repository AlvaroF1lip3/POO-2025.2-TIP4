package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inteiro e positivo N: ");
        int n = sc.nextInt();

        double e = 1.0;

        for (int i = 1; i <= n; i++) {
            double fat = 1.0;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1.0 / fat;
        }

        System.out.println("Valor de E: " + e);

        sc.close();
    }
}
