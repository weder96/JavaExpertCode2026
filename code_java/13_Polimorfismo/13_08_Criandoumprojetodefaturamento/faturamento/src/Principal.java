import com.wsousa.fiscal.GestorFiscal;
import com.wsousa.fiscal.NotaFiscal;
import com.wsousa.fiscal.NotaFiscalProduto;
import com.wsousa.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nf = new NotaFiscal("Abc", 500);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        gestorFiscal.emitirNotasFiscais(nf, nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }

}
