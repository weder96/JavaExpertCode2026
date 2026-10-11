public class AirportInfoException extends Exception {
  public AirportInfoException(String message) {
    super(message);
  }
  
  public AirportInfoException(Throwable cause) {
    super(cause);
  }

  public AirportInfoException(String message, Throwable cause) {
    super(message, cause);
  }
}