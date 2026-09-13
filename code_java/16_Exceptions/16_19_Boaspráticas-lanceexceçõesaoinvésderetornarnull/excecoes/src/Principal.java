import com.wsousa.crm.Cliente;
import com.wsousa.crm.ServicoCadastroCliente;

public class Principal {

    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("João", 15);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastrado.getNome());
    }

}