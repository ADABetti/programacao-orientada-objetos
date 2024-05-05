import java.util.Scanner;

public class App {
    public static final Scanner READ = new Scanner(System.in);
    public static final String USUARIO = "admin";
    public static final String SENHA = "senha123";

    public static void main(String[] args) throws Exception {
        System.out.println("Digite o seu usuário: ");
        String usuarioDigitado = READ.nextLine();

        System.out.println("Digite a sua senha: ");
        String senhaDigitada = READ.nextLine();

        validarLogin(usuarioDigitado, senhaDigitada);
    }

    public static void validarLogin(String usuarioDigitado, String senhaDigitada) {
        if (usuarioDigitado.equalsIgnoreCase(USUARIO) && senhaDigitada.equals(SENHA)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }
    }
}
