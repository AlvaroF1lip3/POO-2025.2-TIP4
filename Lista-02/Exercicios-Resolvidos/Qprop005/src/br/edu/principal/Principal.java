package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
    System.out.println("\nTabuadas de 1 a 10:");
    for (int n = 1; n <= 10; n++) {
        System.out.println("Tabuada do " + n + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }

    sc.close();
    }
}