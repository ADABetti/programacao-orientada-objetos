package carta;

public abstract class Carta {
  protected String nome; // usa-se o protected para que os filhos tenham acesso
  protected boolean revelada;

  // Constructor
  public Carta(String nome) {
    this.nome = nome;
  }

  public void exibirInformacoes() {
    System.out.println(String.format(
        """
            Nome: %s,
            Revelada: %s
            """, nome, revelada));
  }

  // Não pode ser instanciado, somente herdado pelos filhos
  public abstract void realizarAcao();

}
