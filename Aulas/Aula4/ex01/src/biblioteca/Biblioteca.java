package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
  private String nome;
  private String endereco;
  private ArrayList<Livro> livros = new ArrayList<>();

  public Biblioteca(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
  }

  public void emprestarLivro(Usuario usuario, Livro livro) {
    if (!livros.contains(livro)) {
      System.out.println("Sinto muito, não temos este livro.");
      return;
    }

    if (usuario.getIdade() < livro.getClassificacaoIndicativa()) {
      System.out.println("Livro não indicado para esta idade");
      return;
    }

    if (livro.getEstaEmprestado()) {
      System.out.println("Livro está emprestado");
      return;
    }

    System.out.println("Está aqui " + livro.getTitulo());
    livro.setEstaEmprestado(true);
    usuario.getLivros().add(livro);
  }

  public ArrayList<Livro> getLivros() {
    return this.livros;
  }
}
