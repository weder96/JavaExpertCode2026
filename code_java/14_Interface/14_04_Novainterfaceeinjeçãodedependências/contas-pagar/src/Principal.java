import com.wsousa.contaspagar.modelo.Holerite;
import com.wsousa.contaspagar.modelo.OrdemServico;
import com.wsousa.contaspagar.servico.ServicoContaPagar;
import com.wsousa.pagamento.Beneficiario;
import com.wsousa.pagamento.MetodoPagamento;
import com.wsousa.pagamento.Pix;
import com.wsousa.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João da Silva", "34999998888", "456789");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "10687799000187", "34466");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }

}
