package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
    	System.out.print("Primeira nota: ");
    	double n1 = sc.nextDouble();
    	System.out.print("Segunda nota: ");
    	double n2 = sc.nextDouble();
    	System.out.print("Terceira nota: ");
    	double n3 = sc.nextDouble();
    	System.out.print("Digite a quarta nota: ");
    	double n4 = sc.nextDouble();
    	double media1 = (n1 + n2 + n3 + n4) / 4;
    	System.out.println("Média: " + media1);
    	if (media1 >= 7) {
        	System.out.println("Aprovado");
    	} else {
        	System.out.println("Reprovado");
    	}
    }
}