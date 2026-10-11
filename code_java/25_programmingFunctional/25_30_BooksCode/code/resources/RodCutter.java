

import java.util.List;

public class RodCutter {
  private boolean mustFail;
  
  public RodCutter(final boolean fail) { mustFail = fail; }

  public void setPrices(final List<Integer> prices) {
    //...
    if(mustFail) {
      throw new RodCutterException("Invalid prices");
    }
  }

  public int maxProfit(final int length) {
    if (length == 0) {
      throw new RodCutterException("length should be greater than zero");
    }
    
    return 0;
  }
}
