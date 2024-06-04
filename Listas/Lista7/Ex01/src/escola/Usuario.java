package escola;

public class Usuario {
  private String nome;
  private String email;

  // Constructor:
  public Usuario(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  // getter e setters:

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void exibirInfo() {
    System.out.println(String.format(
        """
            Nome do usuário: %s,
            E-mail do usuário: %s
            """, this.nome, this.email));
  }
}