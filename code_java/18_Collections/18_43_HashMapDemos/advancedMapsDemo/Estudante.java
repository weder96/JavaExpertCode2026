
import java.util.Objects;

public class Estudante {
    private String matricula;
    private String nome;

    public Estudante(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // A sobrescrita do equals e hashCode é vital para usar objetos customizados como chave
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(matricula, estudante.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return nome + " (" + matricula + ")";
    }
}