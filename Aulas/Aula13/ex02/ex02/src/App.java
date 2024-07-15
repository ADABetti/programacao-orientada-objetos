
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int QUANTIDADE_MUSICAS = 5;
        Scanner scan = new Scanner(System.in);

        List<Musica> playlist = new ArrayList<>();

        for (int i = 0; i < QUANTIDADE_MUSICAS; i++) {
            int id = Integer.parseInt(scan.nextLine());
            String titulo = scan.nextLine();
            int duracaoEmSegundos = Integer.parseInt(scan.nextLine());
            boolean estaFavoritada = Boolean.parseBoolean(scan.nextLine());

            playlist.add(new Musica(id, titulo, duracaoEmSegundos, estaFavoritada));
        }

        //
        // playlist.add(new Musica(0, "Aquarela", 200, true));
        // playlist.add(new Musica(2, "Beija-flor", 240, false));
        // playlist.add(new Musica(3, "Sonic", 500, false));
        // playlist.add(new Musica(4, "Parco de papel", 430, true));
        // playlist.add(new Musica(5, "Evidências", 330, true));

        for (Musica musica : playlist) {
            if (musica.isEstaFavoritada()) {
                System.out.println(musica.getTitulo());
            }
        }

    }
}
