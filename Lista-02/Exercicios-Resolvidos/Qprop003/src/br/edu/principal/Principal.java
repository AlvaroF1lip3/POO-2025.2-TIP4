package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
    int[] contFaixa = new int[5];
    for (int i = 1; i <= 8; i++) {
        System.out.print("Digite a idade da pessoa " + i + ": ");
        int idade = sc.nextInt();
        if (idade <= 15) contFaixa[0]++;
        else if (idade <= 30) contFaixa[1]++;
        else if (idade <= 45) contFaixa[2]++;
        else if (idade <= 60) contFaixa[3]++;
        else contFaixa[4]++;
    }
    System.out.println("Quantidade por faixa etária:");
    for (int i = 0; i < 5; i++) System.out.println("Faixa " + (i + 1) + ": " + contFaixa[i]);

    int totalPessoas = 8;
    System.out.printf("Porcentagem faixa 1: %.2f%%\n", (contFaixa[0] * 100.0) / totalPessoas);
    System.out.printf("Porcentagem faixa 5: %.2f%%\n\n", (contFaixa[4] * 100.0) / totalPessoas);

    }
}