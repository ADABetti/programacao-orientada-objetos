
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Métodos de listas:
        List<Bombom> bombons = new ArrayList<>();

        // Método adicionar no fim da lista:
        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Sonho de valsa"));
        bombons.add(new Bombom("Batom"));

        for (Bombom bombom : bombons) {
            System.out.println(bombom.getNome());
        }

        // Método para pegar o valor do índice:
        System.out.println(bombons.get(2).getNome());

        // Método para remover item da lista:
        bombons.remove(0);
        for (Bombom bombom : bombons) {
            System.out.println(bombom.getNome());
        }

        // Método para retornar o tamanho:
        System.out.println(bombons.size());

        // Método para identificar se está vazio (boolean):
        System.out.println(bombons.isEmpty());

        // Método para verificar se contem na lista:
        // Nesse caso, o programa não
        System.out.println(bombons.contains(new Bombom("Batom")));

        // Método para identificar qual o índice do item:
        // Se -1 significa que não tem na lista.
        System.out.println(bombons.indexOf(new Bombom("Lollo")));
        if (bombons.indexOf(new Bombom("Lollo")) == -1) {
            System.out.println("Não achou");
        } else {
            System.out.println("Achou!");
        }

        // Método para limpar lista:
        // bombons.clear();

        // Método para substituir elementos:
        bombons.set(0, new Bombom("Talento"));

        // List.of cria uma lista com itens dentro:
        // Caixa<Bombom> caixa = new Caixa<>(List.of(
        // new Bombom("Lollo"),
        // new Bombom("Batom")));

    }
}
