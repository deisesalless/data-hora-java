import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExemploConversaoHorario {
    public static void main(String[] args) {
        // Fuso horário do país de origem e horário enviado
        String fusoOrigem = "Europe/Madrid"; // Fuso horário da Espanha
        String horaTexto = "02:56:10";       // Horário recebido como String

        // Formatador para ler a hora recebida
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Convertendo a hora recebida para LocalTime
        LocalTime horaRecebida = LocalTime.parse(horaTexto, formatoEntrada);

        // Pegando a data atual para criar o ZonedDateTime completo
        LocalDate dataAtual = LocalDate.now();
        LocalDateTime dataHoraRecebida = LocalDateTime.of(dataAtual, horaRecebida);

        // Criando um ZonedDateTime do país de origem (com o fuso horário)
        ZonedDateTime horarioOrigem = dataHoraRecebida.atZone(ZoneId.of(fusoOrigem));

        // Convertendo para o horário do Brasil (São Paulo)
        ZonedDateTime horarioBrasil = horarioOrigem.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        // Calculando a diferença entre os horários em horas, minutos e segundos
        Duration diferenca = Duration.between(horarioBrasil.toLocalTime(), horarioOrigem.toLocalTime());
        long horas = Math.abs(diferenca.toHours());
        long minutos = Math.abs(diferenca.toMinutesPart());
        long segundos = Math.abs(diferenca.toSecondsPart());

        // Exibindo os horários e a diferença
        System.out.println("Horário no país de origem (" + fusoOrigem + "): " + horarioOrigem.toLocalTime());
        System.out.println("Horário no Brasil (São Paulo): " + horarioBrasil.toLocalTime());
        System.out.printf("Diferença de horário: %02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
