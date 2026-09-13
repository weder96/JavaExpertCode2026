import com.wsousa.crm.Contato;
import com.wsousa.crm.IdadeContatoComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        Set<Contato> contatos = new TreeSet<>();
//        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@wsousa.com", 40));
        contatos.add(new Contato("Ana", "ana@wsousa.com", 30));
        contatos.add(new Contato("José", "jose@wsousa.com", 25));
        contatos.add(new Contato("Rosa", "rosa@wsousa.com", 50));
        contatos.add(new Contato("João", "joao@wsousa.com", 70));
        System.out.println("---");

//        contatos.add(new Contato("Maria", "maria@wsousa.com", 20));
//        contatos.add(new Contato("Manoel", "manoel@wsousa.com", 40));

//        contatos.add(null);
//        contatos.add(new Contato("Ana Silva", "ana@wsousa.com", 10));

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

}
