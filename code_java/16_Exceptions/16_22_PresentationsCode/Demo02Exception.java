import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Demo02Exception {

    public static void main(String... args) {
        PrintStream ps = System.out;
        InputStreamReader leitor = new InputStreamReader(System.in);
        int[] array = { 1, 2, 3, 4 };
        try {// IOException
            Character ch = (char) leitor.read();
            // NumberFormatException
            int i = Integer.parseInt(ch.toString());
            // ArrayIndexOutOfBoundsException
            ps.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException |
                NumberFormatException |
                IOException e) {
            ps.printf("Um erro aconteceu : %s \n", e);
        } finally {
            ps.println("Sempre passo aqui para fechar todos os recursos");
        }
    } 
}
