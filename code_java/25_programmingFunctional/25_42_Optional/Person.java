public class Person {
    private String name;

    // Construtor vazio utilizado no seu main
    public Person() {
        this.name = "Visitante"; // Nome padrão para evitar null ao chamar getName()
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}