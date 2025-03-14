package moderno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDateTimeFormatter {
    public static void main(String[] args) {
        // Criar um DateTimeFormatter com padrão personalizado
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Data e Hora Atuais
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e Hora atuais formatadas: " + agora.format(formatoPersonalizado));

        // Data Atual
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data atual formatada: " + dataAtual.format(formatoData));

        // Hora Atual
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora atual formatada: " + horaAtual.format(formatoHora));

        // Conversão de String para LocalDate
        String dataTexto = "15-03-2025";
        LocalDate dataConvertida = LocalDate.parse(dataTexto, formatoData);
        System.out.println("String convertida para LocalDate: " + dataConvertida);

        // Conversão de String para LocalTime
        String horaTexto = "14:30:45";
        LocalTime horaConvertida = LocalTime.parse(horaTexto, formatoHora);
        System.out.println("String convertida para LocalTime: " + horaConvertida);

        // Conversão de String para LocalDateTime
        String dataHoraTexto = "15/03/2025 08:15:30";
        LocalDateTime dataHoraConvertida = LocalDateTime.parse(dataHoraTexto, formatoPersonalizado);
        System.out.println("String convertida para LocalDateTime: " + dataHoraConvertida);

        // Utilizando formatadores pré-definidos
        DateTimeFormatter formatoISO = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Formato ISO_DATE_TIME: " + agora.format(formatoISO));

        DateTimeFormatter formatoBasicoISO = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Formato BASIC_ISO_DATE: " + dataAtual.format(formatoBasicoISO));

        // Formatadores Localizados
        DateTimeFormatter formatoLocalizado = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        String dataLocalizada = dataAtual.format(formatoLocalizado);
        System.out.println("Data formatada com nome do dia e mês: " + dataLocalizada);
    }
}