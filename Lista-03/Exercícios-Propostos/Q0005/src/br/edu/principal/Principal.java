package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static double calculoReajuste(double PA, double PN) {
        double result = ((PN - PA) / PA) * 100;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço antigo: ");
        double precoAntigo = sc.nextDouble();
        System.out.print("Digite o preço atual: ");
        double precoAtual = sc.nextDouble();

        double acrescimo = calculoReajuste(precoAntigo, precoAtual);
        System.out.println("Percentual de acréscimo: " + acrescimo + "%");

        sc.close();
    }
}
