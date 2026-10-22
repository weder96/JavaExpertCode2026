// CadastroHotel.java[cite: 1]
public class CadastroHotel {
    private HotelRepository repository;

    public CadastroHotel(HotelRepository repository) {
        this.repository = repository;
    }

    public void cadastrarNovoHotel(Hotel hotel) throws HotelJaExistenteException {
        if (repository.buscarPorCnpj(hotel.getCnpj()).isPresent()) {
            throw new HotelJaExistenteException("O hotel com o CNPJ " + hotel.getCnpj() + " já se encontra registado.");
        }
        repository.salvar(hotel);
    }

    public Hotel buscarHotel(String cnpj) throws HotelNaoEncontradoException {
        return repository.buscarPorCnpj(cnpj)
            .orElseThrow(() -> new HotelNaoEncontradoException("Nenhum hotel encontrado com o CNPJ: " + cnpj));
    }
}