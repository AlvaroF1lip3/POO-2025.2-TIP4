package br.edu.principal;
import java.util.Scanner;
import java.util.Arrays;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    for (int g = 1; g <= 5; g++) {
        double[] valores = new double[4];
        System.out.println("Grupo " + g + ":");
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextDouble();
        }

        System.out.print("Ordem lida: ");
        for (double v : valores) System.out.print(v + " ");
        System.out.println();

        Arrays.sort(valores);
        System.out.print("Ordem crescente: ");
        for (double v : valores) System.out.print(v + " ");
        System.out.println();

        System.out.print("Ordem decrescente: ");
        for (int i = valores.length - 1; i >= 0; i--) System.out.print(valores[i] + " ");
        System.out.println("\n");
        
    	}
    sc.close();
    }
}