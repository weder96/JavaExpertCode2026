import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramFilterMapS02 {
    public static void main(String[] args) {
        List<Pessoa>  pessoas = Arrays.asList(
                new Pessoa("Joao", 32),
                        new Pessoa("Antonio", 20),
                        new Pessoa("Maria", 18),
                       // new Pessoa("Pedro", 18),
                        new Pessoa("Angela", 30)
        );

        Stream<Pessoa> streamPessoas = pessoas.stream();
        Integer somaIdade = streamPessoas.mapToInt(p -> p.getIdade()).sum();
        System.out.println(somaIdade);
        assert somaIdade == 100;

        Stream<Pessoa> streamPessoas2 = pessoas.stream();
        Integer maiorIdade= streamPessoas2.mapToInt(p -> p.getIdade()).max().getAsInt();
        System.out.println(maiorIdade);
        assert maiorIdade == 32;

        Stream<Pessoa> streamPessoas3 = pessoas.stream();
        Integer menorIdade= streamPessoas3.mapToInt(p -> p.getIdade()).min().getAsInt();
        System.out.println(menorIdade);
        assert menorIdade == 18;


        Stream<Pessoa> streamPessoas4 = pessoas.stream();

        IntSummaryStatistics intSummStat  = streamPessoas4
                .mapToInt(p -> p.getIdade()).summaryStatistics();

        System.out.println(intSummStat.getSum());
        System.out.println(intSummStat.getMax());
        System.out.println(intSummStat.getMin());
        System.out.println(intSummStat.getAverage());
        System.out.println(intSummStat.getCount());


        Map<Integer, List<Pessoa>> map = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));
        map.get(18).forEach(p -> System.out.println("Map["+p.getNome()+"]"));


        Optional<Pessoa> optPessoa = pessoas.stream().filter(p -> p.getIdade() > 60).findFirst();
        if (optPessoa.isPresent()) {
            Pessoa p = optPessoa.get();
            System.out.println(p.getNome() +"-"+ p.getIdade());
        }

        optPessoa.ifPresent(p -> System.out.println(p.getNome() +"-"+ p.getIdade()));

        // optPessoa.orElseThrow();
        optPessoa.orElse(new Pessoa("Joao", 28));
        optPessoa.ifPresent(p -> System.out.println(p.getNome() +"-"+ p.getIdade()));
    }
}
