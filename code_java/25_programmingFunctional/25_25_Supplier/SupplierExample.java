import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<List<Company>> s1 = () -> CompanyRepository.getAllCompanies();
    static Supplier<Company> s2 = () -> CompanyRepository.getCompany();

    public static void main(String[] args) {
        System.out.println("Result 01 :"+ s1.get());
        System.out.println("Result 02 :"+ s2.get());
    }
}
