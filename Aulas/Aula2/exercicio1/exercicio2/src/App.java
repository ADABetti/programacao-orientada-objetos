import java.util.Scanner;

public class App {

    public static final Scanner READ = new Scanner (System.in);
    public static String USUARIO = "MeuNomeNaoEhZelda";
    public static String SENHA = "meuNomeEHL1nk"; 
    public static void main(String[] args) throws Exception {
    boolean usuarioAutenticado = false;

        do { 
        String usuarioDigitado = READ.nextLine();
        String senhaDigitada = READ.nextLine();
        
        usuarioAutenticado = verificarCredenciais(usuarioDigitado, senhaDigitada);

        if (!usuarioAutenticado){
            System.out.println("Usuario e/ou senha inválidos!");
        } else {
            System.out.println(String.format("Seja bem-vindo %s", USUARIO));
        }

        } while (!usuarioAutenticado);
    
    }

    public static boolean verificarCredenciais (String usuarioDigitado, String senhaDigitada){
        if (USUARIO.equalsIgnoreCase(usuarioDigitado) && SENHA.equals(senhaDigitada)){
            return true;
        }
        return false;
    }
}
