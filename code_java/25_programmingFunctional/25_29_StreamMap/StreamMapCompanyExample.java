import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamMapCompanyExample {
 static List<String> toUpperTransform(List<Company> listOfCompanies){
	return listOfCompanies.stream()
			.map(Company :: getName)
			.map(String :: toUpperCase)
			.collect(Collectors.toList());
 }
 static Set<String> toUpperTransformSet(List<Company> listOfCompanies){
	return listOfCompanies.stream()
			.map(Company::getName)
			.map(String::toUpperCase)
			.collect(Collectors.toSet());
 }
 public static void main(String[] args) {
	List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple");
	List<Integer> fruitLength = fruits.stream()
	.map(String::length)
	.collect(Collectors.toList());
	System.out.println("Length List :"+fruitLength);
	System.out.println("To Uppercase Result :"+toUpperTransform(CompanyRepository.getAllCompanies()));
	System.out.println("To Uppercase Set Result :"+toUpperTransformSet(CompanyRepository.getAllCompanies()));		
  }
}
