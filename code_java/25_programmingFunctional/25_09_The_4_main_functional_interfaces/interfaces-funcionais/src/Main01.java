import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main01 {

    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.startsWith("T");
        boolean startsWithT = predicate.test("Thomas");
        System.out.println(startsWithT);

        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate date = function.apply("2023-09-13");
        System.out.println(date);

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dateTime = supplier.get();
        System.out.println(dateTime);

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello, diver");
    }

}