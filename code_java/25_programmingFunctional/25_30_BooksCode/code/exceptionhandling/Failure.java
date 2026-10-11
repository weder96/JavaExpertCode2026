public record Failure<T>(Throwable throwable) implements Try<T> {
  @Override
  public T getResult() { throw new RuntimeException("Invalid invocation"); }

  @Override
  public Throwable getError() { return throwable; }    
}
