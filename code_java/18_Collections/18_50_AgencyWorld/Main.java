// Main.java
public class Main {
    public static void main(String[] args) {
        HotelRepository hotelRepo = new HotelRepository();
        
        // O repositório de hóspedes já arranca com 10 registos
        HospedeRepository hospedeRepo = new HospedeRepository();
        
        CadastroHotel cadastroHotel = new CadastroHotel(hotelRepo);

        System.out.println("Hóspedes registados: " + hospedeRepo.listarTodos().size());
        
        for(Hospede h : hospedeRepo.listarTodos()) {
            System.out.println("- " + h.getNome());
        }

        try {
            cadastroHotel.cadastrarNovoHotel(new Hotel("12.345/0001-99", "Hotel Paraíso", "Lisboa"));
            System.out.println("\nHotéis registados com sucesso!");

            // A testar a exceção de hotel duplicado[cite: 1]
            cadastroHotel.cadastrarNovoHotel(new Hotel("12.345/0001-99", "Hotel Duplicado", "Porto"));

        } catch (HotelJaExistenteException e) {
            System.err.println("Erro no registo: " + e.getMessage());
        }

        try {
            // A testar a exceção de hotel não encontrado[cite: 1]
            Hotel hotel = cadastroHotel.buscarHotel("00.000/0000-00");
            System.out.println("Encontrado: " + hotel.getNome());
        } catch (HotelNaoEncontradoException e) {
            System.err.println("Erro na pesquisa: " + e.getMessage());
        }
    }
}