package biblioteca;

public class Livro {
  private String autor;
  private String titulo;
  private int numeroPaginas;
  private int classificacaoIndicativa;
  private boolean estaEmprestado = false;

  // constructor:
  public Livro(String autor, String titulo, int numeroPaginas, int classificacaoIndicativa) {
    this.autor = autor;
    this.titulo = titulo;
    this.numeroPaginas = numeroPaginas;
    this.classificacaoIndicativa = classificarLivro(classificacaoIndicativa);
  }

  private int classificarLivro(int classificacaoIndicativa) {
    if (classificacaoIndicativa < 0) {
      return 0;
    } else if (classificacaoIndicativa > 18) {
      return 18;
    } else {
      return classificacaoIndicativa;
    }
  }

  public void setClassificacaoIndicativa(int classificacaoIndicativa) {
    this.classificacaoIndicativa = classificacaoIndicativa;
  }

  public int getClassificacaoIndicativa() {
    return classificacaoIndicativa;
  }

  public void setEstaEmprestado(boolean estaEmprestado) {
    this.estaEmprestado = estaEmprestado;
  }

  public boolean getEstaEmprestado() {
    return estaEmprestado;
  }

  public void setAutor(String autor) {
    if (autor.isBlank()) {
      this.autor = "DESCONHECIDO";
    } else {
      this.autor = autor;
    }
  }

  public String getAutor() {
    return this.autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  public int getNumeroPaginas() {
    return this.numeroPaginas;
  }

}
