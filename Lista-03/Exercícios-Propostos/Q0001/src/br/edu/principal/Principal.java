package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static int verifica(int num) {
        return (num >= 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int x = verifica(num);

        if (x == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();
    }
}
