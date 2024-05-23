package loja;

public class Produto {
  private String nome;
  private double preco;
  private int quantidadeDisponivel;

  public void venderProduto(int quantidade) {
    if (quantidadeDisponivel > 0) {
      System.out.println("Produto foi vendido");
      quantidadeDisponivel = quantidadeDisponivel - quantidade;
    } else {
      System.out.println("Não temos mais este produto.");
    }
  }

  // constructor:
  public Produto(String nome, double preco, int quantidadeDisponivel) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeDisponivel = quantidadeDisponivel;
  }

  public void imprimirProduto() {
    System.out.println(String.format(
        """
            Nome do produto: %s
            Preço: R$%s
            Quantidade disponível: %s.
            """, nome, preco, quantidadeDisponivel));
  }

  public String getProdutoNome() {
    return this.nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public int getQuantidadeDisponivel() {
    return this.quantidadeDisponivel;
  }
}
