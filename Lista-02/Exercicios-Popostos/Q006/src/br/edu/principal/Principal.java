package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double salMin = 450.0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o código do funcionário: ");
            int codigo = sc.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            int nht = sc.nextInt();

            String turno;
            do {
                System.out.print("Digite o turno (M, V ou N): ");
                turno = sc.next().toUpperCase();
            } while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N"));

            String categoria;
            do {
                System.out.print("Digite a categoria (G ou O): ");
                categoria = sc.next().toUpperCase();
            } while (!categoria.equals("G") && !categoria.equals("O"));

            double valorHora;
            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valorHora = salMin * 0.18;
                } else {
                    valorHora = salMin * 0.15;
                }
            } else { // Operário
                if (turno.equals("N")) {
                    valorHora = salMin * 0.13;
                } else {
                    valorHora = salMin * 0.10;
                }
            }

            double salInicial = nht * valorHora;

            double aux;
            if (salInicial <= 300) {
                aux = salInicial * 0.20;
            } else if (salInicial < 600) {
                aux = salInicial * 0.15;
            } else {
                aux = salInicial * 0.05;
            }

            double salFinal = salInicial + aux;

            System.out.printf("Código: %d | Horas: %d | Valor hora: R$ %.2f | Salário inicial: R$ %.2f | Auxílio: R$ %.2f | Salário final: R$ %.2f%n",
                    codigo, nht, valorHora, salInicial, aux, salFinal);
        }

        sc.close();
    }
}
