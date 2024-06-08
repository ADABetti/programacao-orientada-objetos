package escola;

public class Aluno extends Usuario {
  private String matricula;

  // Constructor:
  public Aluno() {
    super("Mateus", "mateus@gmail.com");
    this.matricula = "12341234";
  }

  // getter and setter:
  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  // Sobrescrever método exibirInfo:
  @Override
  public void exibirInfo() {
    System.out.println(String.format(
        """
            Nome do usuário: %s,
            E-mail do usuário: %s
            Matrícula do usuário: %s,
              """, super.getNome(), super.getEmail(), this.matricula));
  }

  // Sobrecarregar o método exibirInfo:
  public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
    if (exibirNome && exibirEmail && exibirMatricula) {
      super.exibirInfo();
      return;
    }
    this.exibirInfo();
  }
}
