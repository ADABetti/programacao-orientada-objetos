package carta;

public final class CartaAlterarFuturo extends Carta {

  // Constructor:
  public CartaAlterarFuturo() {
    super("Alterar futuro");
  }

  // Informações da classe mãe e sobrescrevendo método:
  @Override
  public void exibirInformacoes() {
    System.out.println(String.format(
        """
            Nome: %s,
            Revelada: %s

            Carta altera a estrutura atual do jogo.
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
    System.out.println("Jogador mudou o futuro do jogo");
  }
}
