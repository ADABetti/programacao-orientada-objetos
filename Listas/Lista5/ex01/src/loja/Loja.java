package loja;

import java.util.ArrayList;

public class Loja {
  private String nome;
  private String segmento;
  private String endereco;
  private ArrayList<Produto> produtos = new ArrayList<>();

  // Constructor:
  public Loja(String nome, String segmento) {
    this.nome = nome;
    this.segmento = segmento;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public String getSegmento() {
    return segmento;
  }

  public String getEndereco() {
    return endereco;
  }

  public ArrayList<Produto> getProdutos() {
    return this.produtos;
  }

  public void adicionarProduto(Produto produto) {
    this.produtos.add(produto);
    System.out.println(produto.getProdutoNome() + " foi registrado.");
  }
}
