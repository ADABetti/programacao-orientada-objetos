package animais;

public class Gato implements Animal {

  private String nome;
  private String raca;
  private boolean temPedigree;
  private double peso;

  // Construtor:
  public Gato(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  // getters e setters:
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRaca() {
    return this.raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public boolean getTemPedigree() {
    return this.temPedigree;
  }

  public void setTemPedigree(boolean temPedigree) {
    this.temPedigree = temPedigree;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  // métodos da interface:
  @Override
  public void comer() {
    System.out.println(this.nome + " comeu whikas");
  }

  @Override
  public void emitirSom() {
    System.out.println("miau... miau");
  }
}
