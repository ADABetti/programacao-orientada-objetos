
import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciar Loja Amazon:
        Loja amazon = new Loja("Amazon", "Departamento");
        amazon.setNome("Amazon");
        amazon.getNome();
        amazon.setSegmento("Departamento");
        amazon.getSegmento();
        amazon.setEndereco("Rua do Juca");
        amazon.getEndereco();

        // Instanciar produto Mesa
        Produto mesa = new Produto("mesa", 400, 2);
        mesa.setNome("mesa");
        mesa.getNome();
        mesa.setPreco(400);
        mesa.getPreco();
        mesa.setQuantidadeDisponivel(2);
        mesa.getQuantidadeDisponivel();

        // Instanciar produto cadeira
        Produto cadeira = new Produto("Cadeira", 30, 1);
        cadeira.setNome("cadeira");
        cadeira.getNome();
        cadeira.setPreco(30);
        cadeira.getPreco();
        cadeira.setQuantidadeDisponivel(1);
        cadeira.getQuantidadeDisponivel();

        // Instanciar produto sofá
        Produto sofa = new Produto("Sofa", 500, 4);
        sofa.setNome("sofa");
        sofa.getNome();
        sofa.setPreco(500);
        sofa.getPreco();
        sofa.setQuantidadeDisponivel(4);
        sofa.getQuantidadeDisponivel();

        // Adicionar produtos à loja:
        amazon.adicionarProduto(mesa);
        amazon.adicionarProduto(cadeira);
        amazon.adicionarProduto(sofa);

        // Vender cadeira:
        cadeira.venderProduto(1);
        cadeira.venderProduto(1);

        // Imprimir lista de produtos da Loja Amazon:
        amazon.imprimirProdutos();
    }
}
