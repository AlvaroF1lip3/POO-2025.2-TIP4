package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	

        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Terceiro número: ");
        double c = sc.nextDouble();
        double maior = Math.max(a, Math.max(b, c));
    	System.out.println("O maior número é: " + maior);

    sc.close();
}
}
