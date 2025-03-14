package moderno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {
    public static void main(String[] args) {
        // Criar a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje);

        // Criar uma data específica (Ano, Mês, Dia)
        LocalDate dataEspecifica = LocalDate.of(2025, 12, 25);
        System.out.println("Data específica: " + dataEspecifica);

        // Formatando a data para um padrão específico
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formato);
        System.out.println("Data formatada: " + dataFormatada);

        // Convertendo uma String para LocalDate
        String textoData = "15/03/2025";
        LocalDate dataConvertida = LocalDate.parse(textoData, formato);
        System.out.println("Data convertida de String para LocalDate: " + dataConvertida);

        // Manipulação de datas - Adição e subtração
        LocalDate futuro = hoje.plusDays(30);
        LocalDate passado = hoje.minusMonths(2);

        System.out.println("Data após adicionar 30 dias: " + futuro);
        System.out.println("Data após subtrair 2 meses: " + passado);

        // Comparação de datas
        if (hoje.isBefore(dataEspecifica)) {
            System.out.println(hoje + " é antes de " + dataEspecifica);
        }

        if (hoje.isAfter(dataConvertida)) {
            System.out.println(hoje + " é depois de " + dataConvertida);
        }

        if (hoje.equals(LocalDate.now())) {
            System.out.println("As datas são iguais.");
        }

        // Calcular diferença entre duas datas
        long diferenca = ChronoUnit.DAYS.between(hoje, dataEspecifica);
        System.out.println("Dias até o Natal de 2025: " + diferenca);

        // Verificar se o ano é bissexto
        boolean anoBissexto = dataEspecifica.isLeapYear();
        System.out.println("O ano de " + dataEspecifica.getYear() + " é bissexto? " + (anoBissexto ? "Sim" : "Não"));
    }
}
