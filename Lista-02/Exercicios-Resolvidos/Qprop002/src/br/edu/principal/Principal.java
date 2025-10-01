package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Preço | Ingressos | Lucro");
    double lucroMax = Double.NEGATIVE_INFINITY;
    double precoMax = 0;
    int ingressosMax = 0;
    for (double preco = 5.0; preco >= 1.0; preco -= 0.5) {
        int ingressos = (int) (120 + ((5 - preco) / 0.5) * 26);
        double lucro = (preco * ingressos) - 200;
        System.out.printf("R$ %.2f | %d | R$ %.2f%n", preco, ingressos, lucro);
        if (lucro > lucroMax) {
            lucroMax = lucro;
            precoMax = preco;
            ingressosMax = ingressos;
            
            System.out.printf("Lucro máximo: R$ %.2f | Preço: R$ %.2f | Ingressos: %d%n\n", lucroMax, precoMax, ingressosMax);
        	}
    	}
    }
}