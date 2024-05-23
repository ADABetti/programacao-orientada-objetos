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

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSegmento() {
    return segmento;
  }

  public void setSegmento(String segmento) {
    this.segmento = segmento;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public ArrayList<Produto> getProdutos() {
    return this.produtos;
  }

  // Métodos:
  public void imprimirProdutos() {
    for (Produto produto : produtos) {
      System.out.println(produto.getNome());
      System.out.println(produto.getPreco());
      System.out.println(produto.getQuantidadeDisponivel());
    }
  }

  public void adicionarProduto(Produto produto) {
    this.produtos.add(produto);
    System.out.println(produto.getNome() + " foi registrado.");
  }
}
