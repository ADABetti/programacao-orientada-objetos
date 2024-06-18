package eventos;

// classe abstrata:
public abstract class Evento {
  private String nome;
  private String local;
  private String data;

  // Constructor:
  public Evento(String nome, String local, String data) {
    this.nome = nome;
    this.local = local;
    this.data = data;
  }

  // getters and setters:
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLocal() {
    return this.local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  // Métodos:
  public void exibirInformacoes() {
    System.out.println(
        String.format(
            """
                O evento %s, acontecerá em %s, no dia %s.
                """, this.nome, this.local, this.data));
  }

  public abstract void comecarEvento();
}
