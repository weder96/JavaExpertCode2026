public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        MyThreadSum t1 = new MyThreadSum("Thread Soma 1", array);
        MyThreadSum t2 = new MyThreadSum("Thread Soma 2", array);
    }
}
