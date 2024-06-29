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

  // Como fazer?? T buscarItem(String titulo): Busca um item audiovisual pelo
  // título e retorna o item encontrado. (É necessário realizar cast para
  // utilizar o método getTitulo() para comparar o titulo recebido
  // com o do Filme/Jogo
  public T buscarItem(String titulo) {
    for (T item : acervo) {
      if (item.getTitulo().equalsIgnoreCase(titulo)) {
        return item;
      }
    }
  }
}