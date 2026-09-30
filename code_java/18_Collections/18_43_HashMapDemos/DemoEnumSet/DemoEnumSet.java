import java.util.EnumSet;

enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DemoEnumSet {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);

        System.out.println("Todos os dias da semana (always): " + always);
        System.out.println("Nenhum dia (never): " + never);
        System.out.println("Dias úteis (workday): " + workday);
        System.out.println("Segunda, Quarta e Sexta (mwf): " + mwf);
        
        // Exemplo prático de verificação
        Weekday hoje = Weekday.WEDNESDAY;
        if (workday.contains(hoje)) {
            System.out.println("\n" + hoje + " é um dia útil.");
        }
    }
}