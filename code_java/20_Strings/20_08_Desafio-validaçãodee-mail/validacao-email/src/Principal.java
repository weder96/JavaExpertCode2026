public class Principal {

    public static void main(String[] args) {
        String[] emailsValidos = { "joao@wsousa.com", "joao_silva@wsousa.com",
                "joao.silva@wsousa.com", "joao-silva@wsousa.com",
                "joao123@wsousa.com", "joao@wsousa123.com",
                "joao@java.wsousa.com", "joao@alga-works.com", "joao@email.me",
                "Joao@wsousa.com"
        };

        String[] emailsInvalidos = { "", " joao@wsousa.com", "joao@wsousa.com ",
            "joao @wsousa.com", "joao@ wsousa.com", "joao@wsousa .com",
                "joao@wsousa. com", "joaowsousa.com", "@wsousa.com",
                "joao@wsousa", "joao@wsousa.abcdef", "joao@alga@works.com",
                "joao@wsousa.co1", "joao@wsousa.com", "joao@wsousa.Com",
                "joao.com@wsousa", "joao@.com", "joao@wsousa.",
                "jo#ao@wsousa.com", "joao@alga#works.com"
        };

        for (String email : emailsValidos) {
            if (!ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                        String.format("E-mail %s é válido, mas validador retornou false", email));
            }
        }

        for (String email : emailsInvalidos) {
            if (ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                        String.format("E-mail %s é inválido, mas validador retornou true", email));
            }
        }

        System.out.println("Sucesso! Validador funcionando corretamente.");
    }

}
