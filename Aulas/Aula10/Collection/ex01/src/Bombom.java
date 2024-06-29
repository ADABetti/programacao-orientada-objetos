public class Bombom {
  private String nome;

  // Constructor:
  public Bombom(String nome) {
    this.nome = nome;
  }

  // Get
  public String getNome() {
    return this.nome;
  }

  // Sobrescrevendo o método "equals" do Object:
  @Override
  public boolean equals(Object objeto) { // manter a mesma assinatura
    // Verifica se o método equals da superclasse retorna verdadeiro pra ver se o
    // hashcode é igual.
    if (super.equals(objeto)) {
      return true;
    }

    if (objeto instanceof Bombom) {
      Bombom bombom = (Bombom) objeto;
      if (bombom.getNome().equals((this.nome))) {
        return true;
      }
    }
    return false;
  }
}
