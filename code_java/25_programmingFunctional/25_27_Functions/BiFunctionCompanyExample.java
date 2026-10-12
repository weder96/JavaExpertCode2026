import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionCompanyExample {
	static BiFunction<String, String, String> bf1 = (a,b) -> (a+" "+b);
	static Predicate<Company> p1 = per -> per.getQtyEmployee() >= 90000;
	static Predicate<Company> p2 = per -> per.getPositionRanking() <= 4;
	static BiFunction<List<Company>, Predicate<Company>, Map<String,BigDecimal>> bf2 = (listOfCompanys, predicate) -> {
		Map<String, BigDecimal> map = new HashMap<String,BigDecimal>();
		listOfCompanys.forEach(per -> {
			if(p1.and(predicate).test(per))
				map.put(per.getName(), per.getMarketValue());
		});
		return map;
	};
	public static void main(String[] args) {
		List<Company> CompanyList = CompanyRepository.getAllCompanies();
		Map<String,BigDecimal> map = bf2.apply(CompanyList,p2);
		map.forEach((key, value) -> System.out.println(key +" - "+ value));
	}
}
 
