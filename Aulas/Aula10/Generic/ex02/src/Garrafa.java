
public class Garrafa<T extends Liquido> {
  private T conteudo;

  public Garrafa(T conteudo) {
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return this.conteudo;
  }

  // cast: Converte o tipo de dado para outro tipo:
  public void exibirInfo() {
    // O if verifica se o genérico é do tipo suco e já traz os métodos disponíveis
    // nessa classe:
    if (conteudo instanceof Suco) {
      Suco suco = (Suco) conteudo;
      System.out.println(suco.getEhNatural());
      System.out.println(suco.getSabor());
      return;
    }

    if (conteudo instanceof Refrigerante) {
      Refrigerante refrigerante = (Refrigerante) conteudo;
      System.out.println(refrigerante.getTemGas());
      System.out.println(refrigerante.getSabor());
    }
  }
}
