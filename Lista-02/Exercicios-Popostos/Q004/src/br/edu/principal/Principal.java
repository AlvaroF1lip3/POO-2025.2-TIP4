package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mai = 0, men = 0, cid_mai = 0, cid_men = 0;
        int soma_vei = 0, soma_acid = 0, cont_acid = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.print("Código da cidade: ");
            int cod = sc.nextInt();
            System.out.print("Número de veículos de passeio: ");
            int num_vei = sc.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas: ");
            int num_acid = sc.nextInt();

            if (cont == 1) {
                mai = num_acid;
                cid_mai = cod;
                men = num_acid;
                cid_men= cod;
            } else {
                if (num_acid > mai) {
                    mai = num_acid;
                    cid_mai = cod;
                }
                if (num_acid < men) {
                    men = num_acid;
                    cid_men = cod;
                }
            }

            soma_vei += num_vei;

            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }

        System.out.println("Maior número de acidentes: " + mai + " | Cidade: " + cid_mai);
        System.out.println("Menor número de acidentes: " + men + " | Cidade: " + cid_men);

        double med_vei = soma_vei / 5.0;
        System.out.println("Média de veículos nas cinco cidades: " + med_vei);

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            double med_acid = soma_acid / (double) cont_acid;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + med_acid);
        }

        sc.close();
    }
}
