package locadora;

public class Jogo implements Audiovisual {
  private String titulo;
  private String plataforma;

  @Override
  public String toString() {
    return this.getTitulo();
  }

  // COnstructor:
  public Jogo(String titulo, String plataforma) {
    this.titulo = titulo;
    this.plataforma = plataforma;
  }

  // Getter e setter:
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getPlataforma() {
    return this.plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  // Sobrescrever método da interface:
  @Override
  public void exibirInfo() {
    System.out.println(String.format(
        """
            O jogo %s, funciona na plataforma %s.
            """, this.titulo, this.plataforma));
  }
}
