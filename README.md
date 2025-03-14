# Manipulação de Datas e Horas no Java

## Classes Tradicionais (Obsoletas a partir do Java 8)

- **`Date`**: A classe `Date` do Java é considerada obsoleta desde o Java 8.
- **`SimpleDateFormat`**: Utilizada para formatar e analisar datas conforme um padrão específico.
- **`GregorianCalendar`**: Herda de `Calendar` e manipula datas usando o calendário Gregoriano.

## API Moderna de Datas e Horas (Java 8+)

A partir do Java 8, a API moderna de datas e horas (`java.time`) é a mais recomendada para manipulação de datas e horas. Abaixo estão as principais classes:

- **`LocalDate`**: Representa apenas a data (ano, mês e dia).
- **`LocalTime`**: Lida exclusivamente com o horário (hora, minuto, segundo e nanossegundo).
- **`LocalDateTime`**: Combina data e hora, mas sem informações de fuso horário.
- **`DateTimeFormatter`**: Utilizado para formatar e analisar objetos de data e hora.
- **`ZonedDateTime`**: Lida com data, hora e fuso horário, sendo ideal para operações que exigem contexto de fuso horário.

### Conclusão

A API **`java.time`** é mais robusta, segura e intuitiva para manipulação de datas e horas em Java. Recomenda-se substituir as classes antigas (**`Date`**, **`SimpleDateFormat`**, **`GregorianCalendar`**) pelas novas classes da API moderna.
