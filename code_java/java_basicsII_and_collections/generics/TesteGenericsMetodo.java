// Classes de suporte para que o código compile
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}

public class TesteGenericsMetodo {
    public static void main(String[] args) {
        // Sintaxe para a invocação de método genérico
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");

        boolean same1 = Util.<Integer, String>compare(p1, p2);
        System.out.println("Compare : "+ same1);

        // Usando inferência de tipos:
        Pair<String, String> p3 = new Pair<>("AP", "apple");
        Pair<String, String> p4 = new Pair<>("PE", "pear");
        boolean same2 = Util.compare(p3, p4);
        System.out.println("Compare : "+ same2);
    }
}
