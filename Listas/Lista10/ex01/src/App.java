import java.util.List;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        Filme origem = new Filme("A origem", "Gasparzinho", List.of("Lollo", "Ronaldinho"));
        Jogo mario = new Jogo("Mario Bros", "Nintendo");
        Jogo sonic = new Jogo("Sonic", "Sega");

        Locadora locadora = new Locadora<>();

        // Como eu imprimo o valor e não o endereço nesse caso?
        locadora.adicionarItem(origem);
        locadora.adicionarItem(mario);
        locadora.adicionarItem(sonic);
        locadora.listarItens();
        locadora.buscarItem("Mario Bros").exibirInfo();
        locadora.buscarItem("A origem").exibirInfo();
    }
}
