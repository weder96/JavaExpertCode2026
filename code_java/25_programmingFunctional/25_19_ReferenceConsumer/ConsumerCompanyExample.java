import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerCompanyExample {

    static Consumer<Company> c1 = (p) -> System.out.println(p);
    static Consumer<Company> c2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<Company> c3 = (p) -> System.out.println(p.getDepartament());

    static List<Company> companyList = CompanyRepository.getAllCompanies();

    static Predicate<Company> p3 = (p) -> p.getLocation().equals("USA");
    static Predicate<Company> p4 = (p) -> p.getPositionRanking() > 3 ;

    static void imprimirDepartamentos(){
        companyList.forEach(c1.andThen(c2));
    }

    static void printCondition(){
        companyList.stream().filter(p-> p3.negate().and(p4).test(p)).forEach(p2 -> c2.andThen(c3).accept(p2));
    }

    public static void main(String[] args) {
        //imprimirDepartamentos();
        printCondition();
    }
}
