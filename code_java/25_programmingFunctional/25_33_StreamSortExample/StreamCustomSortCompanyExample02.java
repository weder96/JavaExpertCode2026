import java.util.Comparator;

public class StreamCustomSortCompanyExample02 {
    public static void main(String[] args) {
	    System.out.println("Sort By QtyEmployee");
		    CompanyRepository.getAllCompanies().stream()
		        .sorted(Comparator.comparing(Company :: getQtyEmployee))
		        .forEach(System.out::println); 
    }
}
