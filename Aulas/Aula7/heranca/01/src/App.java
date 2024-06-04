
import carta.Carta;
import carta.CartaAlterarFuturo;
import carta.CartaPulo;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Carta> monteDeCompras = new ArrayList<>();

        monteDeCompras.add(new CartaPulo());
        monteDeCompras.add(new CartaAlterarFuturo());

        CartaPulo pulo = new CartaPulo();
        pulo.exibirInformacoes();
    }
}
