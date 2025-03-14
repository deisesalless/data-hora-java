package obsoleto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploGregorianCalendar {
    public static void main(String[] args) {
        // Criando uma data específica (Ano, Mês, Dia)
        GregorianCalendar dataEspecifica = new GregorianCalendar(2025, Calendar.DECEMBER, 25);
        System.out.println("Data específica: " + dataEspecifica.getTime());
        System.out.println("Data específica: " + dataEspecifica.get(Calendar.YEAR) + "/" + (dataEspecifica.get(Calendar.MONTH) + 1) + "/" + dataEspecifica.get(Calendar.DAY_OF_MONTH));

        // Criando um calendário com a data e hora atuais
        GregorianCalendar hoje = new GregorianCalendar();
        System.out.println("Data e hora atuais: " + hoje.getTime());

        // Obtendo informações da data atual
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH) + 1; // Janeiro = 0, por isso somamos 1
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        System.out.printf("Ano: %d, Mês: %d, Dia: %d\n", ano, mes, dia);
        System.out.printf("Hora: %d, Minuto: %d, Segundo: %d\n", hora, minuto, segundo);

        // Manipulando datas - Adicionando dias, meses, anos
        hoje.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Data após adicionar 5 dias: " + hoje.getTime());

        hoje.add(Calendar.MONTH, -2);
        System.out.println("Data após subtrair 2 meses: " + hoje.getTime());

        hoje.add(Calendar.YEAR, 1);
        System.out.println("Data após adicionar 1 ano: " + hoje.getTime());

        // Verificando se o ano é bissexto
        int anoTeste = 2025;
        GregorianCalendar calendarioTeste = new GregorianCalendar();
        boolean bissexto = calendarioTeste.isLeapYear(anoTeste);
        System.out.println("O ano " + anoTeste + " é bissexto? " + (bissexto ? "Sim" : "Não"));
    }
}
