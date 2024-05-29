package veiculos;

public class Trem implements Veiculo {
  private int numeroVagoes;
  private int capacidade;

  // Constructor:
  public Trem(int numeroVagoes, int capacidade) {
    this.numeroVagoes = numeroVagoes;
    this.capacidade = capacidade;
  }

  // getters and setters:
  public int getNumeroVagoes() {
    return this.numeroVagoes;
  }

  public void setNumeroVagoes(int numeroVagoes) {
    this.numeroVagoes = numeroVagoes;
  }

  public int getCapacidade() {
    return this.capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  // métodos da interface:
  @Override
  public void acelerar() {
    System.out.println("fiu fiu fiu");
  }

  @Override
  public void frear() {
    System.out.println("stop");
  }
}
