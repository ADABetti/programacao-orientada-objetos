package animais;

public class Cachorro implements Animal {

  private String nome;
  private String porte;

  // Constructor:
  public Cachorro(String nome, String porte) {
    this.nome = nome;
    this.porte = porte;
  }

  // getters e setters:
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPorte() {
    return this.porte;
  }

  public void setPorte(String porte) {
    this.porte = porte;
  }

  // métodos da interface:
  @Override
  public void comer() {
    System.out.println(this.nome + " comeu Golden.");
  }

  @Override
  public void emitirSom() {
    System.out.println("woof woof");
  }
}
