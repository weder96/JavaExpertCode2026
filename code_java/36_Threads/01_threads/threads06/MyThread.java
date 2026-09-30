public class MyThread implements Runnable {

    private String nome;
    private boolean suspensa;
    private boolean foiTerminada;

    public MyThread(String nome) {
        this.nome = nome;
        this.suspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando a thread: " + nome);

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + nome + " - Contador: " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (suspensa) {
                        wait();
                    }
                    if (this.foiTerminada) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + nome + " interrompida.");
            }
        }

        System.out.println("Thread " + nome + " finalizada.");
    }

    void suspend() {
        this.suspensa = true;
    }

    synchronized void resume() {
        this.suspensa = false;
        notify();
    }

    synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }
}
