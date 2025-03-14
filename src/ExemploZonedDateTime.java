import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploZonedDateTime {
    public static void main(String[] args) {
        // Criar o horário atual no fuso horário do sistema
        ZonedDateTime agora = ZonedDateTime.now();
        System.out.println("Data e hora atuais no fuso horário do sistema: " + agora);

        // Criar um ZonedDateTime especificando um fuso horário
        ZonedDateTime horarioNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Data e hora atuais em Nova York: " + horarioNY);

        // Criar um ZonedDateTime com data, hora e fuso horário específicos
        ZonedDateTime dataHoraEspecifica = ZonedDateTime.of(
                2025, 12, 25, 15, 30, 0, 0, ZoneId.of("Europe/London"));
        System.out.println("Data e hora específica em Londres: " + dataHoraEspecifica);

        // Converter LocalDateTime para ZonedDateTime
        LocalDateTime dataHoraLocal = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        ZonedDateTime dataHoraZona = dataHoraLocal.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e hora convertida para fuso horário de São Paulo: " + dataHoraZona);

        // Converter ZonedDateTime para um fuso horário diferente
        ZonedDateTime horarioTrocado = dataHoraZona.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Mesma data e hora convertida para Tóquio: " + horarioTrocado);

        // Formatando ZonedDateTime
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        System.out.println("Data e hora formatada (São Paulo): " + dataHoraZona.format(formato));
        System.out.println("Data e hora formatada (Tóquio): " + horarioTrocado.format(formato));

        // Comparação entre horários
        if (agora.isBefore(horarioNY)) {
            System.out.println("O horário atual é anterior ao horário em Nova York.");
        }

        if (horarioTrocado.isAfter(dataHoraZona)) {
            System.out.println("O horário em Tóquio é posterior ao horário em São Paulo.");
        }

        // Diferença entre dois horários
        long diferencaHoras = ChronoUnit.HOURS.between(dataHoraZona, horarioTrocado);
        System.out.println("Diferença de horas entre São Paulo e Tóquio: " + diferencaHoras + " horas");

        // Listar todos os ZoneIds disponíveis
        System.out.println("\nTodos os fusos horários disponíveis:");
        ZoneId.getAvailableZoneIds().stream().limit(10).forEach(System.out::println); // Mostra os 10 primeiros
    }
}
