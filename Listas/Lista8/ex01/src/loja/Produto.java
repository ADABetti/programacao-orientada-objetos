package loja;

import loja.exceptions.NomeInvalidoException;
import loja.exceptions.PrecoInvalidoException;

public class Produto {
  private String nome;
  private double preco;

  // Lançando as exceções, pelo constructor:
  public Produto(String nome, double preco) throws NomeInvalidoException, PrecoInvalidoException {
    setNome(nome);
    setPreco(preco);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) throws NomeInvalidoException {
    if (nome.length() >= 3) {
      this.nome = nome;
    } else {
      throw new NomeInvalidoException();
    }
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) throws PrecoInvalidoException {
    if (preco > 0) {
      this.preco = preco;
    } else {
      throw new PrecoInvalidoException();
    }
  }
}
