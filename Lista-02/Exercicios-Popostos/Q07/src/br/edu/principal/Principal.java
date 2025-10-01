package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        System.out.print("Digite um valor pra A: ");
        double A = sc.nextDouble();

        System.out.print("Digite um valor pra B: ");
        double B = sc.nextDouble();

        System.out.print("Digite um valor pra C: ");
        double C = sc.nextDouble();

        System.out.print("Digite um valor pra I (1, 2 ou 3): ");
        int I = sc.nextInt();

        
        
        if (I == 1) {
            if (A < B && A < C) {
                if (B < C) {
                    System.out.println("A ordem crescente é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem crescente é: " + A + " - " + C + " - " + B);
                }
            } else if (B < A && B < C) {
                if (A < C) {
                    System.out.println("A ordem crescente é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem crescente é: " + B + " - " + C + " - " + A);
                }
            } else if (C < A && C < B) {
                if (A < B) {
                    System.out.println("A ordem crescente é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem crescente é: " + C + " - " + B + " - " + A);
                }
            }
            
            
            
        } else if (I == 2) {
            if (A > B && A > C) {
                if (B > C) {
                    System.out.println("A ordem decrescente é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem decrescente é: " + A + " - " + C + " - " + B);
                }
            } else if (B > A && B > C) {
                if (A > C) {
                    System.out.println("A ordem decrescente é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem decrescente é: " + B + " - " + C + " - " + A);
                }
            } else if (C > A && C > B) {
                if (A > B) {
                    System.out.println("A ordem decrescente é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem decrescente é: " + C + " - " + B + " - " + A);
                }
            }
            
            
            
        } else if (I == 3) {
            if (A > B && A > C) {
                System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
            } else if (B > A && B > C) {
                System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
            } else if (C > A && C > B) {
                System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
            }
        }

        sc.close();
    }
}
