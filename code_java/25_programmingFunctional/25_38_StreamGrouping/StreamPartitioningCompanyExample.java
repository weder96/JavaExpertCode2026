import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningCompanyExample {
 static Predicate<Company> p1 = per -> per.getQtyEmployee() >= 100000;
 
 static void byQtyEmployee() {
	Map<Boolean,List<Company>> map =CompanyRepository.getAllCompanies()
	.stream().collect(Collectors.partitioningBy(p1));
	System.out.println("Company Map 1:"+map);
 }
	
 static void byQtyEmployeeWith2Param() {
	Map<Boolean,Set<Company>> map =CompanyRepository.getAllCompanies()
	.stream().collect(Collectors.partitioningBy(p1,Collectors.toSet()));
	System.out.println("Company Map 2:"+map);
 }
	
 static void byQtyEmployeeWithMap() {
	Map<Boolean,Map<String,List<String>>> map =CompanyRepository.getAllCompanies()
	.stream().collect(Collectors.partitioningBy(p1,Collectors.toMap(Company :: getName, Company ::getDepartament)));
	System.out.println("Company Map 3:"+map);
 }

 public static void main(String[] args) {
    byQtyEmployee();
    byQtyEmployeeWith2Param();
    byQtyEmployeeWithMap();
 }
}
