import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumAvgCompanyExample02 {
    static int sumTotalEmployees() {
        return CompanyRepository.getAllCompanies()
                .stream().collect(Collectors.summingInt(Company::getQtyEmployee));
    }

    static double averageMarketValue() {
        return CompanyRepository.getAllCompanies()
                .stream().collect(Collectors.averagingDouble(n -> n.getMarketValue().doubleValue()));
    }

    public static void main(String[] args) {
        System.out.println("Total Employees :" + sumTotalEmployees());
        System.out.println("Average Height is:" + averageMarketValue());
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int total = intList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total :" + total);
    }
}
