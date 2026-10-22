// HotelRepository.java
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HotelRepository {
    private List<Hotel> hoteis = new ArrayList<>();

    public void salvar(Hotel hotel) {
        hoteis.add(hotel);
    }

    public List<Hotel> listarTodos() {
        return new ArrayList<>(hoteis); 
    }

    public Optional<Hotel> buscarPorCnpj(String cnpj) {
        return hoteis.stream()
            .filter(h -> h.getCnpj().equals(cnpj))
            .findFirst();
    }
}