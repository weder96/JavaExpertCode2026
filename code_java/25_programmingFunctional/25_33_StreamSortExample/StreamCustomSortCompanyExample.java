import java.util.Comparator;

public class StreamCustomSortCompanyExample {

	public static void main(String[] args) {
		System.out.println("Sort By Name");
		CompanyRepository.getAllCompanies().stream()
		       .sorted(Comparator.comparing(Company::getName))
		       .forEach(System.out::println);
	}
}
