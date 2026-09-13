public class Principal {

    public static void main(String[] args) {
        String nome = "João da Silva";

        String html1 = """
                <a href="mailto:joao@gmail.com">
                   %s - joao@gmail.com
                </a>
                <a>
                   abc@wsousa.com
                </a>
                <a>
                    xyz@wsousa.com
                </a>
                <strong>maria@wsousa.com</strong>""".formatted(nome);

        System.out.println(html1);
    }

}
