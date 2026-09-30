

public class Main {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("one",2 ); 
		
		assert pair.getFirst().equals("one") && pair.getSecond() == 2;
		assert pair.getFirst().equals("one");
		assert pair.getSecond() == 2;		

	}

}