package escola;

public class Professor extends Usuario {
  private String disciplina;

  // constructor:
  public Professor() {
    super("Mario", "mario2000@gmail.com");
    this.disciplina = "Matemática";
  }

  // Getter e setter:
  public String getDisciplina() {
    return this.disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  // Sobrescrever método exibirInfo:
  @Override
  public void exibirInfo() {
    System.out.println(String.format(
        """
            Nome do usuário: %s,
            E-mail do usuário: %s
            Disciplina do usuário: %s
            """, super.getNome(), super.getEmail(), this.disciplina));
  }

  // Sobrecarregar método exibirInfo:
  public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
    if (exibirNome && exibirEmail && exibirDisciplina) {
      super.exibirInfo();
      return;
    }
    this.exibirInfo();
  }
}
