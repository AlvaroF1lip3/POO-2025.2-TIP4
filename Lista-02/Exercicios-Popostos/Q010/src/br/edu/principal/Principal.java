package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdeMenor18 = 0;
        int tot80 = 0;
        double somAlt = 0.0;

        for (int contTime = 1; contTime <= 5; contTime++) {
            double somIdadeTim = 0.0;

            for (int contJog = 1; contJog <= 11; contJog++) {
                System.out.print("Digite a idade do jogador: ");
                int idade = sc.nextInt();
                System.out.print("Digite o peso do jogador: ");
                double peso = sc.nextDouble();
                System.out.print("Digite a altura do jogador: ");
                double alt = sc.nextDouble();

                if (idade < 18) qtdeMenor18++;
                if (peso > 80) tot80++;

                somIdadeTim += idade;
                somAlt += alt;
            }

            double medIdadeTime = somIdadeTim / 11.0;
            System.out.printf("Média das idades do time %d: %.2f%n", contTime, medIdadeTime);
        }

        System.out.println("Nº de jogadores com menos de 18 anos: " + qtdeMenor18);

        double medAlt = somAlt / 55.0;
        System.out.printf("Nº das alturas de todos os jogadores: %.2f%n", medAlt);

        double porcMais80 = (tot80 * 100.0) / 55.0;
        System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f%% %n", porcMais80);

        sc.close();
    }
}
