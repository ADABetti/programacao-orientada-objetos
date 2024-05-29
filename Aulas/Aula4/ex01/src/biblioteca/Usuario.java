package biblioteca;

import java.util.ArrayList;

public class Usuario {
  private String nome;
  private int id;
  private String endereco;
  private int idade;
  private ArrayList<Livro> livros = new ArrayList<>();// nao temos set porque podemos somente adicionar valores.

  public void verLivros() {
    for (Livro livro : livros) {
      System.out.println(livro.getTitulo());
    }
  }

  public Usuario(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getName() {
    return this.nome;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void idade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public ArrayList<Livro> getLivros() {
    return this.livros;
  }
}
