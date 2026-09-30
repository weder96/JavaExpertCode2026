import java.util.HashMap;
import java.util.Map;

public class DemoHashMapAvancado {
    public static void main(String[] args) {
        // Mapeamento de estudantes numa fábrica de software para o seu nível de "Fine Tuning"
        Map<Estudante, String> nivelOnboarding = new HashMap<>();

        Estudante e1 = new Estudante("2026001", "Ana Silva");
        Estudante e2 = new Estudante("2026002", "Bruno Costa");
        Estudante e3 = new Estudante("2026001", "Ana Silva"); // Mesma matrícula que e1

        nivelOnboarding.put(e1, "Fase 1: Fundamentos Spring Boot");
        nivelOnboarding.put(e2, "Fase 2: Integração com Bancos de Dados");        
        nivelOnboarding.put(e3, "Fase 3: Deploy na AWS e Serverless");

        nivelOnboarding.forEach((estudante, fase) -> {
            System.out.println("Estudante: " + estudante + " -> Estado: " + fase);
        });
        nivelOnboarding.computeIfAbsent(new Estudante("2026004", "Diana"), k -> "Fase 1: Fundamentos Spring Boot");
        System.out.println("\nApós a inserção segura da Diana:");
        System.out.println("Total de alunos no programa: " + nivelOnboarding.size());
    }
}
