import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        // Criar a data e hora atuais
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e hora atuais: " + agora);

        // Criar uma data e hora específica (Ano, Mês, Dia, Hora, Minuto, Segundo)
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2025, 12, 25, 14, 30, 45);
        System.out.println("Data e hora específica: " + dataHoraEspecifica);

        // Formatando a data e hora para um padrão específico
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);
        System.out.println("Data e hora formatada: " + dataHoraFormatada);

        // Convertendo uma String para LocalDateTime
        String textoDataHora = "15/03/2025 08:15:30";
        LocalDateTime dataHoraConvertida = LocalDateTime.parse(textoDataHora, formato);
        System.out.println("Data e hora convertida de String para LocalDateTime: " + dataHoraConvertida);

        // Manipulação de datas e horas - Adição e subtração
        LocalDateTime futuro = agora.plusDays(10).plusHours(5);
        LocalDateTime passado = agora.minusMonths(2).minusMinutes(30);

        System.out.println("Data e hora após adicionar 10 dias e 5 horas: " + futuro);
        System.out.println("Data e hora após subtrair 2 meses e 30 minutos: " + passado);

        // Comparação de datas e horas
        if (agora.isBefore(dataHoraEspecifica)) {
            System.out.println(agora + " é antes de " + dataHoraEspecifica);
        }

        if (agora.isAfter(dataHoraConvertida)) {
            System.out.println(agora + " é depois de " + dataHoraConvertida);
        }

        // Calcular diferença entre duas datas e horas
        long diferencaDias = ChronoUnit.DAYS.between(agora, dataHoraEspecifica);
        long diferencaHoras = ChronoUnit.HOURS.between(dataHoraConvertida, agora);

        System.out.println("Diferença em dias até o Natal de 2025: " + diferencaDias);
        System.out.println("Diferença em horas desde a data convertida: " + diferencaHoras);

        // Obter informações específicas
        int ano = agora.getYear();
        int mes = agora.getMonthValue();
        int dia = agora.getDayOfMonth();
        int hora = agora.getHour();
        int minuto = agora.getMinute();
        int segundo = agora.getSecond();

        System.out.printf("Ano: %d, Mês: %d, Dia: %d\n", ano, mes, dia);
        System.out.printf("Hora: %d, Minuto: %d, Segundo: %d\n", hora, minuto, segundo);
    }
}
