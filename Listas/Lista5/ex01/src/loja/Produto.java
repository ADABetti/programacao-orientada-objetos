package loja;

public class Produto {
  private String nome;
  private double preco;
  private int quantidadeDisponivel;

  // constructor:
  public Produto(String nome, double preco, int quantidadeDisponivel) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeDisponivel = quantidadeDisponivel;
  }

  // Getter e Setters:

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidadeDisponivel() {
    return this.quantidadeDisponivel;
  }

  public void setQuantidadeDisponivel(int quantidadeDisponivel) {
    this.quantidadeDisponivel = quantidadeDisponivel;
  }

  // Métodos:

  public void venderProduto(int quantidade) {
    if (quantidadeDisponivel > 0) {
      System.out.println(this.nome + " foi vendido");
      quantidadeDisponivel = quantidadeDisponivel - quantidade;
    } else {
      System.out.println("Não temos mais este produto.");
    }
  }

  public void imprimirProduto() {
    System.out.println(String.format(
        """
            Nome do produto: %s
            Preço: R$%s
            Quantidade disponível: %s.
            """, nome, preco, quantidadeDisponivel));
  }
}
