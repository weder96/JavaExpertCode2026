import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    // Lista estática simulando as tabelas de um banco de dados
    private static final List<Person> database = new ArrayList<>();

    // Bloco estático para popular o "banco de dados" com 10 pessoas quando a classe for carregada
    static {
        database.add(new Person("Maria Silva"));
        database.add(new Person("João Souza"));
        database.add(new Person("Ana Costa"));
        database.add(new Person("Pedro Oliveira"));
        database.add(new Person("Lucas Santos"));
        database.add(new Person("Mariana Lima"));
        database.add(new Person("Carlos Pereira"));
        database.add(new Person("Fernanda Alves"));
        database.add(new Person("Roberto Ribeiro"));
        database.add(new Person("Juliana Martins"));
        database.add(new Person("John John"));
        
    }

    // Método estático chamado em OptionalExample01
    public static Optional<Person> getPersonOptional() {
        // Retorna a primeira pessoa da lista (Maria Silva) para não quebrar o seu código original
        if (database.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(database.get(0));
    }

    // --- Métodos extras para aproveitar os 10 registros ---

    // Retorna a lista completa com as 10 pessoas
    public static List<Person> findAll() {
        return database;
    }

    // Busca uma pessoa específica pelo nome usando Streams e retornando um Optional
    public static Optional<Person> findByName(String name) {
        return database.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}