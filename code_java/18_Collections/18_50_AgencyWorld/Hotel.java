// Hotel.java[cite: 1]
import java.util.Objects;

public class Hotel {
    private String cnpj;
    private String nome;
    private String cidade;

    public Hotel(String cnpj, String nome, String cidade) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getCnpj() { return cnpj; }
    public String getNome() { return nome; }
    public String getCidade() { return cidade; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(cnpj, hotel.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}