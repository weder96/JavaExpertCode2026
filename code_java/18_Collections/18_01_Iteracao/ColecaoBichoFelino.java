import java.util.ArrayList;
import java.util.List;

// Classes de suporte para que o código compile
class Felino {
    public void fazerRuido() {
        System.out.println("Som de felino");
    }
}

class Leao extends Felino {
    @Override
    public void fazerRuido() {
        System.out.println("Rugido do leão!");
    }
}

public class ColecaoBichoFelino {

    public void addAnimal(List<? extends Felino> animais) {
        // animais.add(new Leao()); // não pode adicionar quando é utilizado <? extends Felino>
        for (Felino bicho : animais) {
            bicho.fazerRuido();
        }
    }

    public static void main(String[] args) {
        List<Leao> animais = new ArrayList<Leao>();
        animais.add(new Leao());
        
        ColecaoBichoFelino colecao = new ColecaoBichoFelino();
        colecao.addAnimal(animais);
    }
}