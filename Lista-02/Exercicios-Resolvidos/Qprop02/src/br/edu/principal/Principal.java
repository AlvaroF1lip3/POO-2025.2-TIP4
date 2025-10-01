package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite a primeira nota: ");
        double not1 = sc.nextDouble();
        
    	System.out.print("Digite a segunda nota: ");
    	double not2 = sc.nextDouble();
    	
    	double med2 = (not1 + not2) / 2;
    	System.out.println("Média: " + med2);
    	if (med2 < 3) {
        System.out.println("Reprovado");
    	} else if (med2 < 7) {
        System.out.println("Exame");
    	} else {
    	System.out.println("Aprovado");
    	}
    }
}
