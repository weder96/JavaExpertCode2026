public class MyThreadSum implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculator calculator = new Calculator();

    public MyThreadSum(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " - Iniciando soma dos elementos do array.");

        int soma = 0;
        try {
            soma = calculator.somaArray(this.nums);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Resultado da soma do " + this.nome + ": " + soma);

        System.out.println(this.nome + " - Soma finalizada.");
    }
}
