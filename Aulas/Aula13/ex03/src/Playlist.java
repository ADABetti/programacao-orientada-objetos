
import java.util.ArrayList;

public class Playlist {
  private ArrayList<Musica> musicas;

  // Construtor vazio:
  public Playlist() {
    this.musicas = new ArrayList<>();
  }

  // Construtor com lista de música:
  public Playlist(ArrayList<Musica> musicas) {
    this.musicas = musicas;
  }

  // Getter e setter:
  public ArrayList<Musica> getMusicas() {
    return this.musicas;
  }

  public void setMusicas(ArrayList<Musica> musicas) {
    this.musicas = musicas;
  }

  // Adicionar música:
  public void addMusica(Musica musica) {
    musicas.add(musica);
  }

  // Verificar tempo em segundos:
  public ArrayList<Musica> verificarDuracao(int duracaoEmSegundos) {
    ArrayList<Musica> musicasFiltradas = new ArrayList<>();
    for (Musica musica : musicas) {
      if (musica.getDuracaoEmSegundos() > duracaoEmSegundos)
        musicasFiltradas.add(musica);
    }
    return musicasFiltradas;
  }
}
