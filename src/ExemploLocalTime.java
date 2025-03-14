import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploLocalTime {
    public static void main(String[] args) {
        // Criar a hora atual
        LocalTime agora = LocalTime.now();
        System.out.println("Hora atual: " + agora);

        // Criar uma hora específica (Hora, Minuto, Segundo)
        LocalTime horaEspecificaSegundos = LocalTime.of(14, 30, 45);
        LocalTime horaEspecificaMinutos = LocalTime.of(15, 30);
        System.out.println("Hora específica com segundos: " + horaEspecificaSegundos);
        System.out.println("Hora específica com minutos: " + horaEspecificaMinutos);

        // Formatando a hora para um padrão específico
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = agora.format(formato);
        System.out.println("Hora formatada: " + horaFormatada);

        // Convertendo uma String para LocalTime
        String textoHora = "08:15:30";
        LocalTime horaConvertida = LocalTime.parse(textoHora, formato);
        System.out.println("Hora convertida de String para LocalTime: " + horaConvertida);

        // Manipulação de horas - Adição e subtração
        LocalTime maisUmaHora = agora.plusHours(1);
        LocalTime menosTrintaMinutos = agora.minusMinutes(30);

        System.out.println("Hora após adicionar 1 hora: " + maisUmaHora);
        System.out.println("Hora após subtrair 30 minutos: " + menosTrintaMinutos);

        // Comparação de horas
        if (agora.isBefore(horaEspecificaSegundos)) {
            System.out.println(agora + " é antes de " + horaEspecificaSegundos);
        }

        if (agora.isAfter(horaConvertida)) {
            System.out.println(agora + " é depois de " + horaConvertida);
        }

        // Calcular diferença entre duas horas
        long diferencaHoras = ChronoUnit.HOURS.between(horaConvertida, agora);
        long diferencaMinutos = ChronoUnit.MINUTES.between(horaConvertida, agora);
        long diferencaSegundos = ChronoUnit.SECONDS.between(horaConvertida, agora);

        System.out.println("Diferença em horas: " + diferencaHoras);
        System.out.println("Diferença em minutos: " + diferencaMinutos);
        System.out.println("Diferença em segundos: " + diferencaSegundos);

        // Exibir hora máxima e mínima permitidas
        System.out.println("Hora mínima possível: " + LocalTime.MIN);
        System.out.println("Hora máxima possível: " + LocalTime.MAX);
    }
}
