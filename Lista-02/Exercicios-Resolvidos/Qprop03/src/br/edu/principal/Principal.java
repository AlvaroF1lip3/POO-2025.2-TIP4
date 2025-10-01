package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	
    System.out.print("Primeiro número: ");
    double n1 = sc.nextDouble();
    System.out.print("Segundo número: ");
    double n2 = sc.nextDouble();
    double menor = (n1 < n2) ? n1 : n2;
    System.out.println("O menor número é: " + menor);
}
}