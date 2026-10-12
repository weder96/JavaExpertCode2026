import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReference01 {
    static List<String> mappingName() {
        List<String> names = CompanyRepository.getAllCompanies()
                .stream().map(Company::getName).collect(Collectors.toList());

        List<String> names1 = CompanyRepository.getAllCompanies()
                .stream().collect(Collectors.mapping(Company::getName, Collectors.toList()));
        return names1;
    }

    static Set<String> mappingName1() {
        Set<String> names1 = CompanyRepository.getAllCompanies()
                .stream().collect(Collectors.mapping(Company::getName, Collectors.toSet()));
        return names1;
    }

    static long countTallCompanys() {
        return CompanyRepository.getAllCompanies()
                .stream().filter(per -> per.getQtyEmployee() >= 100000)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        mappingName1().forEach(name -> System.out.format("%s - ", name));
        System.out.println("Total Company count :" + countTallCompanys());
    }
}
