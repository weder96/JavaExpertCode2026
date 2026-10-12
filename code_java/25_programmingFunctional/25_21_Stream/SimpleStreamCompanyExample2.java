import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleStreamCompanyExample2 {
   public static void main(String[] args) {
	Predicate<Company> p1 = (per) -> per.getQtyEmployee() >=100000 ;
	Predicate<Company> p2 = (per) -> per.getPositionRanking() <= 4;
		
	Map<String,List<String>> CompanyMap = CompanyRepository
			.getAllCompanies() // iterate all Companies
			.stream() // Stream of Companies
			.filter(p1) // Stream of Companies 
			.filter(p2) // Stream of Companies 
			.collect(Collectors					.toMap(Company::getName, Company::getDepartament));
	System.out.println("Company Map :"+CompanyMap);
	
   }
}