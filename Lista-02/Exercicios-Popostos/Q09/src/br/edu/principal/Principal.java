package br.edu.principal;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class Principal {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        int dia = agora.getDayOfMonth();
        int mes = agora.getMonthValue();
        int ano = agora.getYear();
        int hora = agora.getHour();
        int min = agora.getMinute();

        String nomeMes = agora.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        System.out.println("Data: " + dia + "/" + mes + "/" + ano + " – " + nomeMes);
        System.out.println("Hora: " + hora + ":" + min);
    }
}
