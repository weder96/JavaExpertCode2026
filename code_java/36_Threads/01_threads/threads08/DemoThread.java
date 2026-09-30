public class DemoThread {

    public static void main(String[] args) {

        // Definimos uma tarefa simples (Runnable) para a primeira thread
        Runnable task01 = () -> {
            System.out.println("A executar a task 01 na thread: " + Thread.currentThread().getName());
        };

        // Exemplo 1: Criar uma thread de plataforma e usar .start() para iniciá-la
        Thread thread1 = Thread.ofPlatform().name("thread-nome-1").unstarted(task01);
        
        thread1.start(); // A inicialização é feita explicitamente aqui

        
        // Definimos outra tarefa simples (Runnable) para a segunda thread
        Runnable task02 = () -> {
            System.out.println("A executar a task 02 na thread: " + Thread.currentThread().getName());
        };

        // Exemplo 2: Criar uma thread de plataforma e iniciá-la diretamente. Não é necessário chamar .start()
        Thread thread2 = Thread.ofPlatform().name("thread-nome-2").start(task02);


        // Aguardamos que ambas as threads terminem a sua execução antes de finalizar o programa
        try {
            thread1.join();
            thread2.join();
            System.out.println("Ambas as threads terminaram a execução.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
