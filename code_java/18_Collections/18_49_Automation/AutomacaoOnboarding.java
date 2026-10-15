import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AutomacaoOnboarding {

    public static void main(String[] args) {

        // --- FASE 1: List ---
        System.out.println("--- Carga Horária da Equipa ---");
        List<Integer> horasEstudantes = new ArrayList<>(List.of(12, 8, 20, 15, 9, 25));
        
        // TODO: Implementar laço for-each para soma e média


        // --- FASE 2: Set ---
        System.out.println("\n--- Provisionamento IAM ---");
        Set<String> politicasIAM = new HashSet<>(Set.of("S3_READ", "EC2_ADMIN", "LAMBDA_EXECUTE", "S3_READ"));
        
        // TODO: Implementar politicasIAM.forEach(...) com Lambda


        // --- FASE 3: Map ---
        System.out.println("\n--- Status do Onboarding ---");
        Map<String, String> statusAlunos = new HashMap<>();
        statusAlunos.put("2026001", "Fase 1: Fundamentos Spring Boot");
        statusAlunos.put("2026002", "Fase 2: Integração com Bancos de Dados");
        statusAlunos.put("2026003", "Fase 3: Deploy na AWS e Serverless");
        
        // TODO: Implementar statusAlunos.forEach(...) com BiConsumer


        // --- FASE 4: O Desafio (Mutabilidade) ---
        System.out.println("\n--- Limpeza de Dados Inativos ---");
        
        // TODO: Tentar remover valores < 10 com for-each (e comentar o código que causa erro)
        // TODO: Implementar a solução correta sem usar Iterator explícito.
        
        /* 
         * Responda aqui: Por que o for-each lança ConcurrentModificationException ao remover itens?
         * Resposta: 
         */

    }
}