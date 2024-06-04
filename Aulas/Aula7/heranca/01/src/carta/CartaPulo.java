package carta;

public final class CartaPulo extends Carta {

  // constructor:
  public CartaPulo() {
    super("Pulo");
  }

  // Informações da classe mãe e sobrescrevendo o método:
  @Override
  public void exibirInformacoes() {
    System.out.println(String.format(
        """
            Nome: %s,
            Revelada: %s

            Ação: Pula jogador seguinte.
            """, super.nome, super.revelada));
  }

  // Informações da classe mãe e sobrecarregando (acrescentei parâmetro) o método:
  public void exibirInformacoes(boolean chamarMae) {
    if (chamarMae) {
      super.exibirInformacoes();
      return;
    }
    this.exibirInformacoes();
  }

  @Override
  public void realizarAcao() {
    System.out.println("O joagador pulou.");
  }
}
