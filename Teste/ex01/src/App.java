import java.util.*;

public class App {

    public static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Digite o número para calcular a tabuada: ");
        int numero = Integer.parseInt(READ.nextLine());
        calcularTabuada(numero);
    }

    public static void calcularTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(
                    String.format(
                            "%s x %s = %s", numero, i, numero * i));
        }
    }
}
