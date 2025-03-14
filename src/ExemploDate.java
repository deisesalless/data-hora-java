import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date date = new Date();

        // Exibindo a data e hora atual
        System.out.println("Data e hora de hoje: " + date);

        // Obtendo o timestamp em milissegundos
        long timestamp = date.getTime();
        System.out.println("Timestamp em milissegundos: " + timestamp);

        // Setando um novo valor para o timestamp (exemplo)
        long novoTimestamp = System.currentTimeMillis();
        date.setTime(novoTimestamp);
        System.out.println("Data após mudança de timestamp: " + date);

        // Comparando datas
        Date outraData = new Date();
        if (date.before(outraData)) {
            System.out.println(date + " ocorreu antes de " + outraData);
        } else if (date.after(outraData)) {
            System.out.println(date + " ocorreu depois de " + outraData);
        } else {
            System.out.println(date + " e " + outraData + " são iguais");
        }

        // Convertendo Date para String (formato específico)
        String dataFormatada = date.toString();
        System.out.println("Data formatada: " + dataFormatada);
    }
}
