import com.wsousa.crm.Contato;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@wsousa.com", 40));
        contatos.add(new Contato("Ana", "ana@wsousa.com", 30));
        contatos.add(new Contato("José", "jose@wsousa.com", 25));
        contatos.add(new Contato("Rosa", "rosa@wsousa.com", 50));
        contatos.add(new Contato("João", "joao@wsousa.com", 70));
        System.out.println("--");
        contatos.add(new Contato("Josefina", "josefina@wsousa.com", 70));
        System.out.println("--");
        contatos.add(new Contato("Josefina", "josefina@wsousa.com", 70));
        contatos.add(null);
        System.out.println("--");

//        System.out.println(contatos);

        boolean resultado = contatos.contains(
                new Contato("Alaor", "alaor@wsousa.com", 30));
        System.out.println(resultado);
    }

}
