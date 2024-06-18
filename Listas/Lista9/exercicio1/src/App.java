
import eventos.Show;
import eventos.StandUp;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Show
        // Usando o set para fornecer novas informações:
        Show madoninha = new Show();
        madoninha.setNome("Madoninha No BR");
        madoninha.setLocal("Teatro Santander");
        madoninha.setData("04/08/2024");
        madoninha.setArtistas(Arrays.asList("Madona", "Maria Antonieta"));
        madoninha.exibirInformacoes();

        madoninha.comecarEvento();
        madoninha.comecarEvento(true);

        // Usando informações pré-setadas:
        Show chaves = new Show();
        chaves.exibirInformacoes();
        chaves.comecarEvento(true);

        // Stand Up:
        // Usando o set para fornecer novas informações:
        StandUp tiago = new StandUp();
        tiago.setNome("4 amigos");
        tiago.setLocal("Comedy Central");
        tiago.setData("05/07/2024");
        tiago.setComediante("Thiago Ventura");
        tiago.exibirInformacoes();
        tiago.comecarEvento("O que é um pontinho branco no mar?");

        // Usando informações pré-setadas:
        StandUp toninho = new StandUp();
        toninho.exibirInformacoes();
        toninho.comecarEvento("O que é, o que é?");
    }
}
