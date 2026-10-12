import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCompanyExample {
	
	static Predicate<Company> p1 = per -> per.getQtyEmployee() >= 14000;
	static Predicate<Company> p2 = per -> per.getPositionRanking() > 3;

	public static void main(String[] args) {
		List<Company> CompanyList = CompanyRepository.getAllCompanies();
		CompanyList.stream().filter(p1).collect(Collectors.toList());
		
		CompanyList.forEach(per -> {
			if(p1.and(p2).test(per))
				System.out.println(per);
		});
	}
}
