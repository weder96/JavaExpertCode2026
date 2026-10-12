import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamGroupingCompanyExample03 {
	static void groupByLocation() {
		Map<String,List<Company>> groupedData = CompanyRepository.getAllCompanies().stream().collect(Collectors.groupingBy(Company :: getLocation));
		groupedData.entrySet().forEach(per -> System.out.println("Key :"+per.getKey()+"/ Value :"+per.getValue()));
		Stream.of(groupedData).forEach(System.out::println);
	}

	static void groupByQtyEmployee() {
		Map<String,List<Company>> groupedData = CompanyRepository.getAllCompanies().stream()
				.collect(Collectors.groupingBy(per -> per.getQtyEmployee() >= 100000 ? "Tallest":"Shortest"));
		Stream.of(groupedData).forEach(System.out::println);
	}

    public static void main(String[] args) {
		groupByLocation();
		groupByQtyEmployee();
    }
}
