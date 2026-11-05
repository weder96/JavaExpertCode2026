import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CompanyRepository {

    public static List<Company> getAllCompanies() {
        Company c1 = new Company("Apple", 92600, new BigDecimal(2200000000000.00), 1, false,"USA", Arrays.asList("Streaming", "Personal Computer", "Smartphones", "System Operational Mac", "System Operational IOS"));
        Company c2 = new Company("Microsoft", 166000,  new BigDecimal(1865000000000.00), 2,false , "USA",Arrays.asList("System Operational Windows", "Cloud Computing", "Social Network Linkedin"));
        Company c3 = new Company("Amazon", 613000,  new BigDecimal(1591000000000.00), 3, false, "USA",Arrays.asList("Cloud Computing", "e-commerce", "Invest Startups"));
        Company c4 = new Company("Alphabet Inc", 85050,  new BigDecimal(1505000000000.00), 4, false, "USA",Arrays.asList("Search Web Google", "System Operational Android", "Cloud Computing"));
        Company c5 = new Company("Facebook", 48000,  new BigDecimal(852000000000.00), 5, false, "USA",Arrays.asList("Social Network Facebook", "Social Network Instagram", "Social Network WhatsApp"));
        Company c6 = new Company("Tencent", 54309,  new BigDecimal(731000000000.00), 6, false,"CHI", Arrays.asList("Games League of Legends", "Games Fortnite", "Network Chineses", "Web Services","Smartphones"));
        Company c7 = new Company("Alibaba", 34985,  new BigDecimal(636000000000.00), 7, false, "CHI",Arrays.asList("e-commerce", "digital midia"));
        return Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
    }

    public static Company getCompany() {
        return new Company("Samsung", 17400,  new BigDecimal(636000000000.00), 9, false, "KOR", Arrays.asList("Eletronic", "Personal Computer", "Smartphones"));
    }

    public static Optional<Company> getCompanyOptional() {
        Company comp = getCompany();
        comp.setAddress(Optional.of(new Address("1600 Amphitheatre Pkwy", "Mountain View", "California", "USA", 94043)));
        return Optional.of(comp);
    }
}
