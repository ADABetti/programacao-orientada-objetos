package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends Audiovisual> {
  private List<T> acervo = new ArrayList<>();// COmo adiciono títulos aqui sem ser String?

  public void adicionarItem(T item) {
    acervo.add(item);
  }

  public void listarItens() {
    for (T t : acervo) {
      System.out.println(t);
    }
  }

  public T buscarItem(String titulo) {
    for (T item : acervo) {
      if (item instanceof Jogo) {
        Jogo jogo = (Jogo) item;
        if (jogo.getTitulo().equals(titulo)) {
          return item;
        }
      }
      if (item instanceof Filme) {
        Filme filme = (Filme) item;
        if (filme.getTitulo().equals(titulo)) {
          return item;
        }
      }
    }
    return null;
  }
}
