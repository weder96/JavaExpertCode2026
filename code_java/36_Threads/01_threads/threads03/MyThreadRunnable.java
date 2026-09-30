public class MyThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MyThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        //Thread thread = new Thread(this);
        //thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " - Contador: " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nome + " - Fim da contagem!");
    }
}
