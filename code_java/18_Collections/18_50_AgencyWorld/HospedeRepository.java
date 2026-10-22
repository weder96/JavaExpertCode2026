// HospedeRepository.java
import java.util.HashSet;
import java.util.Set;

public class HospedeRepository {
    private Set<Hospede> hospedes = new HashSet<>();

    public HospedeRepository() {
        // A popular com 10 registos iniciais
        salvar(new Hospede("111.111.111-11", "João Silva"));
        salvar(new Hospede("222.222.222-22", "Maria Santos"));
        salvar(new Hospede("333.333.333-33", "Ana Costa"));
        salvar(new Hospede("444.444.444-44", "Pedro Gomes"));
        salvar(new Hospede("555.555.555-55", "Carlos Rocha"));
        salvar(new Hospede("666.666.666-66", "Diana Pinto"));
        salvar(new Hospede("777.777.777-77", "Bruno Alves"));
        salvar(new Hospede("888.888.888-88", "Clara Mendes"));
        salvar(new Hospede("999.999.999-99", "Paulo Ribeiro"));
        salvar(new Hospede("000.000.000-00", "Teresa Fernandes"));
    }

    public boolean salvar(Hospede hospede) {
        return hospedes.add(hospede);
    }

    public Set<Hospede> listarTodos() {
        return new HashSet<>(hospedes);
    }
}