
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> numeros = new ArrayList<>(List.of("10", "12", "15")); // Create an ArrayList object

        // Método de adicionar:
        numeros.add("1");
        numeros.add("2");
        numeros.add("300");
        System.out.println(numeros);

        // Método para remover, através do index:
        numeros.remove(0);
        System.out.println(numeros);

        // Método para substituir:
        numeros.set(0, "900");

        // Imprima todos os itens da lista:
        for (String numero : numeros) {
            System.out.println(numero);
        }
    }
}
