package veiculos;

public class Carro implements Veiculo {
  private String modelo;
  private String marca;
  private double potencia;
  private int quantidadePortas;
  private boolean ehSedan;

  // constructor:
  public Carro(String modelo, int quantidadePortas, boolean ehSedan) {
    this.modelo = modelo;
    this.quantidadePortas = quantidadePortas;
    this.ehSedan = ehSedan;
  }

  // getters e setters:
  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getPotencia() {
    return this.potencia;
  }

  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public int getQuantidadePortas() {
    return this.quantidadePortas;
  }

  public void setQuantidadePortas(int quantidadePortas) {
    this.quantidadePortas = quantidadePortas;
  }

  public boolean getEhSedan() {
    return this.ehSedan;
  }

  public void setEhSedan(boolean ehSedan) {
    this.ehSedan = ehSedan;
  }

  // métodos da interface:
  @Override
  public void acelerar() {
    System.out.println(this.modelo + " acelerou.");
  }

  @Override
  public void frear() {
    System.out.println(this.modelo + " freou");
  }
}
