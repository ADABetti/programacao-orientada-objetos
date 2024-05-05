import java.util.Scanner;

public class App {
    public static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número para fazer a verificação: ");
        int numero = Integer.parseInt(READ.nextLine());

        if (verificarSeEhPar(numero)) {
            System.out.println("Eh par");
        } else {
            System.out.println("Não eh par.");
        }
    }

    public static boolean verificarSeEhPar(int numero) {
        return numero % 2 == 0 ? true : false;
    }
}
