// Hospede.java
import java.util.Objects;

public class Hospede {
    private String cpf;
    private String nome;

    public Hospede(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospede hospede = (Hospede) o;
        return Objects.equals(cpf, hospede.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}