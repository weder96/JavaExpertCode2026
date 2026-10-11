package br.com.wsousa.stream;

import br.com.wsousa.repository.Company;
import br.com.wsousa.repository.CompanyRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
        s1.forEach(p-> System.out.println(p));
        System.out.println("============================");
        Stream<Integer> s2 = Stream.of(new Integer[] {1,2,3,4,5,6});
        s2.forEach(p-> System.out.println(p));

        CompanyRepository.getAllCompanies().forEach(company -> System.out.println(company.getName()));

        Predicate<Company> qtdFuncionarioPredicate = per -> per.getQtyEmployee() >= 100000;
        Predicate<Company> positionRankingPredicate = per -> per.getPositionRanking() < 3;

        Map<String, List<String>> companyMap = CompanyRepository.getAllCompanies()
                .stream()
                .filter(qtdFuncionarioPredicate.and(positionRankingPredicate))
                .collect(Collectors.toMap(Company::getName, Company::getDepartament));

        System.out.println("CompanyMap "+companyMap);
        System.out.println("====================================");

        Set<Company> companySet = CompanyRepository.getAllCompanies()
                .stream()
                .filter(qtdFuncionarioPredicate.and(positionRankingPredicate))
                .collect(Collectors.toSet());

        System.out.println("CompanySet "+companySet);
        System.out.println("====================================");
    }
}
