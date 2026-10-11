import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Memoizer {
  public static <T, R> R callMemoized(
    final BiFunction<Function<T,R>, T, R> functionToMemoize, final T input) {
      
    Function<T, R> memoizedFunction = new Function<T, R>() {
      private final Map<T, R> store = new HashMap<>();

      public R apply(final T input) {
        if(!store.containsKey(input)) {
          store.put(input, functionToMemoize.apply(this, input));
        }
        
        return store.get(input);
      }
    };

    return memoizedFunction.apply(input);
  }
}
