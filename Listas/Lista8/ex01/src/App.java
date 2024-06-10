import loja.Produto;
import loja.exceptions.NomeInvalidoException;
import loja.exceptions.PrecoInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
        Produto mesa = new Produto("mesa", 340);
        System.out.println(mesa.getNome());
        System.out.println(mesa.getPreco());

        try {
            Produto pa = new Produto("pa", 34);
            Produto carro = new Produto("carro", -80);
        } catch (NomeInvalidoException | PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Tente novamente.");
        }

    }
}
