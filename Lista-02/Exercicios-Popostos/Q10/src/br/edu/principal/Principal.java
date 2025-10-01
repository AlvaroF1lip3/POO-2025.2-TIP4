package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira data");
        System.out.print("Dia: ");
        int d1 = sc.nextInt();
        System.out.print("Mês: ");
        int m1 = sc.nextInt();
        System.out.print("Ano: ");
        int a1 = sc.nextInt();

        System.out.println("Segunda data");
        System.out.print("Dia: ");
        int d2 = sc.nextInt();
        System.out.print("Mês: ");
        int m2 = sc.nextInt();
        System.out.print("Ano: ");
        int a2 = sc.nextInt();

        if (a1 > a2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (a2 > a1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else if (m1 > m2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (m2 > m1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else if (d1 > d2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (d2 > d1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else {
            System.out.println("Datas iguais!");
        }

        sc.close();
    }
}
