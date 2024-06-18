package eventos;

public final class StandUp extends Evento {
  private String comediante;

  // Constructor:
  public StandUp() {
    super("Comédia ao Vivo", "McDonalds do ABC", "19/6");
    this.comediante = "Toninho";
  }

  // Setter and getter:
  public String getComediante() {
    return this.comediante;
  }

  public void setComediante(String comediante) {
    this.comediante = comediante;
  }

  // Sobrescrever métodos:
  @Override
  public void exibirInformacoes() {
    System.out.println(
        String.format(
            """
                  O evento %s, acontecerá em %s, no dia %s, com o comediante %s.

                """, super.getNome(), super.getLocal(), super.getData(), this.comediante));
  }

  @Override
  public void comecarEvento() {
    System.out.println("O evento começou");
  };

  // SObrecarregar método:
  public void comecarEvento(String piada) {
    System.out.println(piada);
  }
}
