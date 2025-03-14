import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {
    public static void main(String[] args) {
        // Criar um objeto Date com a data e hora atuais
        Date hojeAgora = new Date();
        System.out.println("Formato padrão do date: " + hojeAgora);

        // Criar um SimpleDateFormat com um formato específico
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formato3 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        SimpleDateFormat formato4 = new SimpleDateFormat("EEEE, dd-MM-yyyy HH:mm");

        // Formatando a data atual para String
        System.out.println("Data formatada (formato 1): " + formato1.format(hojeAgora));
        System.out.println("Data formatada (formato 2): " + formato2.format(hojeAgora));
        System.out.println("Data formatada (formato 3): " + formato3.format(hojeAgora));
        System.out.println("Data formatada (formato 4): " + formato4.format(hojeAgora));

        // Convertendo uma String para Date usando o SimpleDateFormat
        String dataTexto = "25/12/2025";
        try {
            Date dataConvertida = formato1.parse(dataTexto);
            System.out.println("Data convertida de String para Date: " + dataConvertida);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
        }

        // Exibindo outros formatos personalizados
        SimpleDateFormat formato5 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat formato6 = new SimpleDateFormat("hh:mm a");

        System.out.println("Data formatada (formato ISO 8601): " + formato5.format(hojeAgora));
        System.out.println("Hora formatada (formato AM/PM): " + formato6.format(hojeAgora));
    }
}
