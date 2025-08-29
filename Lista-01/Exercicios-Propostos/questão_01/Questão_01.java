package questão_01;

import java.util.Scanner;

public class Questão_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, soma;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        n4 = sc.nextInt();

        soma = n1 + n2 + n3 + n4;

        System.out.println("A soma é: " + soma);

        sc.close();
    }
    
}
