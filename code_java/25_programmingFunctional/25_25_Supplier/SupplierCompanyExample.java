import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Supplier;

public class SupplierCompanyExample {	
 static Supplier<Company> s1 = () -> CompanyRepository.getCompany();
 static Supplier<List<Company>> s2 = () -> CompanyRepository.getAllCompanies();
 static Supplier<LocalDate> supplierLocalDate = LocalDate::now;
 static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

 public static void main(String[] args) {
	System.out.println("Result :"+s1.get());
	System.out.println("Result :"+s2.get());
	System.out.println("Equals :"+ LocalDate.now().equals(supplierLocalDate.get()));
	Supplier<String> supplier = () -> dateTimeFormatter.format(LocalDateTime.now());
	System.out.println("Equals2 :"+dateTimeFormatter.format(LocalDateTime.now()).equals(supplier.get()));
 }
}
