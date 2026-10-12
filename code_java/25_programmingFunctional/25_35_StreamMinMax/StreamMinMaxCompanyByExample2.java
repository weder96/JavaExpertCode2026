import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxCompanyByExample2 {
    static Optional<Company> getTallestCompany() {
	    return CompanyRepository.getAllCompanies()
	                            .stream()
	                            .collect(Collectors.maxBy(Comparator.comparing(Company::getQtyEmployee)));
    }
    static List<Company> filterMultipleCompanys(){
	    List<Company> CompanyList = new ArrayList<Company>();
	    Optional<Company> maxHeight = getTallestCompany();
	    Company per = maxHeight.isPresent() ? maxHeight.get() : null ;
	    if(null != per) {
		    CompanyList = CompanyRepository.getAllCompanies()
		                                   .stream()
		                                   .filter(Company -> Company.getQtyEmployee()==per.getQtyEmployee())
		                                   .collect(Collectors.toList());
	    }
	    return CompanyList;
    }
    public static void main(String[] args) {
	    System.out.println("Tallest Company :"+getTallestCompany().get());
	    System.out.println("Tallest Group :"+filterMultipleCompanys());
    }
}
