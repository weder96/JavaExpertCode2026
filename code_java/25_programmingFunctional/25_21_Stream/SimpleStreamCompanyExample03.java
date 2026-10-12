import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamCompanyExample03 {
    public static void main(String[] args) {

        List<String> CompanyDepartament = CompanyRepository
                .getAllCompanies() // List of Companies
                .stream() // Stream of Companys
                .map(Company::getDepartament) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .collect(Collectors.toList());// collection to be returned

        System.out.println("Company Departament List :" + CompanyDepartament);
    }
}
