import java.util.Scanner;

public class App {

    public static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int anoDigitado = Integer.parseInt(READ.nextLine());
        int idade = calcularIdade(anoDigitado);
        System.out.println(String.format("Ate o final de 2024 voce tera %s anos", idade));
    }

    public static int calcularIdade(int anoNascimento) {
        return 2024 - anoNascimento;
    }
}
