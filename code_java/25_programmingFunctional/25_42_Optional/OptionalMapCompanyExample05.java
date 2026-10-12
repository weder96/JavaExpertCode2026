import java.util.Optional;

public class OptionalMapCompanyExample05 {
	public static void main(String[] args) {
		optionalMapCompanyExample();
		optionalFlatMapExample();
		optionalMapFilterExample();
	}
	static void optionalMapCompanyExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional();
		per.ifPresent(company -> {
			String name = per.map(Company::getName).orElse("No Data Found");
			System.out.println("Name :"+name);
		} );
	}
	static void optionalFlatMapExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional();
		if(per.isPresent()) {
			Optional<Address> add = per.flatMap(Company :: getAddress);
			System.out.println("Address :"+add.get());
		}
	}
	static void optionalMapFilterExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional().filter(Company -> Company.getQtyEmployee() >=100000);
		per.ifPresent(Company -> System.out.println(Company.getAddress().get()));
	}
}
