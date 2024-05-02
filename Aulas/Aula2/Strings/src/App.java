import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);
    String nome = read.nextLine();
    int idade = 29;
    double altura = 150;
    String comidaFavorita = "macarrão";
    String mensagem = String.format(
        """
            Nome: %s
            Idade: %s
            Altura: %s
            Comida favorita: %s
        """,
            nome,
            idade,
            altura,
            comidaFavorita
    );

    System.out.println(mensagem);

    String teste = "teste";
    String teste2 = " ";
    System.out.println(teste.contains("a"));
    System.out.println(teste.isEmpty());
    System.out.println(teste2.isBlank());
    System.out.println(teste.replace("te", "pe"));
    }
}
