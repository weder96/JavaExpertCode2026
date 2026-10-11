import java.util.List;

public class UseMethodReferences {
  public static void printDetails(List<Driver> drivers) {
    drivers.stream()
      .filter(driver -> driver.getAge() > 21)
      .filter(driver -> driver.isDriversLicenseValid())
      .map(driver -> driver.getPrimaryCar())
      .map(car -> car.getRegistration())
      .forEach(registration -> System.out.println(registration));
  }

  public static void printDetailsConcise(List<Driver> drivers) {
  drivers.stream()
    .filter(driver -> driver.getAge() > 21)
    .filter(Driver::isDriversLicenseValid)
    .map(Driver::getPrimaryCar)
    .map(Car::getRegistration)
    .forEach(System.out::println);
  }
  
  public static void main(String[] args) {
    var drivers = List.of(new Driver(), new Driver());
    
    printDetails(drivers);
    printDetailsConcise(drivers);
  }
}