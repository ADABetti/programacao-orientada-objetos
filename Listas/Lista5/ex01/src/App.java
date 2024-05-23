
import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja amazon = new Loja("Amazon", "Departamento");
        Produto mesa = new Produto("mesa", 400, 2);
        Produto cadeira = new Produto("Cadeira", 30, 1);
        Produto sofa = new Produto("Sofa", 500, 4);

        amazon.setEndereco("Rua do Juca");
        System.out.println(amazon.getNome());
        amazon.getSegmento();
        amazon.getEndereco();

        amazon.adicionarProduto(mesa);
        amazon.adicionarProduto(cadeira);
        amazon.adicionarProduto(sofa);

        cadeira.venderProduto(1);
        cadeira.venderProduto(1);

        // Como devo listar os produtos da loja?
        //System.out.println(amazon.getProdutos());
    }
}
