import com.wsousa.banco.Conta;
import com.wsousa.banco.ContaEspecial;
import com.wsousa.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(300);

        contaEspecial.debitarTarifaMensal();

        Conta conta = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(contaEspecial == conta);
    }

}