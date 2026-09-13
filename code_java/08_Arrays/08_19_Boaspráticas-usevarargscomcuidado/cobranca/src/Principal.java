public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

        // Não compila
        // servicoDeCobranca.pagar(fatura);

        // Compila
        // servicoDeCobranca.pagar(fatura, "joao@wsousa.com");

        // Compila
        servicoDeCobranca.pagar(fatura, "joao@wsousa.com",
                "maria@wsousa.com", "jose@wsousa.com");
    }

}
