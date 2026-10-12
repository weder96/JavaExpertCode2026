import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateCompanyExample {

 static Predicate<Company> p1 = per -> per.getQtyEmployee() >= 100000;
 static Predicate<Company> p2 = per -> per.getPositionRanking() <= 3;

 static BiPredicate<Integer, Integer> p3 = (qtyEmployee, positionRanking) -> qtyEmployee >= 100000
											   && positionRanking <= 3;
 static BiConsumer<String, List<String>> departamentConsumer = (name, departament) ->
			System.out.println(name + " " + departament);

 static Consumer<Company> CompanyConsumer = per -> {
		//if (p1.and(p2).test(per)) {
	if(p3.test(per.getQtyEmployee(), per.getPositionRanking())) {
		departamentConsumer.accept(per.getName(), per.getDepartament());
	}
  };
 public static void main(String[] args) {
	List<Company> CompanyList = CompanyRepository.getAllCompanies();
	CompanyList.forEach(CompanyConsumer);
 }
}
