import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        List<Integer> oddNumber = Arrays.asList(1,3,5,7);
        List<Integer> evenNumber = Arrays.asList(2,4,6,8);
            
        List<List<Integer>> listofList = Arrays.asList(oddNumber,evenNumber);
        System.out.println("Before Flatten :"+listofList);

        List<Integer> flattenList = listofList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("After Flatten :"+flattenList);	
        System.out.println("\n Departaments Result with Duplicates :"+departaments(CompanyRepository.getAllCompanies()));
        System.out.println("\n Departaments Result without Duplicates : "+distinctDepartaments(CompanyRepository.getAllCompanies()));
        System.out.println("\n Departaments Count :"+countOfDepartaments(CompanyRepository.getAllCompanies()));
    }

    static List<String> departaments(List<Company> CompanysList){
		return CompanysList.stream()
			.map(Company :: getDepartament)
			.flatMap(List :: stream)
			.collect(Collectors.toList());
	}
	static List<String> distinctDepartaments(List<Company> CompanysList){
		return CompanysList.stream()
			.map(Company :: getDepartament)
			.flatMap(List :: stream)
			.sorted()
			.distinct()
			.collect(Collectors.toList());
	}
	static long countOfDepartaments(List<Company> CompanysList) {
		return CompanysList.stream()
			.map(Company :: getDepartament)
			.flatMap(List :: stream)
			.distinct()
			.count();
	}


    
}
