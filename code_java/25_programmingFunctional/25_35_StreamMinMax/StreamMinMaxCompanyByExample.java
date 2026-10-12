import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxCompanyByExample {
 static Optional<Company> getTallestCompany() {
	return CompanyRepository.getAllCompanies()
	.stream()
	.collect(Collectors.maxBy(Comparator.comparing(Company::getQtyEmployee)));
 }
 static Optional<Company> getShortestCompany() {
 	return CompanyRepository.getAllCompanies()
	.stream()
	.collect(Collectors.minBy(Comparator.comparing(Company::getQtyEmployee)));
 }
 public static void main(String[] args) {
	System.out.println("Tallest Company :"+getTallestCompany().get());
	System.out.println("Shortest Company :"+getShortestCompany().get());
 }
}
