public class Caixa<T> {
  private T conteudo;

  // Constructor:
  public Caixa(T conteudo) {
    this.conteudo = conteudo;
  }

  // Getter e setter:
  public T getConteudo() {
    return this.conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

}
