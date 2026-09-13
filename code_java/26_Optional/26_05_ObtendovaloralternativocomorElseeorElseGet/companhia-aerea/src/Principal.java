import com.wsousa.ciaaerea.Reserva;
import com.wsousa.ciaaerea.ServicoDeBagagem;
import com.wsousa.ciaaerea.ServicoDeReserva;
import com.wsousa.ciaaerea.Voo;

public class Principal {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28AXXX", 2);

        servicoDeReserva.getReservas().forEach(System.out::println);
    }

}
