package locadora;

import java.util.List;

public class Filme implements Audiovisual {
  private String titulo;
  private String diretor;
  private List<String> atores;

  // Constructor:
  public Filme(String titulo, String diretor, List<String> atores) {
    this.titulo = titulo;
    this.diretor = diretor;
    this.atores = atores;
  }

  // Getter e setter:
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDiretor() {
    return this.diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  public List<String> getAtores() {
    return this.atores;
  }

  public void setAtores(List<String> atores) {
    this.atores = atores;
  }

  // Sobrescrevendo o método exibirInfo da interface:
  @Override
  public void exibirInfo() {
    System.out.println(
        String.format("""
            O nome do filme é %s,
            do diretor %s,
            e atores %s.
            """,
            this.titulo, this.diretor, String.join(", ", this.atores)));
  }
}
