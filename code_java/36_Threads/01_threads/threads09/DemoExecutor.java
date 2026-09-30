    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;

    public class DemoExecutor {

        public static void main(String[] args) {
            
            // Criação de um pool fixo de 4 threads utilizando try-with-resources
            try (ExecutorService executor = Executors.newFixedThreadPool(4)) {
                
                // Ciclo para submeter 100 tarefas para o executor
                for (int i = 0; i < 100; ++i) {
                    executor.submit(() -> myTask());
                }
                
            } // Ao terminar este bloco, o executor sofre um 'shutdown' automaticamente
        }

        // Método auxiliar para simular a tarefa a ser executada pelas threads
        private static void myTask() {
            System.out.println("A executar a tarefa na thread: " + Thread.currentThread().getName());
        }
    }


