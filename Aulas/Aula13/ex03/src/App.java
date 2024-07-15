
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int QUANTIDADE_MUSICAS = 5;
        Scanner scan = new Scanner(System.in);

        Playlist playlist = new Playlist(new ArrayList<>());

        for (int i = 0; i < QUANTIDADE_MUSICAS; i++) {
            int id = Integer.parseInt(scan.nextLine());
            String titulo = scan.nextLine();
            int duracaoEmSegundos = Integer.parseInt(scan.nextLine());
            boolean estaFavoritada = Boolean.parseBoolean(scan.nextLine());

            playlist.addMusica(new Musica(id, titulo, duracaoEmSegundos, estaFavoritada));
        }

        System.out.println("Digite o tempo máximo em segundos para filtrar músicas:");
        int inputTempo = Integer.parseInt(scan.nextLine());

        List<Musica> musicasFiltradas = playlist.verificarDuracao(inputTempo);

        for (Musica musica : musicasFiltradas) {
            System.out.println(musica.getTitulo());
        }
    }
}