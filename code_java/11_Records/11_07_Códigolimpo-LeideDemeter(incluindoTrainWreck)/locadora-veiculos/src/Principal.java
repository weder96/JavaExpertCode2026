import com.wsousa.locacao.GrupoVeiculo;
import com.wsousa.locacao.Locacao;
import com.wsousa.locacao.servico.ServicoDeLocacao;
import com.wsousa.locacao.Veiculo;

public class Principal {

    public static void main(String[] args) {
        GrupoVeiculo grupo = new GrupoVeiculo("SUV", 450);
        Veiculo veiculo = new Veiculo("ALG-9999", grupo);
        Locacao locacao = new Locacao(veiculo, 5);

        ServicoDeLocacao servicoDeLocacao = new ServicoDeLocacao();
        servicoDeLocacao.confirmarLocacao(locacao);
    }

}
