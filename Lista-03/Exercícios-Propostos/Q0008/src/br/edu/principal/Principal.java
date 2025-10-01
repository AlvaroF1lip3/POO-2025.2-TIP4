package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        if (m_f < m_i) {
            m_f += 60;
            h_f -= 1;
        }
        if (h_f < h_i) {
            h_f += 24;
        }
        int tot_m = m_f - m_i;
        int tot_h = h_f - h_i;
        int total = tot_h * 60 + tot_m;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int hora_i = sc.nextInt();
        System.out.print("Digite os minutos iniciais: ");
        int min_i = sc.nextInt();

        System.out.print("Digite a hora final: ");
        int hora_f = sc.nextInt();
        System.out.print("Digite os minutos finais: ");
        int min_f = sc.nextInt();

        int minutos = calculo(hora_i, min_i, hora_f, min_f);

        System.out.println("Duração do jogo em minutos: " + minutos);

        sc.close();
    }
}
