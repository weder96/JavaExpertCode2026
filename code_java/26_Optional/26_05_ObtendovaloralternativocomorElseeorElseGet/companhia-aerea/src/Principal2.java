import com.wsousa.ciaaerea.Reserva;
import com.wsousa.ciaaerea.ServicoDeReserva;
import com.wsousa.ciaaerea.Voo;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

//        Reserva reserva = servicoDeReserva.buscar("28AXXX").orElse(null);
//        Reserva reserva = servicoDeReserva.buscar("28AXXX")
//                .orElse(new Reserva("00000", voo, "Não informado"));

//        Reserva reserva = servicoDeReserva.buscar("28AXXX")
//                .orElseGet(() -> new Reserva("00000", voo, "Não informado"));

        Reserva reserva = servicoDeReserva.buscar("28AXXX",
                () -> new Reserva("00000", voo, "Não informado"));

        System.out.println(reserva);
    }

}
