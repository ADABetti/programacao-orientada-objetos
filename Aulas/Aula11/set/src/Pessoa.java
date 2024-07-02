public class Pessoa {
  private String nome;
  private String cpf;

  public Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  @Override
  public boolean equals(Object object) {
    if (object instanceof Pessoa) {
      Pessoa pessoa = (Pessoa) object;
      if (pessoa.cpf.equals(this.cpf)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Integer.parseInt(this.cpf);
  }

  @Override
  public String toString() {
    return String.format(
        """
            Nome: %s,
            CPF: %s
            """,
        this.nome,
        this.cpf);
  }
}
