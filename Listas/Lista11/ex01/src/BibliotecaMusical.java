import exceptions.MusicaNaoEncontradaException;
import java.util.HashMap;
import java.util.Map;

public class BibliotecaMusical {
  private Map<String, Musica> acervo;

  // Constructor:
  public BibliotecaMusical() {
    this.acervo = new HashMap<>();
  }

  // Getter e Setter:
  public Map<String, Musica> getAcervo() {
    return this.acervo;
  }

  public void setAcervo(Map<String, Musica> acervo) {
    this.acervo = acervo;
  }

  // Métodos:
  public void adicionarMusica(String titulo, Musica musica) {
    acervo.put(titulo, musica);
  }

  public void listarMusicas() {
    for (Musica musica : acervo.values()) {
      System.out.println(musica);
    }
  }

  public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
    if (acervo.containsKey(titulo)) {
      return acervo.get(titulo);
    } else {
      throw new MusicaNaoEncontradaException();
    }
  }
}
