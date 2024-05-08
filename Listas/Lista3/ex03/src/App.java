import java.util.Scanner;

public class App {
    public static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String palavra1 = READ.nextLine();
        String palavra2 = READ.nextLine();

        compararPalavras(palavra1, palavra2);
    }

    public static boolean compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao identicas");
            return true;
        } else if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
            return true;
        } else {
            System.out.println("As palavras sao diferentes");
            return false;
        }
    }
}
