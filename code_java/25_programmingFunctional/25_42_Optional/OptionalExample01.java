import java.util.Optional;

public class OptionalExample01 {
 public static void main(String[] args) {
	System.out.println("Result :"+myName("John"));
	Optional<String> name = Optional.ofNullable(myName("John"));
	String name1 = Optional.ofNullable(myName("John")).get();
	System.out.println(name.isPresent() ? name.get():"No Data Found");
	System.out.println("Person Name :"+personName(new Person()));
	Optional<String> personname = personNameWithOptional(PersonRepository.getPersonOptional());
	System.out.println("The Optional Person Name is :"+personname.get());
 }
	
 static String myName(String name) {
		return name;		
 }
 static String personName(Person per) {  return per!=null ? per.getName() : "No Data Found"; }
 static Optional<String> personNameWithOptional(Optional<Person> per){
 	return  (per.isPresent()) ?  per.map(Person :: getName) : Optional.empty();
 }
}

