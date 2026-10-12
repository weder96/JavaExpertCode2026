import java.util.Comparator;

public class StreamCustomReverseSortCompanyExample {

    public static void main(String[] args) {
		System.out.println("Reverse Sort By Name");
		CompanyRepository.getAllCompanies()
            .stream()
    		.sorted(Comparator.comparing(Company::getName).reversed())
	    	.forEach(System.out::println);
   }    
}
