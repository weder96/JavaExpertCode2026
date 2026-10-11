
import java.util.List;

public class GoodNames {
  public static void printDetails(List<Driver> drivers) {
  drivers.stream()
    .filter(x -> x.getAge() > 21) //Please avoid meaningless parameter names
    .filter(x -> x.isDriversLicenseValid())
    .map(x -> x.getPrimaryCar())
    .map(c -> c.getRegistration())
    .forEach(r -> System.out.println(r));
  }

  public static void printDetailsConcise(List<Driver> drivers) {
  drivers.stream()
    .filter(driver -> driver.getAge() > 21)
    .filter(driver -> driver.isDriversLicenseValid())
    .map(driver -> driver.getPrimaryCar())
    .map(car -> car.getRegistration())
    .forEach(registration -> System.out.println(registration));
  }
  
  public static void main(String[] args) {
    var drivers = List.of(new Driver(), new Driver());
    
    printDetails(drivers);
    printDetailsConcise(drivers);
  }
}