import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, String> servicosNuvem = new HashMap<>();

        servicosNuvem.put("EC2", "Elastic Compute Cloud");
        servicosNuvem.put("S3", "Simple Storage Service");
        servicosNuvem.put("RDS", "Relational Database Service");
        servicosNuvem.put("Lambda", "Serverless Compute");
        servicosNuvem.put("DynamoDB", "NoSQL Database");

        String keyToSearch = "Lambda";

        if (servicosNuvem.containsKey(keyToSearch)) {
            System.out.println("Serviço encontrado: " + keyToSearch + " -> Descrição: " + servicosNuvem.get(keyToSearch));
        } else {
            System.err.println("Chave não existe");
        }
    }
}