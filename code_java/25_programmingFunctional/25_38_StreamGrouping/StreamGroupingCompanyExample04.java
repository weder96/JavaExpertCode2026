import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingCompanyExample04 {

    static void twoLevelGrouping() {
		Map<String,Map<String,List<Company>>> groupedData= CompanyRepository.getAllCompanies()
		.stream()
		.collect(Collectors.groupingBy(Company::getLocation, Collectors.groupingBy(per -> per.getQtyEmployee() >= 100000 ? "Tallest":"Shortest")));
		Stream.of(groupedData).forEach(System.out::println);
	}

	static void twoLevelGroupingCount() {
		Map<String , Integer> groupedData = CompanyRepository.getAllCompanies()
		.stream()
		.collect(Collectors.groupingBy(Company :: getName, Collectors.summingInt(Company :: getQtyEmployee)));
		Stream.of(groupedData).forEach(System.out::println);
	}
    
	static void threeLevelGrouping() {
		Map<String,List<Company>> groupedData = CompanyRepository.getAllCompanies()
				.stream()
				.collect(Collectors.groupingBy(Company::getName, HashMap::new , Collectors.toList()));
		Stream.of(groupedData).forEach(System.out::println);
	}

    public static void main(String[] args) {
        twoLevelGrouping();
        twoLevelGroupingCount();
        threeLevelGrouping();
    }
}
